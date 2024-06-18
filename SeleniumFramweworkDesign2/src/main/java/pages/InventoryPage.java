package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	WebDriver driver;
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="div[class='inventory_item']")
	List<WebElement> products;

	By addToCart = By.cssSelector("button[data-test='add-to-cart-sauce-labs-bolt-t-shirt']");
	public List<WebElement> getProductList() {
		return products;
	}
	public WebElement getProduct(String productName) {
		WebElement prod = products.stream().filter(product -> product.findElement(By.cssSelector(".inventory_item_name")).getText().equals("Sauce Labs Bolt T-Shirt"))
				.findFirst()
				.orElse(null);
		return prod; //here we have got single product from the list of products whihc is in pro
	}
	
	public void addProduct(String productName) {
		WebElement item = getProduct(productName); //here item contains single product
		item.findElement(addToCart).click();
		System.out.println("Hi clicked");
	}
}
