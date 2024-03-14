package Selenium.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class TakeScreenshotOnTestFailureClass {

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
        driver.findElement(By.id("abc"));
    }

    @AfterMethod
    public void screenshot(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot tk = (TakesScreenshot) driver;
            File source = tk.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(source, new File("./target/reports/" + result.getName() + System.currentTimeMillis() + ".png"));
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
