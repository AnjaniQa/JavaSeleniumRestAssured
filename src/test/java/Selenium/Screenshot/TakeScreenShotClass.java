package Selenium.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class TakeScreenShotClass {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testScreenshot() throws Exception {
        driver.get("https://www.google.com/");
        TakesScreenshot tk = (TakesScreenshot) driver;
        File soureFile = tk.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\users\\AnjKumar\\Screenshot.jpg");
        FileUtils.copyFile(soureFile, destinationFile);
    }

    @Test
    public void testScreenshotForFailedTests() throws Exception {
        driver.get("https://www.google.com/");
        TakesScreenshot tk = (TakesScreenshot) driver;
        File soureFile = tk.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\users\\AnjKumar\\Screenshot.jpg");
        FileUtils.copyFile(soureFile, destinationFile);
    }
}
