package org.wikimedia.discovery.lc.logging.jul;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.LogManager;

import org.junit.Test;
import org.wikimedia.discovery.lc.logging.common.ExampleRunner;

public class JulTests {

    @Test
    public void runExamples() throws InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(getClass().getResourceAsStream("/jul.properties"));
        new ExampleRunner().runExamples();
    }

}
