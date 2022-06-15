package stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSteps {

	WebDriver driver = null;
	
	@Before("@google")
	public void onlyGoogle() {
		System.out.println("-------GOOOGLEEEEEE----------------------");
	}
	
	@After("@google")
	public void onlyGooglePost()  {
		System.out.println("**********GOOOGGSS***************");
	}
	
	@Given("user is on google page")
	public void user_is_on_google_page() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().contains("Google"));		
	}
	@When("use enter(s) {string} in searcbox")
	public void use_enter_synechron_in_searcbox(String companyName) {
	    
		driver.findElement(By.name("q")).sendKeys(companyName);
	   
	}
	@When("click on Search Button")
	public void click_on_search_button() {
	    driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@aria-label='Google Search']")).click();
	   
	}
	@Then("application should display results")
	public void application_should_display_results() {
	    int searchResults = driver.findElements(By.tagName("h3")).size();
	    Assert.assertTrue(searchResults>0);
	   
	}
	@Then("user will print all hyperlinks/results contains {string}")
	public void user_will_print_all_hyperlinks_contains_synechron(String companyName) {
	   List<WebElement> links = driver.findElements(By.tagName("h3"));
	   for (WebElement link : links) 
	   {
		   System.out.println(link.getText());
	   }
	   
	   
	}
	
	@When("user click on images")
	public void user_click_on_images() {
		driver.findElement(By.linkText("Images")).click();
	  
	}
	@Then("google images page should open")
	public void google_images_page_should_open() {
	   
	}
	
	@When("user search different companies and print the details")
	public void user_search_different_companies_and_print_the_details(DataTable dataTable) {
	   List<Map<String, String>> data = dataTable.asMaps();
	   String companyname = null;
	   for(int i = 0; i< data.size(); i++)
	   {
		   companyname = data.get(i).get("companyName");
		   driver.findElement(By.name("q")).sendKeys(companyname);
		   driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@aria-label='Google Search']")).click();
		   List<WebElement> links = driver.findElements(By.tagName("h3"));
		   for (WebElement link : links) 
		   {
			   System.out.println(link.getText());
		   }
		   driver.get("https://www.google.com/");  
	   }
	}
	
	@When("user search different companies given as list and print the details")
	public void user_search_different_companies_given_as_list_and_print_the_details(io.cucumber.datatable.DataTable dataTable) {
	   List<String> data = dataTable.asList();
	   String companyname = null;
	   for(int i = 0 ; i < data.size() ; i ++) {
		   companyname = data.get(i);
		   driver.findElement(By.name("q")).sendKeys(companyname);
		   driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@aria-label='Google Search']")).click();
		   List<WebElement> links = driver.findElements(By.tagName("h3"));
		   for (WebElement link : links) 
		   {
			   System.out.println(link.getText());
		   }
		   driver.get("https://www.google.com/");  
	   }
	}
	
	@When("user search different companies given as Map and print the details")
	public void user_search_different_companies_given_as_map_and_print_the_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   Map<String, String> data = dataTable.asMap();
	   System.out.println(data);
	   driver.findElement(By.name("q")).sendKeys(data.get("companyName"));
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@aria-label='Google Search']"))));
	   driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@aria-label='Google Search' and @value='Google Search']")).click();
	   List<WebElement> links = driver.findElements(By.tagName("h3"));
	   for (WebElement link : links) 
	   {
		   System.out.println(link.getText());
	   }
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}





}
