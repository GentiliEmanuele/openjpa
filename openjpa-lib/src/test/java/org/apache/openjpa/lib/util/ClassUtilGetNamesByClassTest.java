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
public class ClassUtilGetNamesByClassTest {
    private final Class<?> czz;
    private final String expectedClassName;
    private final String expectedPackageName;

    public ClassUtilGetNamesByClassTest(Class<?> czz, String expectedName, String expectedPackageName) {
        this.czz = czz;
        this.expectedClassName = expectedName;
        this.expectedPackageName = expectedPackageName;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {ArrayList.class, "ArrayList", "java.util"},
                {byte.class, "byte", ""},
                {null, null, null},
                {MyClass.MyInnerClass.class, "ClassUtilGetNamesByClassTest$MyClass$MyInnerClass", "org.apache.openjpa.lib.util"},
        });
    }

    @Test
    public void testGetClassName() {
        // This test the name of the class
        String className = ClassUtil.getClassName(czz);
        Assert.assertEquals(expectedClassName, className);

        // This test the name of the package
        String packageName = ClassUtil.getPackageName(czz);
        Assert.assertEquals(expectedPackageName, packageName);
    }

    // Inner class added only for test
    private static class MyClass {
        public static class MyInnerClass {

        }
    }
}
