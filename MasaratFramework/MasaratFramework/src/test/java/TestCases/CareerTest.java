package TestCases;

import Pages.Career;
import Pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CareerTest extends BaseTest {

    Career career=new Career(driver);
    HomePage homePage=new HomePage(driver);

    @Given("I am on the job application form")
    public void i_am_on_the_job_application_form() {
    homePage.clickCareer();

    }

    @When("I enter valid job application details:")
    public void i_enter_valid_job_application_details(DataTable table) {

    }

    @When("I check the CAPTCHA confirmation box")
    public void i_check_the_CAPTCHA_confirmation_box() {

    }

    @Then("the application should be submitted successfully")
    public void the_application_should_be_submitted_successfully() {

    }

}
