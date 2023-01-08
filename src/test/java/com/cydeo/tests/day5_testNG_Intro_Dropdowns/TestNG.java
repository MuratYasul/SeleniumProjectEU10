package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {

    @Test(priority = 1)//we put this to define the priority
    public void test1(){
        System.out.println("Test1 is running");

        //ASSERT EQUALS : compare 2 of the same things. String attribute are normally not necessary.
       String actual="apple";
       String expected = "apple";
       Assert.assertEquals(actual,expected);

    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("Test2 is running");
        //AssertTrue
        String actual="apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));

    }




    @BeforeClass
    public void setupMethod(){
        System.out.println("--->BeforeClass is running");
    }
    @AfterClass
    public void teardownClass(){
        System.out.println("--->AfterClass is running");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--->BeforeMethod is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--->AfterMethod is running");
    }
}