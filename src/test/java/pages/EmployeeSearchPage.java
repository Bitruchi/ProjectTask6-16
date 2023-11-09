package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeSearchPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement empSearchIdField;

    @FindBy(id="")
    public WebElement empSearchNameField;

    @FindBy(id="")
    public WebElement searchBtn;

    public EmployeeSearchPage(){
        PageFactory.initElements(driver, this);
    }
}