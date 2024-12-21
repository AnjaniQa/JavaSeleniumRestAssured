package Revision.TestNG;

import org.testng.annotations.*;

public class TestNG {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void test1() {
        System.out.println("Test");
    }

    @Test
    public void test2() {
        System.out.println("Test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
}
