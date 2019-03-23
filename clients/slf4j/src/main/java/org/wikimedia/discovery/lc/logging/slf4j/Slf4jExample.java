package org.wikimedia.discovery.lc.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wikimedia.discovery.lc.logging.common.LogExample;

public class Slf4jExample {

    private static final Logger log = LoggerFactory.getLogger(Slf4jExample.class);

    @LogExample
    public void example() {
        log.warn("A Slf4j warning");
    }

}
