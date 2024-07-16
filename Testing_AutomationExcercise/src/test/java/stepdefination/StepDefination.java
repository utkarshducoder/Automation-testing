package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobject.LoginWithValidCredentials;
import pageobject.Register;

public class StepDefination {

	public WebDriver driver;
	public Register registerobj;
	public LoginWithValidCredentials logincredentials;

	@Given("user should open the browser")
	public void user_should_open_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		registerobj = new Register(driver);
		logincredentials = new LoginWithValidCredentials(driver);
	}

	@And("search for {string}")
	public void search_for(String url) {
		driver.get(url);
	}
	
	//Register//
	@Given("user enters the name as {string} and email address as {string}")
	public void user_enters_the_name_as_and_email_address_as(String name, String emailaddress) throws InterruptedException {
		registerobj.enterUserName(name);
		Thread.sleep(2000);
		registerobj.enterEmailAddress(emailaddress);
	}


	@Then("click on sign up button")
	public void click_on_sign_up_button() {
		registerobj.clickOnSignUpBtn();
	}

	@Then("user fills the account information")
	public void user_fills_the_account_information() {
		registerobj.enterPassword("Dangerutk@rsh24");
		registerobj.clickDays();
		registerobj.selectDate();
		registerobj.clickMonths();
		registerobj.selectMonth();
		registerobj.selectYears();
		registerobj.selectYear();
		registerobj.enterFirstName("Utkarsh");
		registerobj.enterLastName("Gupta");
		registerobj.selectAddress("Mansarover");
		registerobj.selectState("Rajasthan");
		registerobj.selectCity("Jaipur");
		registerobj.selectZipCode("302020");
		registerobj.selectMobileNumber("7424898333");
		
	}

	@Then("click on Create Account button")
	public void click_on_create_account_button() {
		registerobj.clickCreateAccountBtn();
	}

	@And("get message as {string}")
	public void get_message_as(String expectedText) {
		String actualText = registerobj.getSucsessMessage();
		Assert.assertEquals(expectedText, actualText);
	}

	//Login//
	@And("user enters email address as {string} and password as {string}")
	public void user_enters_email_address_as_and_password_as(String mail, String pwd) throws InterruptedException {
		logincredentials.enterEmailAddress(mail);
		Thread.sleep(2000);
		logincredentials.enterPassword(pwd);
	}

	@Then("clicks on Login button")
	public void clicks_on_login_button() {
		logincredentials.clickOnLoginButton();
	}

	@Then("user is redirected to the Home page")
	public void user_is_redirected_to_the_home_page() {
		String actualTitle = logincredentials.getTitleOfHomePage();
		Assert.assertEquals("Automation Exercise", actualTitle);
	}
	
	@Then("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		logincredentials.clickOnLogoutButton();
	}







}
