package org.wikimedia.discovery.lc.logging.jcl;


import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.wikimedia.discovery.lc.logging.common.ExampleRunner;

public class JclTests {

    @Test
    public void runExamples() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        new ExampleRunner().runExamples();
    }

}
