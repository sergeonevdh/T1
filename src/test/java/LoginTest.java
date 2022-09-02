import base.Common;
import model.MainPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Common {

    private static final String NAME = "TomSmith";
    private static final String PASSWORD = "jfdjjW982849";
    private static final String errorMessage = "The email or mobile number you entered isn’t connected to an account. " +
            "Find your account and log in.";

    @Test
    public void Login(){
        MainPage mainPage = new MainPage(driver)
                .enterUserName(NAME)
                .enterUserPassword(PASSWORD)
                .clickLoginButton();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText(), errorMessage);
    }
}
