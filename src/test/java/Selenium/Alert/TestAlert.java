package Selenium.Alert;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAlert {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSimpleAlert() {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertButton")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        simpleAlert.accept();
        driver.close();
    }

    @Test
    public void testPromptAlert() {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        WebElement webElement = driver.findElement(By.id("promtButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
        webElement.click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Aman");
        promptAlert.accept();
        driver.close();
    }

    @Test
    public void testConfirmationAlert() {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        WebElement webElement = driver.findElement(By.id("confirmButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
        webElement.click();
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        confirmationAlert.accept();
        driver.close();
    }
}
