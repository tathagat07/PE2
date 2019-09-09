package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Problem1Test {
    private static Problem1 problem1;

    @BeforeClass
    public static void setUp() {
        problem1 = new Problem1();
    }

    @AfterClass
    public static void tearDown() {

        problem1 = null;
    }

    @Test
    public void UTC_01_validInput()

    {
        int expected = 54321;
        int actual = problem1.reverse(12345);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void UTC_03_validInput()

    {
        int expected = 24321;
        int actual = problem1.reverse(12345);

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void UTC_04_validInput()

    {
        int actual = problem1.reverse(12345);
        Assert.assertNotNull(actual);
    }
    @Test
    public void UTC_02_palindrome(){
        int expected = 12321;
        int actual = problem1.reverse(12321);

        Assert.assertEquals(expected, actual);
    }
}