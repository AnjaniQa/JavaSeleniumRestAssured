package Selenium.Naveenautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class ActionClass {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testMouseHover() throws InterruptedException {
        driver.get("https://www.makemytrip.com/visa/");
        Actions actions = new Actions(driver);
        WebElement ulElement = driver.findElement(By.cssSelector("ul[class='makeFlex font12 headerIconsGap']"));
        List<WebElement> list = ulElement.findElements(By.tagName("li"));
        System.out.println("a");
        for(WebElement webElement : list) {
            actions.moveToElement(webElement).build().perform();
            Thread.sleep(3000);
        }
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
        Actions actions = new Actions(driver);
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iFrame);
        // get the source element
        WebElement source = driver.findElement(By.id("draggable"));

        // get the target element
        WebElement target = driver.findElement(By.id("droppable"));

        Thread.sleep(1000);

        //create an object of Action class
        Actions action = new Actions(driver);

        // perform drag and Drop operation
        action.dragAndDrop(source, target).build().perform();

        Thread.sleep(1000);

        driver.close();
    }
}
