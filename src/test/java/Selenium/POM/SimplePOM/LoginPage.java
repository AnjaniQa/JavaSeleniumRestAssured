package Selenium.POM.SimplePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    By pageLocator = By.className("css-1dbjc4n");

    LoginPage(WebDriver driver) {
        this.driver = driver;
        SpiceJetWaitUtils.waitForPageLocatorToBePresent(driver, pageLocator);
        PageFactory.initElements(driver, this);
    }

    public void enterMobile(String number) {
       driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys(number);
    }
}
