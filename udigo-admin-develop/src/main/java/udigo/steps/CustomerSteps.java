package udigo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerSteps extends BaseSteps{


    @Given("^I open the Customer Page (.+)$")
    public void i_open_the_website(String website) throws Throwable {

        getCustomerScreen().openWebsite(website);

    }

    @When("^I type first name (.+) , last name (.+) , postcode (.+)$")
    public void i_type_first_name_last_name_postcode(String firstNameInput, String lastNameInput, String postCodeInput) throws Throwable {
        getCustomerScreen().enterUserInformation(firstNameInput,lastNameInput,postCodeInput);
    }



    @When("^I click Add Customer button$")
    public void i_click_add_customer_button() throws Throwable {
        getCustomerScreen().clickAddCustomerBtn();
    }

    @Then("^I click submit button (.+)$")
    public void i_click_submit_button(String status) throws Throwable {

    }

    @Then("^I check the customer has added in the list$")
    public void i_check_the_customer_has_added_in_the_list() throws Throwable {

   ///     getCustomerScreen().closeWebsite();
    }

    @Then("^I verify the dashboard manage account in bank$")
    public void i_verify_the_dashboard_manage_account_in_bank() throws Throwable {

    }

    @Then("^I verify the add customer screen in bank$")
    public void i_verify_the_add_customer_screen_in_bank() throws Throwable {
        getCustomerScreen().verifyCustomerScreen();
    }


}
