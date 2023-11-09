package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class TerminateEmployeePage extends CommonMethods {
    @FindBy(id="menu_pim_Configuration")
    public WebElement Configuration ;

    @FindBy(id="menu_pim_viewTerminationReasons")
    public WebElement TerminationReasons ;

    @FindBy(id="btnAdd")
    public WebElement addBtn ;

    @FindBy(id="terminationReason_name")
    public WebElement nameField;

    @FindBy(id="btnSave")
    public WebElement saveBtn ;

    public TerminateEmployeePage(){
        PageFactory.initElements(driver,this);}
}
