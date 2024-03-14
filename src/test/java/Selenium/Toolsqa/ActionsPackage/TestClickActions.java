package Selenium.Toolsqa.ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClickActions {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testIFrame() {
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);
        WebElement rightClickButtonElement = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButtonElement).perform();
        WebElement doubleClickButtonElement = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickButtonElement).perform();

    }
}
