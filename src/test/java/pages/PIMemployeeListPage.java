package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMemployeeListPage extends CommonMethods {

    @FindBy(xpath ="//a[text()='Employee List']")
    public WebElement employeeListButtonLocator;
    @FindBy(id="empsearch_id")
    public WebElement employeeIDSearchLocator;
    @FindBy(id="searchBtn")
    public WebElement searchButtonEmployeeListLocator;
    @FindBy(xpath ="//table[@id='resultTable']/tbody/tr/td")
    public WebElement noRecordFoundLocator;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeButtonLocator;

    @FindBy(xpath="(//a[text()='Memberships'])[2]")
    public WebElement membershipsButtonLocator;


    @FindBy(xpath ="(//a[text()='Qualifications'])[2]")
    public WebElement qualificationsAdminButtonLocator;


    public PIMemployeeListPage(){
        PageFactory.initElements(driver, this);
    }
}
