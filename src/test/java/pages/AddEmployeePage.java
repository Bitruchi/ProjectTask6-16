package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id = "firstName")
    public WebElement firstNameBox;

    @FindBy(id = "middleName")
    public WebElement middleNameBox;

    @FindBy(id = "lastName")
    public WebElement lastNameBox;

    @FindBy(id = "employeeId")
    public WebElement employeeIdBox;
    @FindBy(id = "photofile")
    public WebElement photoUploadBtn;
    @FindBy(id = "chkLogin")
    public WebElement createLoginDetCheckBox;
    @FindBy(id = "btnSave")
    public WebElement saveBtn;

    public AddEmployeePage()
    {
        PageFactory.initElements(driver,this);
    }
}
