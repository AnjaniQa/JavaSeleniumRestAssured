package Revision.TestNG;

import org.testng.annotations.Test;

public class AnnotationAttribute {

    @Test(description = "Description")
    public void test1() {
        System.out.println("Description");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(dependsOnMethods = {"test2"})
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(priority = 1)
    public void test4() {
        System.out.println("Test 4");
    }

    @Test(enabled = false)
    public void test5() {
        System.out.println("Test 5");
    }
}
