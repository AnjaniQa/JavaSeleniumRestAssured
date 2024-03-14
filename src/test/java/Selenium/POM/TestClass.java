package Selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testDashBoard() {
        driver.get("https://www.spicejet.com/");
        SpiceJetDashboardPage spiceJetDashboardPage = SeleniumPageObject.createPage(driver, SpiceJetDashboardPage.class);
        spiceJetDashboardPage.selectLogin();
    }
}
