package Selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSSSelector {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testTagAndId() {
        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.cssSelector("div#gbwa")).click();
            Thread.sleep(2000);
            driver.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testTagAndClass() {
        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.cssSelector("div.gb_k")).click();
            Thread.sleep(2000);
            driver.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testTagAndAttribute() {
        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.cssSelector("div[class='gb_k gb_w gb_J']")).click();
            Thread.sleep(2000);
            driver.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testTagClassAndAttribute() {
        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.cssSelector("div.gb_k[id='gbwa']")).click();
            Thread.sleep(2000);
            driver.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testSubstringMatchesStartsWith() {
        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.cssSelector("div[id^='gbw']")).click();
            Thread.sleep(2000);
            driver.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testSubstringMatchesEndsWith() {
        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.cssSelector("div[id$='bwa']")).click();
            Thread.sleep(2000);
            driver.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testSubstringMatchesContains() {
        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.cssSelector("div[id*='bw']")).click();
            Thread.sleep(2000);
            driver.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
