package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumLocators {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.close();
    }

    @Test
    public void testId() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("gbwa")).click();
    }

    @Test
    public void testClassName() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.className("pHiOh")).click();
        driver.close();
    }


    @Test
    public void testTagName() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.tagName("textarea")).sendKeys("Test");
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void testName() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        By searchButton = By.name("btnK");
        String value = driver.findElement(searchButton).getAttribute("value");
        System.out.println(value);
    }

    @Test
    public void testLinkText() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("Advertising")).click();
    }

    @Test
    public void testPartialLinkText() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.partialLinkText("Abo")).click();
        driver.close();
    }

    @Test
    public void testTagAndId() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
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
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
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
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            driver.findElement(By.cssSelector("div[class='gb_k gb_w gb_J']")).click();
            Thread.sleep(2000);
            driver.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void xpathSingleAttribute() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void contains() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[contains(@class,'gLFyf')]")).sendKeys("Test");
        Thread.sleep(2000);
        driver.close();
    }

}
