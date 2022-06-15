package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{
	WebDriver driver = null;
	@FindBy(name = "q")
	WebElement searchBox;
	
	@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@aria-label='Google Search']")
	WebElement searchButton;
	
	@FindBy(tagName = "h3")
	List<WebElement> results;
	
	public void enterSearchEle(String companyName)
	{
		searchBox.sendKeys(companyName);
	}
	
	public void clickOnSearch()
	{
		Actions act = new Actions(driver);
		act.click(searchButton).perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void pirntResults() {
		results = driver.findElements(By.tagName("h3"));
		   for (WebElement link : results) 
		   {
			   System.out.println(link.getText());
		   }
	}
	public List<WebElement> totalResults() {
		   return results = driver.findElements(By.tagName("h3"));
	}
	
	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	
	

}
