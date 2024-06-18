package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(css="div[class='cart_item_label'] div[class='inventory_item_name']")
//	WebElement text1;
	
	@FindBy(id="checkout")
	WebElement checkoutBtn;
	
	@FindBy(css="div[class='inventory_item']")
	List<WebElement> products;
	
	public Boolean verifyProduct(String productName) {
		Boolean match = products.stream().anyMatch(s->s.getText().equals(productName));
		return match;
	}
//	public void goToChekoutPage() {
//		checkoutBtn.click();
//	}
}
//String text1 =  driver.findElement(By.cssSelector("div[class='cart_item_label'] div[class='inventory_item_name']")).getText();
//System.out.println(text1);
//
//Assert.assertEquals(text1, "Sauce Labs Bolt T-Shirt");