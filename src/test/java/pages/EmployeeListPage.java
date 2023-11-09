package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeListPage extends CommonMethods {

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement PIMBtn;

    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement EmployeeList;

    @FindBy(id = "empsearch_id")
    public WebElement EmployeeIDSearchField;

    public EmployeeListPage() {
        PageFactory.initElements(driver, this);
    }
    //needs to extend to CommonMethods, so we don't have to call public static WebDriver driver in each class
}
