package Selenium.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;

public class TakeScreenshotOnTestFailure {

    static WebDriver driver;

    @BeforeTest
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testClassName() {
        driver.get("https://www.google.com/");
        driver.findElement(By.className("pHiO")).click();
        driver.close();
    }

    @AfterTest
    public static void exit() {
        driver.get("https://www.google.com/");
        driver.findElement(By.className("pHiOh")).click();
        driver.close();
    }

    @AfterMethod
    public void takeScreenshot(ITestResult iResult) throws Exception {
        if(ITestResult.FAILURE == iResult.getStatus()) {
            TakesScreenshot tk = (TakesScreenshot) driver;
            File f = tk.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(f, new File("./target/reports/" + iResult.getName() + System.currentTimeMillis() + ".png"));
        }

    }

    @AfterMethod
    public void takeScreenshot1(ITestResult iTestResult) throws Exception {
        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./target/report" + iTestResult.getName() + System.currentTimeMillis() + ".png"));
        }
    }
}
