package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @DataProvider(name="testData")
    public Object[][] getData() {
        return new Object[][] {
                {"data1"},
                {"data2"},
                {"data3"}
        };
    }

    @Test(dataProvider="testData")
    public void login(String data) {
        System.out.println(data);
    }
}
