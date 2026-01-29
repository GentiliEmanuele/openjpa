package org.apache.openjpa.lib.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GeminiSimpleRegexTest {

    private final String expr;
    private final boolean caseInsensitive;
    private final String target;
    private final boolean expectedMatch;
    private final Class<? extends Throwable> expectedException;

    /**
     * Constructor for the parameterized test.
     *
     * @param expr              The regular expression pattern.
     * @param caseInsensitive   Whether the regex is case-insensitive (matches the source constructor arg).
     * @param target            The string to test against the expression.
     * @param expectedMatch     The expected boolean result of matches().
     * @param expectedException The expected exception class (or null if none expected).
     */
    public GeminiSimpleRegexTest(String expr, boolean caseInsensitive, String target, boolean expectedMatch, Class<? extends Throwable> expectedException) {
        this.expr = expr;
        this.caseInsensitive = caseInsensitive;
        this.target = target;
        this.expectedMatch = expectedMatch;
        this.expectedException = expectedException;
    }

    @Parameters(name = "{index}: expr=\"{0}\", caseInsensitive={1}, target=\"{2}\" -> match={3}, ex={4}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // --- Basic Exact Matching ---
                {"abc", false, "abc", true, null},
                {"abc", false, "abd", false, null},
                {"abc", false, "ab", false, null},
                {"abc", false, "abcd", false, null},
                {"", false, "", true, null},
                {"", false, "a", false, null},

                // --- Case Sensitivity ---
                // caseInsensitive = true
                {"abc", true, "ABC", true, null},
                {"ABC", true, "abc", true, null},
                {"AbC", true, "aBc", true, null},
                // caseInsensitive = false
                {"abc", false, "ABC", false, null},

                // --- Single Wildcard '.' (matches any single char) ---
                {"a.c", false, "abc", true, null},
                {"a.c", false, "axc", true, null},
                {"a.c", false, "ac", false, null},   // missing char
                {"a.c", false, "abbc", false, null}, // too many chars
                {".", false, "a", true, null},
                {".", false, "", false, null},

                // --- Sequence Wildcard '.*' (matches 0 or more chars) ---
                // Empty match
                {"a.*c", false, "ac", true, null},
                // Single char match
                {"a.*c", false, "abc", true, null},
                // Multi char match
                {"a.*c", false, "abbbc", true, null},
                // Leading wildcard
                {".*bar", false, "foobar", true, null},
                {".*bar", false, "bar", true, null},
                {".*bar", false, "obar", true, null},
                // Trailing wildcard
                {"foo.*", false, "foobar", true, null},
                {"foo.*", false, "foo", true, null},
                {"foo.*", false, "fo", false, null},
                // Middle wildcards
                {"foo.*bar", false, "foocoldbar", true, null},
                {"foo.*bar", false, "foobar", true, null},

                // --- Multiple Wildcards ---
                {"a.*b.*c", false, "a123b456c", true, null},
                {"a.*b.*c", false, "abc", true, null},
                {"a.*b.*c", false, "ab123c", true, null},
                {".*a.*", false, "123a456", true, null},

                // --- Combination of '.' and '.*' ---
                {"a.b.*", false, "axbanything", true, null},
                {"a.b.*", false, "axb", true, null},
                {"a.b.*", false, "ab", false, null}, // . requires a char

                // --- Complex/Edge Cases ---
                // Trailing exact match requirement
                {"a.*z", false, "abcdefy", false, null},
                // Overlapping patterns (source code logic specific)
                {"x.*x", false, "xcx", true, null},
                {".*.*", false, "abc", true, null}, // adjacent stars

                // --- Exception Handling (Nulls) ---
                // Null expression (caseInsensitive=true triggers toLowerCase on null expr immediately)
                {null, true, "abc", false, NullPointerException.class},
                // Null expression (caseInsensitive=false sets null field, fails later in matches)
                {null, false, "abc", false, NullPointerException.class},
                // Null target (matches calls target.toLowerCase or target.length)
                {"abc", false, null, false, NullPointerException.class}
        });
    }

    @Test
    public void testSimpleRegex() {
        // If we expect an exception during construction or execution
        if (expectedException != null) {
            Assert.assertThrows(expectedException, () -> {
                SimpleRegex regex = new SimpleRegex(expr, caseInsensitive);
                regex.matches(target);
            });
        } else {
            // Normal execution
            SimpleRegex regex = new SimpleRegex(expr, caseInsensitive);
            boolean result = regex.matches(target);
            Assert.assertEquals("Failed for expr=[" + expr + "] target=[" + target + "]", expectedMatch, result);
        }
    }
}