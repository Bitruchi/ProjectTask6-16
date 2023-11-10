package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDashboardPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcomeMessageLocator;

    @FindBy(xpath = "//b[text()='My Info']")
    public WebElement myInfoOptionLocator;

    public EmployeeDashboardPage(){
        PageFactory.initElements(driver, this);
    }
}