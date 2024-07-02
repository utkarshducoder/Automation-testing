package StepsForHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HooksDemoSteps {

	WebDriver driver;
	@Before(order = 1, value="@smoke")
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("i am inside browser");
	}
	
	@Before(order = 2)
	public void setup2() {
		System.out.println("I am inside scenrio 2");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
	
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	
	}
	@And("clicks on login button")
	public void cliks_on_login_button() {
	
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
	}
	@After(order = 1)
	public void tearDown() {
		System.out.println("I am in teardown 1");
		driver.close();
	}
	@After(order = 2)
	public void tearDown2() {
		System.out.println("i am in teardown2");
	}



}
