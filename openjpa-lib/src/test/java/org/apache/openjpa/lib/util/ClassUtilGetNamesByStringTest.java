package org.apache.openjpa.lib.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassUtilGetNamesByStringTest {
    private final String fullClassName;
    private final String expectedClassName;
    private final String expectedPackageName;

    public ClassUtilGetNamesByStringTest(String fullClassName, String expectedClassName, String expectedPackageName) {
        this.fullClassName = fullClassName;
        this.expectedClassName = expectedClassName;
        this.expectedPackageName = expectedPackageName;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"java.util.ArrayList", "ArrayList", "java.util"},
                {"ArrayList", "ArrayList", ""},
                {"java.util.arraylist", "arraylist", "java.util"},
                {"", "", ""},
                {null, null, null}
        });
    }

    @Test
    public void testGetOnlyClassName() {
        Assert.assertEquals(expectedClassName, ClassUtil.getClassName(fullClassName));
    }
}
