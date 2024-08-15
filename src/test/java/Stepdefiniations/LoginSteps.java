package Stepdefiniations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("Welcome to login page");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		System.out.println("Please enter username and password");
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		
		System.out.println("Please click on login button");
		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println(" User naviagted to home page");
	}


}
