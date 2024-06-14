package pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import abstractcomponents.AbstractComponents;

public class ProductCatalogue extends AbstractComponents{
	WebDriver driver;
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="div.col-lg-4")
	List<WebElement> items;

	@FindBy(css="ng-animating")
	WebElement animation;


	//////		driver.findElement(By.cssSelector("button[routerlink*='cart']")).click();
	By products = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastContainer = By.cssSelector("#toast-container");

	public List<WebElement> getProductList() {
		waitForElementToRender(products);
		return items;
	}
	public WebElement getProductByName(String productName) {
		WebElement item = items.stream().filter(s ->s.findElement(By.cssSelector(".card-body b")).getText().equals(productName)).findFirst().orElse(null);
		return item;

	}
	public void addProductToCart(String productName) {
		WebElement item = getProductByName(productName);
		item.findElement(addToCart).click(); 
		waitForElementToRender(toastContainer);
		waitForElementToDisappear(animation);
		
	}
}

