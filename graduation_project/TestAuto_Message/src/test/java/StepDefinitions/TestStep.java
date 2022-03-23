package StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStep {
WebDriver driver = null;

@Given("^user is on homepage$")
public void end_user_is_on_homepage() throws Throwable {
System.setProperty("webdriver.chrome.driver","/Users/nguyenthidiem/Desktop/Test_Gra_Project/chromedriver");
driver = new ChromeDriver();

driver.get("https://little-star-web.herokuapp.com/?fbclid=IwAR0H4fclINMN_Sk4TVq5AglbRt_kLBfqJQTFCXnS9oDt9AcGVXEdQtlmg7Y#home");
}

// Verify little star page
@And("^verify little star page$")
public void verify_little_star_page() throws Throwable {

String manageCusPageUrl = driver.getCurrentUrl();
Assert.assertEquals(manageCusPageUrl,
"https://little-star-web.herokuapp.com/?fbclid=IwAR0H4fclINMN_Sk4TVq5AglbRt_kLBfqJQTFCXnS9oDt9AcGVXEdQtlmg7Y#home");
// Verify title
String manageCusPageTitle = driver.getTitle();
Assert.assertEquals(manageCusPageTitle, "Little Star");

}

@When("^user navigates to contact page$")
public void user_navigates_to_contact_page() throws Throwable {
driver.findElement(By.xpath("//a[contains(text(),'Liên Hệ')]")).click();
}
@When("^user enters <username> and <email> and <feedback>$")
public void user_enters_username_and_email_and_feedback() throws Throwable {
driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Diem");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("diem.nguyen22@student.passerellesnumeriques.org");
driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Hai long voi san pham");
}

@When("^user enters <username> and <feedback>$")
public void user_enters_name_and_feedback() throws Throwable {
driver.findElement(By.xpath("//input[@name='name']")).sendKeys("DiemNguyen");
driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Hai long voi san pham");


}
@When("^user enters <username> and <email>$")
public void user_enters_username_and_email_() throws Throwable {
driver.findElement(By.xpath("//input[@name='name']")).sendKeys("DiemNguyen");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("diem.nguyen22@student.passerellesnumeriques.org");

}
@When("^user enters <email> and <feedback>$")
public void user_enters_email_and_feedback() throws Throwable {
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("diem.nguyen22@student.passerellesnumeriques.org");
Thread.sleep(1000);
driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Hai long voi san pham");

}
@When("^user enters <username>$")
public void user_enters_username() throws Throwable {
driver.findElement(By.xpath("//input[@name='name']")).sendKeys("DiemNguyen");

}
@When("^user enters <email>$")
public void user_enters_email() throws Throwable {
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("diem.nguyen22@student.passerellesnumeriques.org");
Thread.sleep(1000);

}
@When("^user enters <feedback>$")
public void user_enters_feedback() throws Throwable {
driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Hai long voi san pham");
Thread.sleep(1000);
}
@When("^user enters invalid <email>$")
public void user_enters_invalid_email() throws Throwable {
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("diem.nguyen22passerellesnumeriques.org");
Thread.sleep(1000);
}



@And("^user click on the <submit> button$")
public void user_click_on_the_submit_button() throws Throwable {
driver.findElement(By.xpath("//button[@type='submit']")).submit();
Thread.sleep(3 * 1000);

}
@And("^user click Ok of alert box$")
public void user_click_Ok_of_alert_box() throws Throwable {

Alert alert = driver.switchTo().alert();
alert.dismiss();
}
@Then("^success message is displayed$")
public void success_message_is_displayed() {
driver.quit();
System.out.println("Successfully excution");
}

}