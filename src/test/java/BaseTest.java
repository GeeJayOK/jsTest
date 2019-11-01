import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class BaseTest implements Locators {

    protected static WebDriver driver;


    public WebDriver getDriver() {
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(false);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.get(BASE_URL);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return driver;
    }

    public String checker(String field) {
        return driver.findElement(By.xpath(field)).getText();
    }

    public void switchToFrame(String frame) {
        driver.switchTo().frame(frame);
    }

    public void switchBack() {
        driver.switchTo().defaultContent();
    }

    public static void tearDown() {
        driver.quit();
    }
}
