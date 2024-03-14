package Selenium.Table

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.FluentWait
import org.openqa.selenium.support.ui.Wait
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import java.time.Duration
import java.util.concurrent.TimeUnit
import java.util.function.Function

class DynamicTable {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void getNumberOfRows() {
        List<WebElement> rowList = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"))
        System.out.println("The number of rows is : " + rowList.size());
        driver.close();
    }

    @Test
    public void getNumberOfColumns() {
        List<WebElement> columnsList = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"))
        System.out.println("The number of columns is : " + columnsList.size());
        driver.close();
    }

    @Test
    public void getCellValue() {
        WebElement thirdRow = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]"));
        System.out.println(thirdRow.getText());
        WebElement thirdRowSecondColumn = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[2]"));
        System.out.println(thirdRowSecondColumn.getText());
    }

    @Test
    public void getValueOfACell() {
        WebElement thirdRow = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]"));
        System.out.println(thirdRow.getText());
        WebElement thirdRowSecondColumn = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[2]"));
        System.out.println(thirdRowSecondColumn.getText());
    }

    @Test
    public void getAllValuesOfARow() {
        List<WebElement> columnList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        for (int i=0; i<columnList.size(); i++) {
            WebElement columnElement = columnList.get(i).findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[" + (i+1) + "]"));
            String text = columnElement.getText();
            System.out.println(text);
        }
    }


    @Test
    public void getAllValuesOFAColumn() {
        Double max = 0;
        List<WebElement> rowList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        for (int i=0; i<rowList.size(); i++) {
            WebElement rowElement = rowList.get(i).findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + (i+1) + "]/td[3]"));
            String text = rowElement.getText();
            System.out.println(text);
            double d = Double.parseDouble(text);
            if (d>max) {
                max =d
            }
        }
        System.out.println("The largest number is : " + max);

    }

    @Test
    public void getAllValuesOfTable() {
        List<WebElement> rowList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        List<WebElement> columnList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        int rowSize = rowList.size();
        for (int i=0; i<rowSize; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + (i+1) + "]"));
            List<WebElement> columnElements = rowElement.findElements(By.tagName("td"));
            for(WebElement webElement : columnElements) {
                System.out.print(webElement.getText() + "       ");
            }
            System.out.println();
        }
    }



    private void waitForPageToLoadUsingExplicitWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("leftcontainer")));
    }

    private void waitForPageToLoadUsingFluent() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(DurationOfSeconds(30))
        .pollingEvery(DurationOfSeconds(30))
        .ignoreAll(NoSuchElementException.class)

        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            Boolean apply(WebDriver driver) {
                try {
                    driver.findElement(By.id("leftcontainer"));
                    return true;
                } catch(Exception e) {
                    return false;
                }
            }
        }

        ExpectedCondition<WebElement> condition1 = new ExpectedCondition<WebElement>() {
            @Override
            WebElement apply(WebDriver driver) {
                try {
                    return driver.findElement(By.id("leftcontainer"));
                } catch(Exception e) {
                    return null;
                }
            }
        }

        WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                try {
                    return driver.findElement(By.id("leftcontainer"));
                } catch(Exception e) {
                    return null;
                }
            }
        });

        webElement = wait.until(driver -> driver.findElement(By.id("leftcontainer")));

        wait.until(condition);
    }
}
