package Revision.Selenium.Waits;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitUsingFunctionInterface {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void testFluentWaitUsingFunctionInterfaceWebElementReturnType() {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        Function<WebDriver, WebElement> func = new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.tagName("textareaasdf"));
            }
        };
        WebElement webElement = wait.until(func);
        System.out.println(webElement.getTagName());
    }

    @Test
    public void testFluentWaitUsingFunctionInterfaceBooleanReturnType() {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        Function<WebDriver, Boolean> func = new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                WebElement webElement = driver.findElement(By.tagName("textareaaa"));
                if(webElement.getAttribute("class").equals("gLFyf")) {
                    return true;
                }
                return false;
            }
        };
        Boolean b = wait.until(func);
        System.out.println(b);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
