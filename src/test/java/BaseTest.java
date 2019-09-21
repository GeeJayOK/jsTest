import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    Locators locators;

    public WebDriver getDriver() {
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(false);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
            driver.get(locators.BASE_URL);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return driver;
    }

    public String checker(String field){
        return driver.findElement(By.xpath(field)).getText();
    }

    public static void tearDown() {
        driver.quit();
    }
}
