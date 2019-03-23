package org.wikimedia.discovery.lc.logging.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wikimedia.discovery.lc.logging.common.LogExample;

public class JclExample {

    private static final Log log = LogFactory.getLog(JclExample.class);

    @LogExample
    public void example() {
        log.warn("A JCL warning");
    }

}
