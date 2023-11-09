package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class DashboardPage extends CommonMethods {

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimButton;

    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement empListButton;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeButton;

    @FindBy(id = "welcome")
    public WebElement welcomeAdminLocator;

    @FindBy(id = "Admin")
    public  WebElement adminButton;

    @FindBy(id = "Leave")
    public  WebElement leaveButton;

    @FindBy(id = "Time")
    public  WebElement timeButton;

    @FindBy(id = "Recruitment")
    public  WebElement recruitmentButton;

    @FindBy(id = "Performance")
    public  WebElement performanceButton;

    @FindBy(id = "Dashboard")
    public  WebElement dashboardButton;

    @FindBy(id = "Directory")
    public  WebElement directoryButton;

    public DashboardPage()
    {PageFactory.initElements(driver,this);}


}

