package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart {
	
	@Before(order = 1)
	public void precondition()
	{
		System.out.println("#################################");
	}
	
//	@After(order = 2)
//	public void postContition()
//	{
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"); 
//	}
//	@Before(order = 2)
//	public void preconditionNew()
//	{
//		System.out.println("********************************");
//	}
	
	@After(order = 1)
	public void postContitionNew()
	{
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"); 
	}
	
	@BeforeStep
	public void logBeforeStep() {
		System.out.println("--------------------------------------------");
	}
	
	@AfterStep
	public void logAfterStep() {
		System.out.println("=============================================");
	}
	
	@Given("user is on flipkart home page")
	public void user_is_on_flipkart_home_page() {
	    System.out.println("user is on home page");
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    System.out.println("user entering un and pwd");
	}
	@When("click on login button")
	public void click_on_login_button() {
	    System.out.println("user clickin on login button");
	}
	@Then("user should be able to see dashboard page")
	public void user_should_be_able_to_see_dashboard_page() {
	    System.out.println("user is on dashboard page");
	}
	@When("user move the mouse on more link")
	public void user_move_the_mouse_on_more_link() {
	   System.out.println("move mouse");
	}
	@Then("user will print the suggestions")
	public void user_will_print_the_suggestions() {
	   System.out.println("printing suggestion");
	}
	
	@When("user click on mobile tab")
	public void user_click_on_mobile_tab() {
	    System.out.println("click on mobile tab");
	}
	@Then("user will be navigated to mobile page")
	public void user_will_be_navigated_to_mobile_page() {
	    System.out.println("Navigate to movile page");
	}
	@Then("user print the mobiles displayed")
	public void user_print_the_mobiles_displayed() {
	  System.out.println("print mobiiles");
	}
		
	@When("user click on Kids tab")
	public void user_click_on_kids_tab() {
	    System.out.println("click on kids tab");
	}
	@Then("user will be navigated to Kids page")
	public void user_will_be_navigated_to_kids_page() {
	    System.out.println("Navigate to kids page");
	}
	





}
