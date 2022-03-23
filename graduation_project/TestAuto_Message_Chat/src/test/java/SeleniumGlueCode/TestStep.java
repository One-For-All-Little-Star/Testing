
package SeleniumGlueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStep {
	WebDriver driver = null;

	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","/Users/nguyenthidiem/Desktop/Test_Gra_Project/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://little-star-web.herokuapp.com/?fbclid=IwAR0H4fclINMN_Sk4TVq5AglbRt_kLBfqJQTFCXnS9oDt9AcGVXEdQtlmg7Y#home");
	}

	@And("^verify little star page$")
	public void verify_little_star_page() throws Throwable {
		
		String manageCusPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(manageCusPageUrl,
				"https://little-star-website.herokuapp.com/?fbclid=IwAR23_Bi2AjRkWTA7neMYW2jCQMuogDxWMOGRoQHEkuEhbPvxNxe-IsqJ5iE#home");
		String manageCusPageTitle = driver.getTitle();
		Assert.assertEquals(manageCusPageTitle, "Little Star");
		
		Thread.sleep(6000);
		
	}

	@When("^user clicks message icon$")
	public void user_clicks_message_icon() throws Throwable {
		driver.findElement(By.xpath("//div[@id='f33005dcf493fb8']")).click();
		
		Thread.sleep(1000);
	}
	
	@When("^user clicks on the continue as your account button$")
	public void user_clicks_on_the_continue_as_your_account_button()throws Throwable {
		driver.findElement(By.xpath("//span[@class='continueText _4mr9 _6i6a']"));
	}
	@When("^user clicks on the continue as guest account button$")
	public void user_clicks_on_the_continue_as_guest_account_button()throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Continue as guest')]"));
	}
	@When("^user enters <content> at Ask a question$")
	public void user_enters_content_at_Ask_a_question() throws Throwable{
		driver.findElement(By.xpath("//input[@placeholder='Ask a question…']")).sendKeys("Hello Thanh Nga and our team");
	}
	@And ("^user clicks arrow icon$")
	public void user_clicks_arrow_icon()throws Throwable {
		driver.findElement(By.xpath("//div[@class='_94vh']")).click();
		
	}

	@And("^user clicks close icon$")
	public void user_clicks_close_icon() throws Throwable {
		driver.findElement(By.xpath("//div[@aria-label='close']//*[name()='svg']//*[name()='path' and contains(@d,'M0 16C0 7.')]")).click();
		Thread.sleep(2 * 1000);
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed()throws Throwable {
		driver.quit();
		System.out.println("Successfully excution");
		driver.close();
	}
	
}