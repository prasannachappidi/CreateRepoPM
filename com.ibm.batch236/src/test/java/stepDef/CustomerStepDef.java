package stepDef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerStepDef {
	
	@Then("user can view Dashboard")
	public void user_can_view_Dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(false, false);
	}

	@When("user clicks on Customer Menu")
	public void user_clicks_on_Customer_Menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on Customers menu item")
	public void click_on_Customers_menu_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on Add New button")
	public void click_on_Add_New_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can view Add New customer page")
	public void user_can_view_Add_New_customer_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters customer Info")
	public void user_enters_customer_Info() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on Save button")
	public void click_on_Save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
