package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.AbstractComponents;

public class CartPage extends AbstractComponents{
	WebDriver driver;
	public CartPage(WebDriver driver){
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="['cartWrap ng-star-inserted']")
	List<WebElement> cartpro;
	
	@FindBy(css="[totalRow'] button")
	WebElement checkoutFile;
	
	By product = By.cssSelector("ul h3");
	
	public boolean verifyProductDisplay(String productName) {
		Boolean match =cartpro.stream().anyMatch(product->product.getText().equals(productName));
		return match;
	}
	public CheckOutPage goToCheckOut() {
		checkoutFile.click();
		return new CheckOutPage(driver);
		
	}
}
