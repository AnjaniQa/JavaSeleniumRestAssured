package Revision.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "DP")
    public Object[][] dataProviderMethod() {
        return new Object[][] {{"Test1"}, {"Test2"}};
    }

    @Test(dataProvider =  "DP")
    public void test1(String s) {
        System.out.println(s);
    }
}
