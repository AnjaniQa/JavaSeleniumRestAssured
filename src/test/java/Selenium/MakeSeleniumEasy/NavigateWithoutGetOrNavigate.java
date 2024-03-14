package Selenium.MakeSeleniumEasy;

import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigateWithoutGetOrNavigate {

    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void navigateWithoutGetOrNavigate() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

    }

}
