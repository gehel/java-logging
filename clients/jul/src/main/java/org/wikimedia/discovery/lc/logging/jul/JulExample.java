package org.wikimedia.discovery.lc.logging.jul;

import java.util.logging.Logger;

import org.wikimedia.discovery.lc.logging.common.LogExample;

/**
 * java.util.logging was introduced in Java 1.4.
 */
public class JulExample {

    private static final Logger log = Logger.getLogger(JulExample.class.getName());

    @LogExample
    public void example() {
        log.warning("A JUL warning");
    }

}
