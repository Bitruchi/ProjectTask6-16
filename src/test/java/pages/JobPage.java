package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPage extends CommonMethods {

    @FindBy(xpath ="(//a[text()='Job'])[2]")
    public WebElement jobButtonOptionLocator;


    @FindBy(xpath ="(//input[@value='Edit'])[1]")
    public WebElement editButtonLocator;

    @FindBy(name ="job[job_title]")
    public WebElement jobTitleDropdown;

    @FindBy(id="job_emp_status")
    public WebElement employmentStatusDropDown;

    @FindBy(id="job_eeo_category")
    public WebElement jobCategoryDropdown;

    @FindBy(id="job_joined_date")
    public WebElement joinedDateLocator;

    @FindBy(id="job_sub_unit")
    public WebElement subUnitDropdown;
    @FindBy(id="job_location")
    public WebElement locationDropDown;
    @FindBy(id="job_contract_start_date")
    public WebElement startDateLocator;
    @FindBy(id="job_contract_end_date")
    public WebElement endDateLocator;
    @FindBy(xpath ="//input[@id='btnSave']")
    public WebElement saveButtonJobLocator;

    @FindBy(id="btnTerminateEmployement")
    public WebElement terminateEmploymentButton;

    @FindBy(id="terminate_reason")
    public WebElement reasonDropDown;

    @FindBy(id="terminate_date")
    public WebElement dateLocator;

    @FindBy(id="terminate_note")
    public WebElement noteLocator;

    @FindBy(id="dialogConfirm")
    public WebElement confirmButtonLocator;

    public JobPage(){
        PageFactory.initElements(driver, this);
    }
}
