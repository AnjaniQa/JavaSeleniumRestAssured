package Revision.TestNG.iTestListener;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;

public class ScreenshotOnTestFailure {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void id() {
        driver.get("https://www.google.com/");
        driver.findElement(By.id("abcd"));
        driver.close();
    }

    @AfterMethod
    public void takeScreenshotOnTestFailure(ITestResult i) throws Exception {
        if(i.getStatus()==ITestResult.FAILURE) {
            TakesScreenshot tk = (TakesScreenshot) driver;
            File sourceFile = tk.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File("C:\\Users\\anjanikumar\\Documents\\screenshot1.png");
            FileUtils.copyFile(sourceFile, destinationFile);
        }
    }
}
