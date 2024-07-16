package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProducts {
	public WebDriver driver;
	public SearchProducts() {
		this.driver = driver;
		
	}
	
	@FindBy(xpath = "//a[@href='/products']")
	WebElement productLink;
	
	@FindBy(id = "search_product")
	WebElement searchProduct;
	
	@FindBy(id = "submit_search")
	WebElement ;
	
	
}


/*@Then("search for url {string}")
public void search_for_url(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("click on Products link")
public void click_on_products_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user is redirected to the all products page")
public void user_is_redirected_to_the_all_products_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("search for product {string}")
public void search_for_product(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("clicks on search button")
public void clicks_on_search_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("{string} is visible")
public void is_visible(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


*/