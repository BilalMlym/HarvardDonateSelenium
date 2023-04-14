package harvard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GiftTest {
    WebDriver driver;

    @Test
    public void TestCase() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://community.alumni.harvard.edu/give/16040805");
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,950)", "");

        // Elements
        WebElement Amount = driver.findElement(By.cssSelector("div[id='js-all-gifts'] label:nth-child(2)"));
        WebElement FirstName = driver.findElement(By.xpath("//input[@id='ship_to_forename']"));
        WebElement MiddleName = driver.findElement(By.xpath("//input[@id='contactMiddleName']"));
        WebElement LastName = driver.findElement(By.xpath("//input[@id='ship_to_surname']"));
        WebElement ClassYear = driver.findElement(By.xpath("//input[@id='contactClassYear']"));
        WebElement Street1 = driver.findElement(By.xpath("//input[@id='contactStreet1']"));
        WebElement Street2 = driver.findElement(By.xpath("//input[@id='contactStreet2']"));
        WebElement City = driver.findElement(By.xpath("//input[@id='contactCity']"));
        WebElement State = driver.findElement(By.xpath("//input[@id='contactState']"));
        WebElement ZipCode = driver.findElement(By.xpath("//input[@id='contactPostCd']"));
        WebElement Email = driver.findElement(By.xpath("//input[@id='bill_to_email']"));
        WebElement Number = driver.findElement(By.xpath("//input[@id='contactPhone']"));

        Amount.click();
        FirstName.sendKeys("Bilal");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        MiddleName.sendKeys("non");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        LastName.sendKeys("Mulayim");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        ClassYear.sendKeys("2023");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        Street1.sendKeys("East 14th Street");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        Street2.sendKeys("East 16th Street");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        City.sendKeys("Buffalo");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        State.sendKeys("NY");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        ZipCode.sendKeys("77031");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        Email.sendKeys("bilalmlym@gmail.com");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        Number.sendKeys("+905549406748");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        driver.quit();

    }
}
