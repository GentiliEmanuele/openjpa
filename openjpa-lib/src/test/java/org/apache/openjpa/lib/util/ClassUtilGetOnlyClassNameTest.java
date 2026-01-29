package org.apache.openjpa.lib.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassUtilGetOnlyClassNameTest {
    private final String fullClassName;
    private final String expectedClassName;

    public ClassUtilGetOnlyClassNameTest(String fullClassName, String expectedClassName) {
        this.fullClassName = fullClassName;
        this.expectedClassName = expectedClassName;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"java.util.ArrayList", "ArrayList"},
                {"ArrayList", "ArrayList"},
                {"java.util.arraylist", "arraylist"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testGetOnlyClassName() {
        Assert.assertEquals(expectedClassName, ClassUtil.getClassName(fullClassName));
    }
}
