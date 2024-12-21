package Interview;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAleert {

    @Test
    public void managePopup() {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://workspace.google.com/intl/en-US/gmail/");
        driver.findElement(By.cssSelector("div[aria-label='Create an account']")).click();

        //driver.findElement(By.className("label-tracker"));
        driver.findElement(By.cssSelector("a[aria-label]='Gmail - For my personal use'"));




    }
}
