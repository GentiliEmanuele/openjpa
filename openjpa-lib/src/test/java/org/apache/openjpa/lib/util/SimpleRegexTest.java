package org.apache.openjpa.lib.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SimpleRegexTest {

    private final String expr;
    private final boolean caseSensitive;
    private final Class<? extends Throwable> expectedException;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"", true, null},
                {".", true, null},
                {".*", true, null},
                {"", false, null},
                {".", false, null},
                {".*", false, null},
                {null, true, NullPointerException.class}
        });
    }

    public SimpleRegexTest(String expr, boolean caseSensitive, Class<? extends Throwable> expectedException) {
        this.expr = expr;
        this.caseSensitive = caseSensitive;
        this.expectedException = expectedException;
    }

    @Test
    public void constructorTest() {
        if (expectedException == null) {
            SimpleRegex regex = new SimpleRegex(expr, caseSensitive);
            Assert.assertNotNull(regex);
            Assert.assertTrue(regex.matches(expr));
        } else {
            Assert.assertThrows(expectedException, () -> new SimpleRegex(expr, caseSensitive));
        }
    }

}
