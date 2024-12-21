package Revision.Selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.function.Predicate;

public class FluentWaitUsingPredicate {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void testFluentWaitUsingPredicate() {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);


        Predicate<WebDriver> predicate = new Predicate<WebDriver>() {
            @Override
            public boolean test(WebDriver driver) {
                WebElement webElement = driver.findElement(By.tagName("textareaaa"));
                if(webElement.getAttribute("class").equals("gLFyf")) {
                    return true;
                }
                return false;
            }
        };
        //wait.until(predicate);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
