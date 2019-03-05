package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class MySteps {

    @Given("^Open the Firefox and launch the application$")
    public void open_the_firefox_and_launch_the_application() throws Throwable {
    	System.out.println("This Step open the Firefox and launch the application.");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_username_and_password() throws Throwable {
    	System.out.println("This step enter the Username and Password on the login page.");
    }

    @Then("^Reset the credential$")
    public void reset_the_credential() throws Throwable {
    	System.out.println("This step click on the Reset button.");	
    }
}
