package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement addToCart1;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement addToCart2;
	
	public void clickItemOne() {
		addToCart1.click();
	}
	public void clickItemTwo() {
		addToCart2.click();
	}
}
