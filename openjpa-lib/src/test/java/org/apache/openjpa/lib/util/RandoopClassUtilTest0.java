package org.apache.openjpa.lib.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopClassUtilTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test01");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test02");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test03");
        java.lang.Class class0 = null;
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName(class0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test04");
        java.lang.Class class0 = null;
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName(class0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test05");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test06");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("hi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test07");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test08");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("hi!", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test09");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("java.lang", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test10");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test11");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("java.lang", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test12");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("java.lang", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test13");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test14");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("java", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test15");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("Object");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Object" + "'", str1, "Object");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test16");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test17");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("java", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test18");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test19");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test20");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("hi!", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test21");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("Object");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test22");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("Object", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test23");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("java", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test24");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test25");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test26");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getClassName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test27");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Object" + "'", str8, "Object");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Object" + "'", str11, "Object");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Object" + "'", str12, "Object");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test28");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test29");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("lang", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test30");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("lang", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test31");
        java.lang.String str1 = org.apache.openjpa.lib.util.ClassUtil.getPackageName("lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test32");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Object" + "'", str11, "Object");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test33");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class2 = org.apache.openjpa.lib.util.ClassUtil.toClass("Object", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test34");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("Object", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test35");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Object" + "'", str8, "Object");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test36");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.apache.openjpa.lib.util.ClassUtil.toClass("lang", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test37");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Object" + "'", str8, "Object");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Object" + "'", str10, "Object");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test38");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Object" + "'", str5, "Object");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test39");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Object" + "'", str5, "Object");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test40");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Object" + "'", str10, "Object");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test41");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test42");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Object" + "'", str10, "Object");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test43");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test44");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object" + "'", str2, "Object");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Object" + "'", str4, "Object");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test45");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Object" + "'", str3, "Object");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test46");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Object" + "'", str10, "Object");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Object" + "'", str11, "Object");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test47");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Object" + "'", str8, "Object");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test48");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Object" + "'", str8, "Object");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test49");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Object" + "'", str8, "Object");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Object" + "'", str10, "Object");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test50");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Object" + "'", str9, "Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Object" + "'", str11, "Object");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test51");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str12 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str13 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Object" + "'", str10, "Object");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Object" + "'", str11, "Object");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Object" + "'", str12, "Object");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Object" + "'", str13, "Object");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test52");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Object" + "'", str6, "Object");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test53");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopClassUtilTest0.test54");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str10 = org.apache.openjpa.lib.util.ClassUtil.getPackageName((java.lang.Class) wildcardClass1);
        java.lang.String str11 = org.apache.openjpa.lib.util.ClassUtil.getClassName((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Object" + "'", str7, "Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Object" + "'", str11, "Object");
    }
}

