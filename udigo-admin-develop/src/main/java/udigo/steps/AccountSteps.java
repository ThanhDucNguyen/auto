package udigo.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountSteps extends BaseSteps{


    @Given("^I open the Account Page (.+)$")
    public void i_open_the_website(String website)  {
        getAccountScreen().openWebsite(website);

    }


    @When("^I add customer successfully with information (.+) (.+) (.+) (.+)$")
    public void i_add_customer_successfully_with_information(String firstname, String lastname, String postcode, String status)  {
        
    }

    @When("^I click Open Account Page$")
    public void i_click_open_account_page()  {

    }

    @Then("^I verify the account opens successfully$")
    public void i_verify_the_account_opens_successfully()  {
        getAccountScreen().closeWebsite();

    }

    @And("^I choose with information (.+) (.+)$")
    public void i_choose_with_information(String firstname, String lastname)  {

    }

    @And("^I choose the current (.+)$")
    public void i_choose_the_current(String currency)  {

    }

    @And("^I click Process Button$")
    public void i_click_process_button()  {

    }



}
