package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MembershipPage extends CommonMethods {

    @FindBy(id="btnAddMembershipDetail")
    public WebElement addMembershipButton;
    @FindBy(id="membership_membership")
    public WebElement membershipDropDown ;

    @FindBy(xpath="//span[@for='membership_membership']")
    public WebElement requiredmembershipError ;

    @FindBy(id="membership_subscriptionPaidBy")
    public WebElement subscriptionPaidByDropDown;

    @FindBy(id="membership_subscriptionAmount")
    public WebElement subscriptionAmountDropDown ;

    @FindBy(id="membership_currency")
    public WebElement currencyDropDown;

    @FindBy(id="membership_subscriptionCommenceDate")
    public WebElement subscriptionCommenceDateElement;

    @FindBy(id="membership_subscriptionRenewalDate")
    public WebElement subscriptionRenewalDateElement ;

    @FindBy(id="btnSaveMembership")
    public WebElement saveButtonMembership;

    @FindBy(id="delMemsBtn")
    public WebElement deleteMembershipLocator;


    public MembershipPage(){
        PageFactory.initElements(driver, this);
    }
}
