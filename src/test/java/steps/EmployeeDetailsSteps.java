package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.CommonMethods.sendText;
import static utils.PageInitializers.employeeSearchPage;

public class EmployeeDetailsSteps {
    public WebDriver driver;

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() throws InterruptedException {
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usernameBox.sendKeys("admin");
        Thread.sleep(2000);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passwordBox.sendKeys("Hum@nhrm123");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement LoginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        LoginButton.click();
    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        System.out.println("my test has passed");
    }
    @When("user clicks on Admin option")
    public void user_clicks_on_admin_option() throws InterruptedException {
        WebElement Admin_Option = driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
        Admin_Option.click();
        Thread.sleep(1000);
    }
    @Then("user navigate to the EmployeeList")
    public void user_clicks_on_EmployeeList_option() throws InterruptedException {
        WebElement Employee_List = driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
        Employee_List.click();
        Thread.sleep(1000);
    }


    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
          WebElement nameTextField = driver.findElement(By.id("empsearch_employee_name_empName"));
          nameTextField.sendKeys("Tatiana MS");
        sendText(employeeSearchPage.empSearchNameField, "Tatiana MS");
    }

    @Then("user navigate to the employee's profile")
    public void user_clicks_on_employees_profile() throws InterruptedException {
        WebElement view_Employee = driver.findElement(By.xpath("//a[@id='menu_pim/viewEmployee/empNumber/42993']"));
        view_Employee.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on Job Title")
    public void user_clicks_on_Job_Title() throws InterruptedException {
        WebElement Job_Title = driver.findElement(By.xpath("//[@id='job_job_title]"));
        Job_Title.click();
        Thread.sleep(1000);
    }

    @Then("user navigate to the current job details section")
    public void user_navigate_to_the_Current_job_details_section() throws InterruptedException {
        WebElement Current_job_details_section = driver.findElement(By.xpath("//[@tag_name ='Current_job_details_section"));
        Current_job_details_section.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks on Employment Status")
    public void user_clicks_on_Employment_Status() throws InterruptedException {
        WebElement Employment_Status = driver.findElement(By.xpath("//input[@id='job_emp_status']"));
        Employment_Status.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on Job Category")
    public void user_clicks_on_Job_Category() throws InterruptedException {
        WebElement Job_Category = driver.findElement(By.xpath("//input[@id='job_eeo_category']"));
        Job_Category.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on Joined Date")
    public void and_user_clicks_on_Joined_Date() throws InterruptedException {
        WebElement Joined_Date = driver.findElement(By.xpath("//input[@id='job_joined_date']"));
        Joined_Date.click();
        Thread.sleep(1000);
    }

    @Then("user clicks on Sub Unit")
    public void and_user_clicks_on_Sub_Unit() throws InterruptedException {
        WebElement Sub_Unit = driver.findElement(By.xpath("//input[@id='id='job_sub_unit']"));
        Sub_Unit.click();
        Thread.sleep(1000);
    }

    @Then("user clicks on Location")
    public void and_user_clicks_on_Location() throws InterruptedException {
        WebElement Location = driver.findElement(By.xpath("//input[@id='job_location']"));
        Location.click();
        Thread.sleep(1000);
    }


    @Then("user clicks on Start Date")
    public void and_user_clicks_on_Start_Date() throws InterruptedException {
        WebElement Start_Date = driver.findElement(By.xpath("//input[@id='job_contract_start_date']"));
        Start_Date.click();
        Thread.sleep(1000);
    }


    @Then("user clicks on End Date")
    public void and_user_clicks_on_End_Date() throws InterruptedException {
        WebElement End_Date = driver.findElement(By.xpath("//input[@id='job_contract_end_date']"));
        End_Date.click();
        Thread.sleep(1000);
    }

    @Then("user clicks on Contract Details")
    public void and_user_clicks_on_Contract_Details() throws InterruptedException {
        WebElement Contract_Details = driver.findElement(By.xpath("//input[@id='notDefinedLabel']"));
        Contract_Details.click();
        Thread.sleep(1000);
    }

    @Then("user clicks on Save Button")
    public void and_user_clicks_on_Save_Button() throws InterruptedException {
        WebElement Save_Button = driver.findElement(By.xpath("//input[@id='btnSave']"));
        Save_Button.click();
        Thread.sleep(1000);
    }




   // public void user_closes_the_browser() {
        //driver.close();
    }



