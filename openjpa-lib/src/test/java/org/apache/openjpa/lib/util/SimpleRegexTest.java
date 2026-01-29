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
    private final String target;
    private final boolean expectedOutput;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"", true, null, "", true},
                {"", true, null, "xa", false},
                {"", true, null, "xabc", false},
                {"x.", true, null, "", false},
                {"x.", true, null, "xa", true},
                {"x.", true, null, "xabc", false},
                {"x.", true, null, "Xa", true},
                {"x.*", true, null, "", false},
                {"x.*", true, null, "xa", true},
                {"x.*", true, null, "xabc", true},
                {"x.*", true, null, "Xabc", true},
                {"", false, null, "", true},
                {"", false, null, "xa", false},
                {"", false, null, "xabc", false},
                {"x.", false, null, "", false},
                {"x.", false, null, "xa", true},
                {"x.", false, null, "xabc", false},
                {"x.", false, null, "Xa", false},
                {"x.*", false, null, "", false},
                {"x.*", false, null, "xa", true},
                {"x.*", false, null, "xabc", true},
                {"x.*", false, null, "Xabc", false},
                {null, false, NullPointerException.class, "Xabc", false},
                // Added after Jacoco interaction
                {".*abc", true, null, "ab", false},
                // Added after Pit interaction
                {"A.*B.*", false, null, "A---b---", false}
        });
    }

    public SimpleRegexTest(String expr, boolean caseSensitive, Class<? extends Throwable> expectedException, String target, boolean expectedOutput) {
        this.expr = expr;
        this.caseSensitive = caseSensitive;
        this.expectedException = expectedException;
        this.target = target;
        this.expectedOutput = expectedOutput;
    }

    @Test
    public void simpleRegexTest() {
        if (expectedException == null) {
            SimpleRegex regex = new SimpleRegex(expr, caseSensitive);
            // Test constructor
            Assert.assertNotNull(regex);
            // Assert.assertTrue(regex.matches(expr));

            // Test match
            boolean actualOutput = regex.matches(target);
            Assert.assertEquals(expectedOutput, actualOutput);
        } else {
            Assert.assertThrows(expectedException, () -> {
                SimpleRegex regex = new SimpleRegex(expr, caseSensitive);
                // Test match
                boolean actualOutput = regex.matches(target);
                Assert.assertEquals(expectedOutput, actualOutput);
            });
        }
    }

}
