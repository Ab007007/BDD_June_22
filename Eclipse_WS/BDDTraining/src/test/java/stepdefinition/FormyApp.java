package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormyApp {

	WebDriver driver = null;
	@Given("User is on Form Page")
	public void user_is_on_form_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");
	   
	}
	@When("User enter fn {}")
	public void user_enter_firstname(String fname) {
	    driver.findElement(By.id("first-name")).sendKeys(fname);
	}
	@When("user enter ln {}")
	public void user_enter_lastname(String lname) {
	    driver.findElement(By.id("last-name")).sendKeys(lname);
		
	}
	@When("user enter jt {}")
	public void user_enter_jobtitile(String jtitle) {
	    driver.findElement(By.id("job-title")).sendKeys(jtitle);
		
	}

	@When("click on submit")
	public void click_on_submit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.linkText("Submit")).click();
	   Thread.sleep(10000);
	}
	@Then("user validate success message")
	public void user_validate_success_message() {
	   String successmsg = driver.findElement(By.xpath("//div[@role='alert']")).getText();
	   System.out.println(successmsg);
	   driver.close();
	}
	
	@When("user enter all required fileds and validate success msg")
	public void user_enter_all_required_fileds_and_validate_success_msg(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    List<List<String>> data = dataTable.asLists();
	    String fname,lname,jtitle;
	    for (int i = 0; i < data.size(); i++) 
	    {
	    	List<String> values = data.get(i);
	    	fname = values.get(0);
	    	lname = values.get(1);
	    	jtitle = values.get(2);
	    	driver.findElement(By.id("first-name")).sendKeys(fname);
	    	driver.findElement(By.id("last-name")).sendKeys(lname);
	    	driver.findElement(By.id("job-title")).sendKeys(jtitle);
		
	    	driver.findElement(By.linkText("Submit")).click();
	    	Thread.sleep(10000);
	    	String successmsg = driver.findElement(By.xpath("//div[@role='alert']")).getText();
	 	    System.out.println(successmsg);
	 	    driver.findElement(By.linkText("Form")).click();
	 		Thread.sleep(2000);
	    }
	}
	@When("user close the brower")
	public void user_close_the_brower() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
