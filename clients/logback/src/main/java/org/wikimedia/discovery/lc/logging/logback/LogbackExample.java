package org.wikimedia.discovery.lc.logging.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.wikimedia.discovery.lc.logging.common.LogExample;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public class LogbackExample {

    private static final Logger log = LoggerFactory.getLogger(LogbackExample.class);
    public static final Marker CONFIDENTIAL = MarkerFactory.getMarker("CONFIDENTIAL");

    @LogExample
    public void example() {
        log.warn("A Logback warning (well, Slf4j, but you know...)");
    }

    @LogExample
    @SuppressFBWarnings(
            value = {"SLF4J_FORMAT_SHOULD_BE_CONST", "LO_APPENDED_STRING_IN_FORMAT_STRING"},
            justification = "Crappy example on purpose")
    public void placeholders() {
        int i = 1;
        log.warn("i = " + i);
        log.warn("i = {}", i);
    }

    @LogExample
    public void mdc() {
        String user = authenticate();

        try (MDC.MDCCloseable mdc = MDC.putCloseable("user", user)) {
            MDC.put("IP", "10.0.0.1");

            doSomethingWhichLogs();

            MDC.remove("IP");
        }
    }

    @SuppressFBWarnings(
            value = "MRC_METHOD_RETURNS_CONSTANT",
            justification = "yep, this is just an example")
    private String authenticate() {
        return "my_user";
    }

    private void doSomethingWhichLogs() {
        log.warn("Something was done.");
    }

    @LogExample
    public void markers() {
        log.warn(CONFIDENTIAL, "some confidential message");
    }

}
