package Revision.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestSeleniumWaits {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.web.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testImplicitWaitViaPageLoadTimeout() {
        driver.get("https://www.google.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(By.id("abcd"));
        driver.get("https://www.javatpoint.com/");
    }

    @Test
    public void testImplicitWaitViaSetScriptTimeout() {
        driver.get("https://www.google.com/");
        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
        driver.findElement(By.id("abcd"));
        driver.get("https://www.javatpoint.com/");
    }

    @Test
    public void testImplicitWaitViaImplicitWait() {
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.id("abcd"));
        driver.get("https://www.javatpoint.com/");
    }

    @Test
    public void testExplicitWait() {
        driver.get("https://www.google.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abcd")));
        driver.findElement(By.id("abcd"));
    }

}
