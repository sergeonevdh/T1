package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseModel{

   public MainPage(WebDriver driver){
       super(driver);
   }

   @FindBy(xpath = "//input[@id='email']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public MainPage enterUserName(String value){
        userName.sendKeys(value);

        return new MainPage(getDriver());
    }

    public MainPage enterUserPassword(String value){
        userPassword.sendKeys(value);

        return new MainPage(getDriver());
    }

    public MainPage clickLoginButton(){
        loginButton.click();

        return new MainPage(getDriver());
    }
}
