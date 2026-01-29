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
public class ClassUtilTest {
    private final String str;
    private final ClassLoader loader;
    private final Class<?> clazz;
    private final Class<? extends Throwable> expectedException;

    public ClassUtilTest(String str, ClassLoader loader, Class<?> clazz, Class<? extends Throwable> expectedException) {
        this.str = str;
        this.loader = loader;
        this.clazz = clazz;
        this.expectedException = expectedException;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"java.util.ArrayList", ClassLoader.getSystemClassLoader(), ArrayList.class, null},
                {"byte", ClassLoader.getSystemClassLoader(), byte.class, null},
                {"bite", ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {"java.util.arraylist", ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {null, ClassLoader.getSystemClassLoader(), null, NullPointerException.class},
                {"", ClassLoader.getSystemClassLoader(), null, RuntimeException.class},
                {"java.util.ArrayList", null, ArrayList.class, null},
                {"byte", null, byte.class, null},
                {"bite", null, null, RuntimeException.class},
                {"java.util.arraylist", null, null, RuntimeException.class},
                {null, null, null, NullPointerException.class},
                {"", null, null, RuntimeException.class},
        });
    }

    @Test
    public void testToClass() {
        if (expectedException == null) {
            Assert.assertEquals(clazz, ClassUtil.toClass(str, loader));
        } else {
            Assert.assertThrows(expectedException, () -> ClassUtil.toClass(str, loader));
        }
    }
}
