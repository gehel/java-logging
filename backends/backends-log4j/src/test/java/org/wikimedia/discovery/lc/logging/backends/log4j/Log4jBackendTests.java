package org.wikimedia.discovery.lc.logging.backends.log4j;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.wikimedia.discovery.lc.logging.common.ExampleRunner;

public class Log4jBackendTests {

    @Test
    public void log4j() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        new ExampleRunner().runExamples();
    }
}
