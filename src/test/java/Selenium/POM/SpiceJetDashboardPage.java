package Selenium.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpiceJetDashboardPage extends SeleniumPageObject {

    WebDriver driver;

    SpiceJetDashboardPage(WebDriver driver) {
        super(driver, By.id("react-root"));
    }

    public void selectLogin() {
        driver.findElement(By.className("css-76zvg2")).click();
    }

    @Override
    public void waitForPageToLoad() {
        super.waitForPageToLoad();
        ElementUtils.waitForElementToBePresent(driver, By.className("carousel-container"));

    }


}
