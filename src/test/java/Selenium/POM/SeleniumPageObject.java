package Selenium.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageObject {

    By pageLocator;
    WebDriver driver;

    SeleniumPageObject(WebDriver driver, By pageLocator) {
        this.driver = driver;
        this.pageLocator = pageLocator;
    }

    public void waitForPageToLoad() {
        getPageRoot();
    }

    public WebElement getPageRoot() {
        return driver.findElement(pageLocator);
    }

    public static <T extends SeleniumPageObject> T createPage(WebDriver driver, Class<T> type) {
        T pageObject = null;
        try {
            pageObject = PageFactory.initElements(driver, type);
        } catch(Exception e) {
            System.out.println(e);
        }
        pageObject.waitForPageToLoad();
        return pageObject;
    }
}
