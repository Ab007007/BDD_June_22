package stepdefinition;

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
}
