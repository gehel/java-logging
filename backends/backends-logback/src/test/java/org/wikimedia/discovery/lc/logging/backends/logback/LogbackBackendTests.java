package org.wikimedia.discovery.lc.logging.backends.logback;

import static java.util.logging.Level.FINEST;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

import org.junit.Test;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.wikimedia.discovery.lc.logging.common.ExampleRunner;

public class LogbackBackendTests {

    @Test
    public void runExamples() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        Logger.getLogger("").setLevel(FINEST);
        new ExampleRunner().runExamples();
    }

}
