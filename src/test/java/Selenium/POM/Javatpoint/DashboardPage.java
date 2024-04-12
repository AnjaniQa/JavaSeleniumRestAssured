package Selenium.POM.Javatpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class DashboardPage {

    WebDriver driver;

    By pageLocator = By.id("link");

    DashboardPage(WebDriver driver) {
        this.driver = driver;
        waitForLocatorToBePresent(pageLocator);
        PageFactory.initElements(driver, this);
    }

    public void waitForLocatorToBePresent(By pageLocator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(getConditionForLocator(pageLocator));
    }

    public ExpectedCondition<Boolean> getConditionForLocator(By pageLocator) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    driver.findElement(pageLocator);
                    return true;
                } catch(NoSuchElementException e) {
                    return false;
                }
            }
        };
    }

    public void UsingFunctionInterface(By pageLocator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(pageLocator);
            }
        });
    }

}
