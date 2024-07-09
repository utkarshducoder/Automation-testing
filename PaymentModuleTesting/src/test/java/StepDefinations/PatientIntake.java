package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.Dashboard;
import PageObject.Login;
import io.cucumber.java.en.*;

import java.time.Duration;

import org.junit.Assert;

public class PatientIntake {

	WebDriver driver;
	Login log;
	Dashboard dash;

	@Given("the browser is open")
	public void the_browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		log = new Login(driver);
		dash = new Dashboard(driver);
		driver.get("https://staging-portal.centerforvein.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "SSO";
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(log.loginToCVR)).click();
	}

	@When("type username as {string}")
	public void type_username_as(String name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Add this block to handle multiple window contexts 
		//This thing is used when the page is opening in a new tab
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		wait.until(ExpectedConditions.visibilityOf(log.userName)).sendKeys(name);
	}

	@When("password as {string}")
	public void password_as(String pwd) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Add this block to handle multiple window contexts
		//This thing is used when the page is opening in a new tab
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		wait.until(ExpectedConditions.visibilityOf(log.pass)).sendKeys(pwd);
	}

	@Then("click on Login button")
	public void click_on_login_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Add this block to handle multiple window contexts
		//This thing is used when the page is opening in a new tab
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		wait.until(ExpectedConditions.elementToBeClickable(log.loginButton)).click();
	}

	@Then("click on PatientIntake")
	public void click_on_patient_intake() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		for(String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(log.patientIntake)).click();
		//    	log.clickIntake();
	}

	
	///////////////Dashboard///////////////////
	@Given("the user should be on dashboard page")
	public void the_user_should_be_on_dashboard_page() throws InterruptedException {

		Thread.sleep(4000);
		String actualText = driver.getTitle();
		String expectedText = "Patient Intake Portal";
		Assert.assertEquals(expectedText, actualText);
	}

	@Then("click on Payments")
	public void click_on_payments() {

	}


	


}
