package Selenium.Toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testMultipleWindows() {
        driver.get("https://demoqa.com/browser-windows");
        String mainWindow = driver.getWindowHandle();

        By tabElement = By.id("tabButton");
        By windowElement = By.id("tabButton");
        By messageWindowElement = By.id("tabButton");


        driver.findElement(tabElement).click();
        driver.findElement(windowElement).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(messageWindowElement));

        driver.findElement(messageWindowElement).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> itr = windows.iterator();

        while(itr.hasNext()) {
            String childWindow = itr.next();
            if(!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        driver.close();
    }
}
