package Selenium.POM.SimplePOM;

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

public class SpiceJetDashboardPage {

    WebDriver driver;

    By pageLocator = By.id("react-root");

    public SpiceJetDashboardPage(WebDriver driver) {
        this.driver = driver;
        SpiceJetWaitUtils.waitForPageLocatorToBePresent(driver, pageLocator);
        PageFactory.initElements(driver, this);
    }

    public void waitForPageLocatorToBePresentUsingFunctionInterface(WebDriver driver, By pageLocator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement webElement = wait.until(new Function<WebDriver , WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(pageLocator);
            }
        });
    }

    public LoginPage selectLogin() {
        driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar']")).click();
        return new LoginPage(driver);
    }
}
