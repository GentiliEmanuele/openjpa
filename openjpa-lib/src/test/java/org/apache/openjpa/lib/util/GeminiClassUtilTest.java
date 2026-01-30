package org.apache.openjpa.lib.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class GeminiClassUtilTest {

    // --- Tests for toClass ---

    @Test
    public void testToClassBasic() {
        assertEquals(String.class, ClassUtil.toClass("java.lang.String", null));
        assertEquals(int.class, ClassUtil.toClass("int", null));
    }

    @Test
    public void testToClassArrays() {
        assertEquals(int[].class, ClassUtil.toClass("int[]", null));
        assertEquals(String[][].class, ClassUtil.toClass("java.lang.String[][]", null));
    }

    @Test(expected = NullPointerException.class)
    public void testToClassNullInput() {
        ClassUtil.toClass(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToClassNotFound() {
        ClassUtil.toClass("com.nonexistent.FakeClass", null);
    }

    @Test
    public void testToClassWithResolve() {
        // Test overloaded method with resolve flag
        assertEquals(boolean.class, ClassUtil.toClass("boolean", true, null));
    }

    // --- Tests for getClassName ---

    @Test
    public void testGetClassNameFromClass() {
        assertEquals("String", ClassUtil.getClassName(String.class));
        assertEquals("int[]", ClassUtil.getClassName(int[].class));
        assertNull(ClassUtil.getClassName((Class) null));
    }

    @Test
    public void testGetClassNameFromString() {
        // Standard names
        assertEquals("String", ClassUtil.getClassName("java.lang.String"));
        // Primitive descriptors
        assertEquals("int[]", ClassUtil.getClassName("[I"));
        assertEquals("byte[][]", ClassUtil.getClassName("[[B"));
        // Object descriptors
        assertEquals("Thread", ClassUtil.getClassName("java.lang.Thread"));
        assertEquals("List[]", ClassUtil.getClassName("[Ljava.util.List;"));
        // No package
        assertEquals("MyClass", ClassUtil.getClassName("MyClass"));
        // Empty/Null
        assertEquals("", ClassUtil.getClassName(""));
        assertNull(ClassUtil.getClassName((String) null));
    }

    // --- Tests for getPackageName ---

    @Test
    public void testGetPackageNameFromClass() {
        assertEquals("java.lang", ClassUtil.getPackageName(String.class));
        assertEquals("java.util", ClassUtil.getPackageName(List.class));
        assertNull(ClassUtil.getPackageName((Class) null));
    }

    @Test
    public void testGetPackageNameFromString() {
        assertEquals("java.lang", ClassUtil.getPackageName("java.lang.Object"));
        assertEquals("org.apache.openjpa.lib.util", ClassUtil.getPackageName("org.apache.openjpa.lib.util.ClassUtil"));
        // Primitives/Arrays of primitives have no package
        assertEquals("", ClassUtil.getPackageName("[I"));
        assertEquals("", ClassUtil.getPackageName("int"));
        // Arrays of objects
        assertEquals("java.lang", ClassUtil.getPackageName("[Ljava.lang.String;"));
        // Default package
        assertEquals("", ClassUtil.getPackageName("StandaloneClass"));
        // Empty/Null
        assertEquals("", ClassUtil.getPackageName(""));
        assertNull(ClassUtil.getPackageName((String) null));
    }

    @Test
    public void testComplexArrayHandling() {
        // Verify 3D array of long
        String long3DDescriptor = "[[[J";
        assertEquals("long[][][]", ClassUtil.getClassName(long3DDescriptor));
        assertEquals("", ClassUtil.getPackageName(long3DDescriptor));

        // Verify 2D array of custom object
        String customArray = "[[Lcom.test.Data;";
        assertEquals("Data[][]", ClassUtil.getClassName(customArray));
        assertEquals("com.test", ClassUtil.getPackageName(customArray));
    }
}