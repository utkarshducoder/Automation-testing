package testing;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StandAlone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//Code for login page
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		//inventory page
		List<WebElement>products=driver.findElements(By.cssSelector("div[class='inventory_item']"));
		//		for(WebElement pro:products) {
		//			System.out.println(pro.getText());
		//		}
		
		WebElement item = products.stream()
				.filter(s -> {
					try {
						// Locate the product name element
						WebElement nameElement = s.findElement(By.cssSelector(".inventory_item_name"));
						String productName = nameElement.getText();
						System.out.println("Product Name: " + productName); // Debugging line
						return productName.equals("Sauce Labs Bolt T-Shirt");
					} catch (Exception e) {
						System.out.println("Element not found in this product: " + e.getMessage());
						return false;
					}
				})
				.findFirst()
				.orElse(null);

		if (item == null) {
			System.out.println("Item not found");
		} else {
			System.out.println("Item found: " + item.findElement(By.cssSelector(".inventory_item_name")).getText());
			// Click the "Add to cart" button
			WebElement addToCartButton = item.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-bolt-t-shirt']"));
			addToCartButton.click();
			System.out.println(item.getText());
			System.out.println("Add to cart button clicked");
		}
		
		
		//Cart Page
		String text1 =  driver.findElement(By.cssSelector("div[class='cart_item_label'] div[class='inventory_item_name']")).getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "Sauce Labs Bolt T-Shirt");
		Thread.sleep(2000);
		
		//Checkout Page
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Utkarsh");
		driver.findElement(By.id("last-name")).sendKeys("Gupta");
		driver.findElement(By.id("postal-code")).sendKeys("302020");
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
	}


}
