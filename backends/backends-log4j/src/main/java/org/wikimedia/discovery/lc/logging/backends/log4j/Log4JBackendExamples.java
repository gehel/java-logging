package org.wikimedia.discovery.lc.logging.backends.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.wikimedia.discovery.lc.logging.common.LogExample;

public class Log4JBackendExamples {

    private static final Logger log = Logger.getLogger(Log4JBackendExamples.class);

    @LogExample
    public void simpleMessage() {
        log.debug("A debug level message");
    }

    @LogExample
    public void messageWithMDC() {
        MDC.put("username", "someone");
        log.debug("A message with MDC information");
        MDC.remove("username");

    }

    @LogExample
    public void hierarchyOfLoggers() {
        Logger wikimedia = Logger.getLogger("org.wikimedia");
        Logger slowLog = Logger.getLogger("org.wikimedia.slowqueries");
        Logger deprecation = Logger.getLogger("org.wikimedia.deprecation");
        Logger authentication = Logger.getLogger("org.wikimedia.authentication");

        wikimedia.debug("A debug message");

        slowLog.warn("Slow query message");

        deprecation.error("Deprecation warning");

        MDC.put("username", "someone");
        MDC.put("req.url", "http://example.net/some/url");
        authentication.info("user authenticated");
        authentication.debug("some low level debugging information");
        MDC.remove("req.url");
        MDC.remove("username");


    }
}
