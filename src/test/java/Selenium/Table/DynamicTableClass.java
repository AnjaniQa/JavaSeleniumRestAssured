package Selenium.Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTableClass {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void getAllValuesOfTable() {
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
        List<WebElement> columns = rows.get(1).findElements(By.tagName("td"));
        System.out.println(rows.size());
        System.out.println(columns.size());
        String firstPart = "//*[@id='customers']/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";
        for(int i=2; i<=rows.size(); i++) {
            for(int j=1; j<=columns.size(); j++) {
                String finalPath = firstPart + i + secondPart + j + thirdPart;
                WebElement webElement = driver.findElement(By.xpath(finalPath));
                System.out.print(webElement.getText());
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
