package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class Common {
    protected static WebDriver driver;

    @BeforeClass
    protected RemoteWebDriver before(){
        WebDriverManager.chromedriver().setup();

        return (RemoteWebDriver) driver;
    }

    @BeforeMethod
    protected void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    protected void afterTest(){
        driver.quit();
    }
}
