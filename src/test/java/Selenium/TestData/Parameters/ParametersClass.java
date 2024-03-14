package Selenium.TestData.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersClass {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @Parameters({"name", "password"})
    public void testLogin(String name, String password) throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.tagName("username")).sendKeys(name);
        driver.findElement(By.tagName("password")).sendKeys(password);
        Thread.sleep(2000);
        driver.close();
    }
}
