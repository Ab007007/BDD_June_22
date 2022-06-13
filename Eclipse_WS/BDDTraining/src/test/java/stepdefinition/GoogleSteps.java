package stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSteps {

	WebDriver driver = null;
	@Given("user is on google page")
	public void user_is_on_google_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().contains("Google"));		
	}
	@When("use enter synechron in searcbox")
	public void use_enter_synechron_in_searcbox() {
	    
		driver.findElement(By.name("q")).sendKeys("synechron");
	   
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
	@Then("user will print all hyperlinks contains Synechron")
	public void user_will_print_all_hyperlinks_contains_synechron() {
	   List<WebElement> links = driver.findElements(By.tagName("h3"));
	   for (WebElement link : links) 
	   {
		   System.out.println(link.getText());
	   }
	   
	}


}
