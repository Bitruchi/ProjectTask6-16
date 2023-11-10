package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id = "firstName")
    public WebElement firstNameFieldLocator;

    @FindBy(xpath = "//span[@for='firstName']")
    public WebElement firstNameRequiredLocator;

    @FindBy(id = "middleName")
    public WebElement middleNameFieldLocator;

    @FindBy(id = "lastName")
    public WebElement lastNameFieldLocator;

    @FindBy(xpath = "//span[@for='lastName']")
    public WebElement lastNameRequiredLocator;

    @FindBy(id = "employeeId")
    public WebElement employeeIDFieldLocator;

    @FindBy(id = "photofile")
    public WebElement photographLocator;

    @FindBy(id = "chkLogin")
    public WebElement createLoginCheckbox;

    @FindBy(id = "user_name")
    public WebElement userNameFieldLocator;

    @FindBy(id = "user_password")
    public WebElement passwordFieldLocator;

    @FindBy(id = "re_password")
    public WebElement confirmPasswordFieldLocator;

    @FindBy(id = "status")
    public WebElement statusDropDownLocator;

    @FindBy(id = "btnSave")
    public WebElement saveButtonLocator;


    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }

}