package Revision.Selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void testExplicitWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By classLocator = By.tagName("textarea");
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(classLocator));
        System.out.println(webElement.getTagName());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
