package Test;

import java.io.FileInputStream;
import java.util.Properties;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	@Given("^i nevigate to facebook url$")
	public void i_nevigate_to_facebook_url(DataTable arg1) throws Throwable {
	   
	}

	@When("^i type userName as \"([^\"]*)\"$")
	public void i_type_userName_as(String arg1) throws Throwable {
	   
	}

	@When("^i type password as \"([^\"]*)\"$")
	public void i_type_password_as(String arg1) throws Throwable {
	   	}

	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
	   
	}

	@Then("^i should be logged in succesfully$")
	public void i_should_be_logged_in_succesfully() throws Throwable {
	   
	}

	@When("^type userName as \"([^\"]*)\"$")
	public void type_userName_as(String arg1) throws Throwable {
	   	}

	@When("^type password as \"([^\"]*)\"$")
	public void type_password_as(String arg1) throws Throwable {
	   	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	   	}

	@Then("^should be logged in succesfully$")
	public void should_be_logged_in_succesfully() throws Throwable {
	    
	}



}



