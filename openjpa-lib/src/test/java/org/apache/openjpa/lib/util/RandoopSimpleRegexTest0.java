package org.apache.openjpa.lib.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopSimpleRegexTest0 {

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
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test02");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test03");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test04");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test05");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test06");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        java.lang.Class<?> wildcardClass3 = simpleRegex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test07");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test08");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test09");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test10");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test11");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test12");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test13");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test14");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test15");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("hi!");
        boolean boolean16 = simpleRegex2.matches("hi!");
        boolean boolean18 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass19 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test16");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test17");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test18");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("hi!");
        boolean boolean16 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass17 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test19");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("hi!");
        boolean boolean16 = simpleRegex2.matches("hi!");
        boolean boolean18 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass19 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test20");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test21");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("hi!");
        boolean boolean8 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test22");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test23");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test24");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test25");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test26");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass9 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test27");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("hi!");
        boolean boolean16 = simpleRegex2.matches("hi!");
        boolean boolean18 = simpleRegex2.matches("");
        boolean boolean20 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass21 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test28");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test29");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test30");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("hi!");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test31");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test32");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test33");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test34");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test35");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass13 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test36");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("hi!");
        boolean boolean16 = simpleRegex2.matches("hi!");
        boolean boolean18 = simpleRegex2.matches("");
        boolean boolean20 = simpleRegex2.matches("hi!");
        boolean boolean22 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test37");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test38");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("hi!");
        boolean boolean16 = simpleRegex2.matches("hi!");
        boolean boolean18 = simpleRegex2.matches("");
        boolean boolean20 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass21 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test39");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("hi!");
        boolean boolean16 = simpleRegex2.matches("");
        boolean boolean18 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test40");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test41");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test42");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass7 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test43");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass11 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test44");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test45");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test46");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("");
        boolean boolean16 = simpleRegex2.matches("");
        boolean boolean18 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test47");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("", false);
        boolean boolean4 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass5 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test48");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test49");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("hi!");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("hi!");
        boolean boolean10 = simpleRegex2.matches("");
        boolean boolean12 = simpleRegex2.matches("");
        boolean boolean14 = simpleRegex2.matches("");
        boolean boolean16 = simpleRegex2.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test50");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", false);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopSimpleRegexTest0.test51");
        org.apache.openjpa.lib.util.SimpleRegex simpleRegex2 = new org.apache.openjpa.lib.util.SimpleRegex("hi!", true);
        boolean boolean4 = simpleRegex2.matches("");
        boolean boolean6 = simpleRegex2.matches("");
        boolean boolean8 = simpleRegex2.matches("");
        boolean boolean10 = simpleRegex2.matches("hi!");
        boolean boolean12 = simpleRegex2.matches("hi!");
        boolean boolean14 = simpleRegex2.matches("");
        java.lang.Class<?> wildcardClass15 = simpleRegex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

