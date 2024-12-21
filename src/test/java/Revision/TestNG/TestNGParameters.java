package Revision.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

    @Test
    @Parameters({"x", "y"})
    public void add(String x, String y) {
        System.out.println(x+y);
    }
}
