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
public class ClassUtilGetClassNameTest {
    private final Class<?> czz;
    private final String expectedName;

    public ClassUtilGetClassNameTest(Class<?> czz, String expectedName) {
        this.czz = czz;
        this.expectedName = expectedName;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {ArrayList.class, "ArrayList"},
                {byte.class, "byte"},
                {null, null},
                {MyClass.MyInnerClass.class, "ClassUtilGetClassNameTest$MyClass$MyInnerClass"},
        });
    }

    @Test
    public void testGetClassName() {
        String className = ClassUtil.getClassName(czz);
        Assert.assertEquals(expectedName, className);
    }

    // Inner class added only for test
    private static class MyClass {
        public static class MyInnerClass {

        }
    }
}
