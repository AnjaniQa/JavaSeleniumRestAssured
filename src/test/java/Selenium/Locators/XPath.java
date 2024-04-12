package Selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XPath {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void singleSlash() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div")).click();
        driver.close();
    }

    @Test
    public void doubleSlash() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void singleAttribute() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void multipleAttribute() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf'][@aria-controls='Alh6id']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void and() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf' and @aria-controls='Alh6id']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void or() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf' or @aria-controls='Alh6id']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void contains() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[contains(@class,'gLFyf')]")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void startsWith() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[starts-with(@class,'gLFy')]")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void text() throws Exception {
        driver.get("https://www.google.com/");
        String text = driver.findElement(By.xpath("//*[text()='Google offered in:  ']")).getText();
        System.out.println(text);
        driver.close();
    }

    @Test
    public void last() throws Exception {
        driver.get("https://www.google.com/");
        WebElement webElement = driver.findElement(By.xpath("//textarea[@class='gLFyf'][last()]"));
        webElement.sendKeys("Text");
        Thread.sleep(2000);
        driver.close();
    }
}
