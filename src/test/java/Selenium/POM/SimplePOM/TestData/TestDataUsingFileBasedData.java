package Selenium.POM.SimplePOM.TestData;

import Selenium.POM.SimplePOM.ConfigUtils;
import Selenium.POM.SimplePOM.LoginPage;
import Selenium.POM.SimplePOM.SpiceJetDashboardPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataUsingFileBasedData {

    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() {
        String mobile = ConfigUtils.getValue("MOBILE_NUMBER");
        System.out.println(mobile);
        driver.get("https://www.spicejet.com/");
        SpiceJetDashboardPage spiceJetDashboardPage = new SpiceJetDashboardPage(driver);
        LoginPage loginPage = spiceJetDashboardPage.selectLogin();
        loginPage.enterMobile(mobile);
    }


}
