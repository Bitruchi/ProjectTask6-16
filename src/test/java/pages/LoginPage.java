package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement usernameTextFieldLocator;
    @FindBy(id="txtPassword")
    public WebElement passwordTextFieldLocator;
    @FindBy(id="btnLogin")
    public WebElement loginButton;
    @FindBy(id="spanMessage")
    public WebElement errorMessage;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
