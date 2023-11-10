package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class JobDetailsSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_PIM_option(){
        click(dashboardPageAdmin.pimButtonLocator);
    }

    @And("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        // WebElement addEmployeeButton = driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));
        click(dashboardPageAdmin.addEmployeeButtonLocator);
    }

    @Then("user enters firstName and middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name(String firstN, String middleN, String lastN) {
        //  WebElement firstNameField = driver.findElement(By.id("firstName"));
        //  WebElement middleNameField = driver.findElement(By.id("middleName"));
        //  WebElement lastNameField = driver.findElement(By.id("lastName"));
        sendText(addEmployeePage.firstNameFieldLocator, firstN);
        sendText(addEmployeePage.middleNameFieldLocator, middleN);
        sendText(addEmployeePage.lastNameFieldLocator,lastN);
    }

    @And("user clicks on save button")
    public void user_clicks_on_save_button() {
        //  WebElement saveBtn = driver.findElement(By.id("btnSave"));
        click(addEmployeePage.saveButtonLocator);
    }

    @Then("employees added successfully")
    public void employees_added_successfully() {
        System.out.println("Employee added");
    }

    @When("user adds multiple employees from data table and user clicks on save button")
    public void user_adds_multiple_employees_from_data_table
            (io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> employeeNames = dataTable.asMaps();

        for (Map<String, String> map : employeeNames
        ) {
            sendText(addEmployeePage.firstNameFieldLocator, map.get("firstName"));
            sendText(addEmployeePage.middleNameFieldLocator, map.get("middleName"));
            sendText(addEmployeePage.lastNameFieldLocator, map.get("lastName"));
            click(addEmployeePage.saveButtonLocator);
            Thread.sleep(2000);

        }
    }

    @Then("user clicks on  Job option")
    public void user_clicks_on_job_option() {
        click(jobPage.jobButtonOptionLocator);
    }
    @Then("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        click(jobPage.editButtonLocator);
    }
}
