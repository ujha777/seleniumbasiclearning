package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on Netbanking Landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User landed on netbanking page");
	}
	@When("^user login to the application with (.+) and password (.+)$")
	public void user_login_to_the_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("username:"+username+"password:"+password);
	}
//How to achieve parameterization
	/*
	 * @When("user login to the application with {string} and password {string} cobination"
	 * ) public void
	 * user_login_to_the_application_with_and_password_cobination(String username,
	 * String password) { // Write code here that turns the phrase above into
	 * concrete actions
	 * System.out.println("username:"+username+"password:"+password); }
	 */
	//How to achieve use regex to fetch any data type
	@When("^user login to the application with (.+) and password (.+)$ combination")
	public void user_login_to_the_application_with_and_password_combination(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("username:"+username+"password:"+password);
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("User landed on home page");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Cards page is displayed");
	}
}
