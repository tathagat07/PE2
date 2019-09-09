package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Problem2Test {
    private static Problem2 problem2;
    @BeforeClass
    public static void setUp() throws Exception {
        problem2 = new Problem2();
    }

    @AfterClass
    public static void tearDown() throws Exception {
    }

    @Test
    public void UTC_01_validInput()

    {
        int expected = 1;
        int actual = problem2.powerOfFour(64);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void UTC_02_validInput()

    {
        int expected = 1;
        int actual = problem2.powerOfFour(63);

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void UTC_03_validInput()

    {
        int actual = problem2.powerOfFour(64);
        Assert.assertNotNull(actual);
    }
}