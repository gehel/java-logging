package org.wikimedia.discovery.lc.logging.slf4j;


import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.wikimedia.discovery.lc.logging.common.ExampleRunner;

public class Slf4jTests {

    @Test
    public void runExamples() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        new ExampleRunner().runExamples();
    }

}
