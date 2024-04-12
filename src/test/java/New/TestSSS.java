package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSSS {

    @Test
    public void testTable() {

        System.setProperty("webdriver.chrome.driver", "Path");
        WebDriver driver = new ChromeDriver();
        driver.get("Table link");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='any']/thead/th"));

        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='any']/tbody/tr/td"));

        for(int i=0; i<rows.size(); i++) {
            int c = 0;
            while(c<columns.size()) {
                WebElement column = rows.get(i).findElement(By.xpath("//table[@class='any'/tbody/tr/td" + "[c+1]"));
                System.out.println(column.getText());
                c++;
            }
        }
    }
}
