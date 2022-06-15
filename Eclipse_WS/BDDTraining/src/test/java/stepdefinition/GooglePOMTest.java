package stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.GooglePage;

public class GooglePOMTest {

	WebDriver driver = null;
	GooglePage gPage = null;

	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		gPage = new GooglePage(driver);

	}

	@Given("pomuser is on google page")
	public void pomuser_is_on_google_page() {
		driver.get("https://www.google.com/");

	}

	@When("pomuser enters {string} in searcbox")
	public void pomuser_enters_in_searcbox(String cn) {
		gPage.enterSearchEle(cn);
	}

	@When("pomuser click on Search Button")
	public void pomuser_click_on_search_button() throws InterruptedException {
		gPage.clickOnSearch();
		Thread.sleep(5000);
	}

	@Then("pomuser application should display results")
	public void pomuser_application_should_display_results() {
		Assert.assertTrue(gPage.totalResults().size() > 0);
	}

	@Then("pomuser will print all results contains {string}")
	public void pomuser_will_print_all_results_contains(String string) {
		gPage.pirntResults();
	}

}
