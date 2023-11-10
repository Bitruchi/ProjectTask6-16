package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashBoardPage extends CommonMethods {

    @FindBy(xpath = "//b[text()='Dashboard']")
    public WebElement DashboardButtonLocator;
    @FindBy(xpath = "//a[text()='Welcome Admin']")
    public WebElement welcomeAdminLocator;
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimButtonLocator;
    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeButtonLocator;

    public AdminDashBoardPage(){
        PageFactory.initElements(driver, this);
    }
}