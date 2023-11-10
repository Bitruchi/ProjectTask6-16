package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage extends CommonMethods {


    @FindBy(xpath ="//a[text()='Dependents']")
    public WebElement dependentsButtonOptionLocator;

    @FindBy(xpath ="//input[@id='btnAddDependent']")
    public WebElement addButtonDependentsOption;

    @FindBy(id="dependent_name")
    public WebElement nameTextFieldDependents;

    @FindBy(id="dependent_relationshipType")
    public WebElement relationshipDropDown;

    @FindBy(id="dependent_dateOfBirth")
    public WebElement dateOfBirthOption;

    @FindBy(xpath ="(//span[text()='Required'])[1]")
    public WebElement nameErrorMessageLocator;

    @FindBy(xpath ="(//span[text()='Required'])[2]")
    public WebElement relationErrorMessageLocator;

    @FindBy(id="btnSaveDependent")
    public WebElement saveButtonDependentsLocator;

    @FindBy(xpath ="//a[text()='Job']")
    public WebElement jobButtonOptionLocator;

    @FindBy(xpath ="//a[text()='Qualifications']")
    public WebElement qualificationsEmployeeButtonOptionLocator;

    @FindBy(xpath ="//a[text()='Memberships']")
    public WebElement membershipsEmployeeButtonOptionLocator;

    public MyInfoPage(){
        PageFactory.initElements(driver, this);
    }
}
