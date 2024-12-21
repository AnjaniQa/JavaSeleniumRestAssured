package Revision.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locators {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjanikumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void id() {
        driver.get("https://www.google.com/");
        driver.findElement(By.id("gbqfbb"));
        driver.close();
    }

    @Test
    public void name() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("sca_esv"));
        driver.close();
    }

    @Test
    public void className() {
        driver.get("https://www.google.com/");
        driver.findElement(By.className("pHiOh")).click();
        driver.close();
    }

    @Test
    public void tagName() {
        driver.get("https://www.google.com/");
        driver.findElement(By.tagName("textarea")).click();
        driver.close();
    }

    @Test
    public void linkTest() {
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("pHiOh")).click();
        driver.close();
    }

    @Test
    public void partialLinkTest() {
        driver.get("https://www.google.com/");
        driver.findElement(By.partialLinkText("pHiOh")).click();
        driver.close();
    }

    @Test
    public void cssSelectorTagAndId() {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("div#gbwa")).click();
        driver.close();
    }

    @Test
    public void cssSelectorTagAndClass() {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("a.gb_A")).click();
        driver.close();
    }

    @Test
    public void cssSelectorTagAndAttribute() {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("a[class=gb_A]")).click();
        driver.close();
    }

    @Test
    public void cssSelectorTagClassAndAttibute() {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("a.gb_A[aria-label='Google apps']")).click();
        driver.close();
    }

    @Test
    public void cssSelectorSubstringMatchesStartsWith() {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("a[class^=gb_A]")).click();
        driver.close();
    }

    @Test
    public void cssSelectorSubstringMatchesEndsWith() {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("a[class$=gb_A]")).click();
        driver.close();
    }

    @Test
    public void cssSelectorSubstringMatchesContains() {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("a[class*=gb_A]")).click();
        driver.close();
    }

    @Test
    public void xpathSingleSlash() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("/html/body/div/div/form/div/div/div/div/div/textarea"));
        driver.close();
    }

    @Test
    public void xpathDoubleSlash() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea"));
        driver.close();
    }

    @Test
    public void xpatMultipleAttribute() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf'][@aria-controls='Alh6id']"));
        driver.close();
    }

    @Test
    public void xpathAnd() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf' and @aria-controls='Alh6id']"));
        driver.close();
    }

    @Test
    public void xpathOr() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf' or @aria-controls=\"Alh6id\"]"));
        driver.close();
    }

    @Test
    public void xpathContains() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[contains(@class,'gLFyf')]"));
        driver.close();
    }

    @Test
    public void xpathStartsWith() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[starts-with(@class,'gLFyf')]"));
        driver.close();
    }

    @Test
    public void xpathlast() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf'][last()]"));
        driver.close();
    }

    @Test
    public void xpathText() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[text()='Google']"));
        driver.close();
    }
}
