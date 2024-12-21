package Revision.TestNG;

import org.testng.annotations.Test;

public class ConfigUtilsTestData {

    @Test
    public void test() {
        String name = ConfigUtils.getValue("NAME");
        System.out.println(name);
    }
}
