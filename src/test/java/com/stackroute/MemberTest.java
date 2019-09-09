package com.stackroute;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    private static Member member;
    @BeforeClass
    public static void setUp() throws Exception{
     member = new Member();
    }
    @AfterClass
    public static void tearDown() throws Exception{

    }
    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void getSalary() {
    }

    @Test
    public void setSalary() {
    }

    @Test
    public void displayDetails() {
     String expected = "tathagat2150000.0";
      member.setName("tathagat");
      member.setAge(21);
      member.setSalary(50000);
     String actual = member.displayDetails();
 Assert.assertEquals(expected,actual);
    }
}