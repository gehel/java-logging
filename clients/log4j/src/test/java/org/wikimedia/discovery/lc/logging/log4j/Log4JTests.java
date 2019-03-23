package org.wikimedia.discovery.lc.logging.log4j;


import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.wikimedia.discovery.lc.logging.common.ExampleRunner;

public class Log4JTests {

    @Test
    public void runExamples() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        new ExampleRunner().runExamples();
    }

}
