package Revision.TestNG;

import org.testng.annotations.Test;

public class ParallelExecution {


    @Test
    public void test1() throws Exception {
        System.out.println("Test 1");
        System.out.println(System.currentTimeMillis());
        Thread.sleep(2000);
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
        System.out.println(System.currentTimeMillis());
    }

}
