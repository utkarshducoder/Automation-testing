package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.CartPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginStep {
	public WebDriver driver;
	public LoginPage lpage;
	public CartPage cpage;

	@Given("user open url as {string}")
	public void user_open_url_as(String url) {
		driver = new ChromeDriver();
		lpage = new LoginPage(driver);
		cpage = new CartPage(driver);
		driver.manage().window().maximize();
		driver.get(url);

	}

	@And("clicks on username filed and enter username as {string}")
	public void clicks_on_username_filed_and_enter_username_as(String name) {
		lpage.enterUserName(name);
	}



	@And("password as {string}")
	public void password_as(String password) {
		lpage.enterPassword(password);
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		lpage.clickSubmit();
	}

	@Then("user is redirected to the Home page and text is {string}")
	public void user_is_redirected_to_the_home_page_and_text_is(String expectedText) {
		String actualText = lpage.homePage();
		Assert.assertEquals(expectedText, actualText);
	}
	public void tearDown() {
		driver.close();
	}

	
	///////////Product Page/////////////////
	@Then("user clicks on Add to cart where name of product name is Sauce Labs Bolt T-Shirt")
	public void user_clicks_on_add_to_cart_where_name_of_product_name_is_sauce_labs_bolt_t_shirt() {

	}

	@Then("click on add to cart where name of product name is Sauce Labs Fleece Jacket")
	public void click_on_add_to_cart_where_name_of_product_name_is_sauce_labs_fleece_jacket() {

	}


}
