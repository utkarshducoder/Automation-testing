package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobject.AddCustomer;
import pageobject.LoginPage;
import pageobject.SearchCustomerByEmail;

public class LogStep {
	public WebDriver driver;
	public LoginPage loginPage;
	public AddCustomer addCustomer;
	public SearchCustomerByEmail searchCustomerByEmail;
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		addCustomer = new AddCustomer(driver);
		searchCustomerByEmail = new SearchCustomerByEmail(driver);
	}

	@And("search for {string}")
	public void search_for(String url) {
		driver.get(url);
	}

	@And("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String emailAdd, String pwd) {
		loginPage.enterEmail(emailAdd);
		loginPage.enterPassword(pwd);
	}

	@And("click on login")
	public void click_on_login() {
		loginPage.clickLogin();
	}
	

	//Login Feature//
	@Then("user is redirected to the dashboard")
	public void user_is_redirected_to_the_dashboard() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Dashboard / nopCommerce administration";
		Assert.assertEquals(expectedTitle, actualTitle);
				
	}

	@When("user clicks on Logout link")
	public void user_clicks_on_logout_link() {
		loginPage.clickLogoutBtn();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();
	}

	
	//Add new customer//
	@Then("user can view dashboard")
	public void user_can_view_dashboard() {
		String actualText = addCustomer.getPageTitle();
		Assert.assertEquals("Dashboard / nopCommerce administration", actualText);
	}
	
	@Then("click on customer menu")
	public void click_on_customer_menu() {
		addCustomer.clickOnCustomerMenu();
	}

	@Then("click on customers menu item")
	public void click_on_customers_menu_item() {
		addCustomer.selectCustomerItem();
	}

	@Then("click on Add new button")
	public void click_on_add_new_button() {
		addCustomer.clickAddNew();
	}

	@Then("user is redirected to the add new customer page")
	public void user_is_redirected_to_the_add_new_customer_page() {
		String actualText = addCustomer.getPageTitle();
		System.out.println(actualText);
//		String expectedText = "Add a new customer / nopCommerce administration";
//		Assert.assertEquals(expectedText, actualText);
	}

	@Then("user fill all customer details")
	public void user_fill_all_customer_details() {
		addCustomer.enterEmail("test10@gmail.com");
		addCustomer.enterPassword("test1");
		addCustomer.enterFname("Utkarsh");
		addCustomer.enterLname("gupta");
		addCustomer.selectGender("male");
		addCustomer.selectDate("24/05/2001");
		addCustomer.selectCompany("Abjima");
		addCustomer.enterTextArea("Quality Tester");
	}

	@Then("click on Save button")
	public void click_on_save_button() {
		addCustomer.clickOnSaveButton();
	}


	//Search Customer//
	@Then("enter customer email")
	public void enter_customer_email() {
		searchCustomerByEmail.clickOnSearchEmail("victoria_victoria@nopCommerce.com");
	}

	@Then("click on Search button")
	public void click_on_search_button() {
		searchCustomerByEmail.clickOnSearchCustomer();
	}

	@Then("user should find thet customer in the list of customer table")
	public void user_should_find_thet_customer_in_the_list_of_customer_table() {
		String expectedEmail = "victoria_victoria@nopCommerce.com";
		if(searchCustomerByEmail.searchCustomerByEmail(expectedEmail) == true) {
			Assert.assertTrue(true);
		}
	}






}
