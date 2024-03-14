package Selenium.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class MouseHover {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-geolocation");
        chromeOptions.addArguments("disable-notifications");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @Test
    public void testMoverHover() throws Exception {
        driver.get("https://www.spicejet.com/");
        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-kgf08f r-18u37iz']"));
        List<WebElement> elementList = webElement.findElements(By.xpath("*"));
        System.out.println(elementList);
        for (WebElement element : elementList) {
            System.out.println(element.getText());
        }
        for (WebElement element : elementList) {
            actions.moveToElement(element).build().perform();
            Thread.sleep(2000);
        }
    }
}
