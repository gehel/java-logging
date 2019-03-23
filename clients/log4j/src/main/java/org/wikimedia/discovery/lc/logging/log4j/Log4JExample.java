package org.wikimedia.discovery.lc.logging.log4j;

import org.apache.log4j.Logger;
import org.wikimedia.discovery.lc.logging.common.LogExample;

public class Log4JExample {

    private static final Logger log = Logger.getLogger(Log4JExample.class);

    @LogExample
    public void example() {
        log.warn("A Log4J warning");
    }

}
