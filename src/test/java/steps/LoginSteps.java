package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws InterruptedException {
        //  driver = new ChromeDriver();
        //   driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // Thread.sleep(2000);
        //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        openBrowserLaunchApp();
    }

    @When("user enters admin username and password")
    public void userEntersAdminUsernameAndPassword() throws InterruptedException{

        sendText(loginPage.usernameTextFieldLocator, ConfigReader.getPropertyValue("username"));

        sendText(loginPage.passwordTextFieldLocator, ConfigReader.getPropertyValue("password"));
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() throws InterruptedException{
        click(loginPage.loginButton);
    }

    @Then("user is successfully logged in")
    public void userIsSuccessfullyLoggedIn() {
        Assert.assertTrue(dashboardPageAdmin.welcomeAdminLocator.isDisplayed());
    }
}