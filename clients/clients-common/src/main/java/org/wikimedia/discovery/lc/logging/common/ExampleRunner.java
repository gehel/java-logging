package org.wikimedia.discovery.lc.logging.common;

import static org.reflections.util.ClasspathHelper.forPackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ConfigurationBuilder;

public class ExampleRunner {

    public void runExamples() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setUrls(forPackage("org.wikimedia.discovery.lc.logging"))
                .setScanners(new TypeAnnotationsScanner(), new MethodAnnotationsScanner())
        );

        Set<Method> examples = reflections.getMethodsAnnotatedWith(LogExample.class);

        for (Method exampleMethod : examples) {
            Class<?> exampleClass = exampleMethod.getDeclaringClass();
            Object example = exampleClass.newInstance();
            exampleMethod.invoke(example);
        }

    }
}
