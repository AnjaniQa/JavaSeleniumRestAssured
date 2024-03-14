package Selenium.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ElementUtils {

    public static void waitForElementToBePresent(WebDriver driver, By locator) {

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        ExpectedCondition<Boolean> condition = getExpectedCondition(locator);
        wait.until(condition);

    }


    public static ExpectedCondition getExpectedCondition(By locator) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    driver.findElement(locator);
                    return true;
                } catch (NoSuchElementException e) {
                    return false;
                }
            }
        };
    }
}
