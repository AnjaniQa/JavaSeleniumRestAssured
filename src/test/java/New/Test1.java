package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Test1 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        driver.get("https://www.flipkart.com/");
        WebElement electronicsElement = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
        electronicsElement.click();
        WebElement divElement = driver.findElement(By.className("_16rZTH"));
        List<WebElement> itemList = divElement.findElements(By.tagName("a"));

        for(WebElement webElement : itemList) {
            System.out.println(webElement.getText());
        }


    }
}
