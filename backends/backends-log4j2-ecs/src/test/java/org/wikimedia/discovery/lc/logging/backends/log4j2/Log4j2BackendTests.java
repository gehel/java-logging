package org.wikimedia.discovery.lc.logging.backends.log4j2;

import org.apache.logging.log4j.CloseableThreadContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2BackendTests {

    private static final Logger log = LogManager.getLogger(Log4j2BackendTests.class);

    @Test
    public void warning() {
        log.warn("Some warning");
    }

    @Test
    public void mdc() {
        try(CloseableThreadContext.Instance ctc = CloseableThreadContext.put("IP", "10.0.0.1")) {
            log.info("Some info message");
        }
    }

    @Test
    public void exception() {
        try {
            throw new IllegalStateException("Just for test");
        } catch (IllegalStateException ise) {
            log.error("Exception raised", ise);
        }
    }
}
