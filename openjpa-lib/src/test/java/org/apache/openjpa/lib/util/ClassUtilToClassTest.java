package org.apache.openjpa.lib.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassUtilToClassTest {
    private final String str;
    private final boolean resolve;
    private final ClassLoader loader;
    private final Class<?> clazz;
    private final Class<? extends Throwable> expectedException;

    public ClassUtilToClassTest(String str, boolean resolve, ClassLoader loader, Class<?> clazz, Class<? extends Throwable> expectedException) {
        this.str = str;
        this.resolve = resolve;
        this.loader = loader;
        this.clazz = clazz;
        this.expectedException = expectedException;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // toClass method input
                {"java.util.ArrayList", false, ClassLoader.getSystemClassLoader(), ArrayList.class, null},
                {"byte", false, ClassLoader.getSystemClassLoader(), byte.class, null},
                {"bite", false, ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {"java.util.arraylist", false, ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {null, false, ClassLoader.getSystemClassLoader(), null, NullPointerException.class},
                {"", false, ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {"java.util.ArrayList", false, null, ArrayList.class, null},
                {"byte", false, null, byte.class, null},
                {"bite", false, null, null, RuntimeException.class},
                {"java.util.arraylist",false,  null, null, RuntimeException.class},
                {null, false, null, null, NullPointerException.class},
                {"", false, null, null, RuntimeException.class},

                // toClass2 method input
                {"java.util.ArrayList", true, ClassLoader.getSystemClassLoader(), ArrayList.class, null},
                {"byte", true, ClassLoader.getSystemClassLoader(), byte.class, null},
                {"bite", true, ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {"java.util.arraylist", true, ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {null, true, ClassLoader.getSystemClassLoader(), null, NullPointerException.class},
                {"", true, ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {"java.util.ArrayList", true, null, ArrayList.class, null},
                {"byte", true, null, byte.class, null},
                {"bite", true, null, null, RuntimeException.class},
                {"java.util.arraylist", true, null, null, RuntimeException.class},
                {null, true, null, null, NullPointerException.class},
                {"", true, null, null, RuntimeException.class},
        });
    }

    @Test
    public void testToClass() {
        if (expectedException == null) {
            // Test before toClass without boolean param
            Assert.assertEquals(clazz, ClassUtil.toClass(str, loader));

            // Test to class with boolean param
            Assert.assertEquals(clazz, ClassUtil.toClass(str, resolve, loader));

        } else {
            Assert.assertThrows(expectedException, () -> ClassUtil.toClass(str, loader));
        }
    }

    // Inner class added only for test
    private static class MyClass {
        public static class MyInnerClass {

        }
    }
}
