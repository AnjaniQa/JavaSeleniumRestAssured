package Selenium.TestData.DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestDataProvider {

    @DataProvider(name = "searchProvider")
    public Object[][] getDataFromDataProvider() {
        return new Object[][] {
                {"user1", "pass1"},
                {"user2", "pass2"}

        };
    }

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test(dataProvider = "searchProvider")
    public void testLogin(String name, String password) {
        System.out.println(name);
        System.out.println(password);
    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
