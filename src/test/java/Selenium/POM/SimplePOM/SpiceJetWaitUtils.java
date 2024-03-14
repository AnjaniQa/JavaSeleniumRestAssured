package Selenium.POM.SimplePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.function.Function;

public class SpiceJetWaitUtils {

    public static void waitForPageLocatorToBePresent(WebDriver driver, By pageLocator) {

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        ExpectedCondition<Boolean> condition = getCondition(pageLocator);
        wait.until(condition);
    }

    public static ExpectedCondition<Boolean> getCondition(By locator) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    driver.findElement(locator);
                    return true;
                } catch(Exception e) {
                    System.out.println(e);
                    return false;
                }
            }
        };
    }

    public static void waitForPageLocatorToBePresentUsingFunctionInterface(WebDriver driver, By pageLocator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(pageLocator);
            }
        });
    }
}
