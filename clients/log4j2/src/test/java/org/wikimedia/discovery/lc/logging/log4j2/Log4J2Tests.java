package org.wikimedia.discovery.lc.logging.log4j2;


import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.wikimedia.discovery.lc.logging.common.ExampleRunner;

public class Log4J2Tests {

    @Test
    public void runExamples() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        new ExampleRunner().runExamples();
    }

}
