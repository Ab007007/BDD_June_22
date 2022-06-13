package stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionSteps {
	int a = 10, b=20, c;
	@Given("user has two numbers")
	public void user_has_two_numbers() {
	  System.out.println("Number-1 : " + a);
	  System.out.println("Number-2 : " + b);
	}
	@When("user add two numbers")
	public void user_add_two_numbers() {
	    c = a+b;
	}
	@Then("sum should be valid")
	public void sum_should_be_valid() {
		System.out.println("sum of two numbers : " + c);
	    Assert.assertEquals(30, c);
	}
	@Then("user validates successful addition")
	public void user_validates_successful_addition() {
	  System.out.println("Sum of two numbers is successful");
	}
	@Then("sum should be invalid")
	public void sum_should_be_invalid() {
		c = a - b;
	   if(c != 30) {
		   System.out.println("Sum is invalid..." + c);
	   }
	}

	@Then("user validates un-successful addition")
	public void user_validates_un_successful_addition() {
		 System.out.println("Sum of two numbers is un-successful");
	}
}
