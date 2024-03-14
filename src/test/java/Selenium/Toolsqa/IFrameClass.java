package Selenium.Toolsqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrameClass {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testIFrame() {
        driver.get("https://demoqa.com/frames");

        //Switch to Frames by id
        driver.switchTo().frame("frame1");
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        driver.switchTo().defaultContent();

        // driver.switchTo().parentFrame();
        driver.quit();
    }
}
