package Revision.Selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWait {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testimplicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.id("id"));
        driver.findElement(By.className("gNO89b"));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
