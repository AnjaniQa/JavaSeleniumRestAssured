package Selenium.TestData.FileBased;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utils.ConfigUtils;

public class TestClass {

    String user = ConfigUtils.getValue("USERNAME", null);
    String password = ConfigUtils.getValue("PASSWORD", null);

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() {
        driver.get("https://www.google.com/");
        System.out.println(user);
        System.out.println(password);
        driver.close();
    }
}
