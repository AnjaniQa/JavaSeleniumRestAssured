package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass {

    @Test
    @Parameters({"name","password"})
    public void testParameters(String name, String password) {
        System.out.println(name);
        System.out.println(password);
    }
}
