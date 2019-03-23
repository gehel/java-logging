package org.wikimedia.discovery.lc.logging.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wikimedia.discovery.lc.logging.common.LogExample;

public class Log4J2Example {

    private static final Logger log = LogManager.getLogger(Log4J2Example.class);

    @LogExample
    public void example() {
        log.warn("A Log4J2 warning");
    }

    @LogExample
    public void lambda() {
        log.warn("A lambda example: {}", () -> expensiveCall(10));
    }

    private String expensiveCall(int n) {
        StringBuilder message = new StringBuilder("an expensive object to construct: ");
        for (int i = 0; i < n; i++) message.append('X');
        return message.toString();
    }
}
