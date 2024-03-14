package Selenium.RobotClass;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClass {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void testKeyboardEvents() throws Exception {
        Robot robot = new Robot();
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");

        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");

        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");

        // select current address
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // copy current address
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Focuson permanent address tab
        robot.keyPress(KeyEvent.VK_TAB);

        //Paste the Address in the Permanent Address field
        WebElement permanentAddress=driver.findElement(By.id("currentAddress"));
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    @Test
    public void testMouseEvents() throws Exception {
        Robot robot = new Robot();
        String URL = "https://demoqa.com/keyboard-events/";
        driver.manage().window().maximize();
        driver.get(URL);
        WebElement webElement = driver.findElement(By.id("browseFile"));
        webElement.sendKeys("ENTER");
        Dimension i = driver.manage().window().getSize();
        int x = (i.getHeight()/4) + 20;
        int y = (i.getWidth()/4) + 50;
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyPress(KeyEvent.VK_ENTER);
        driver.close();
    }
}
