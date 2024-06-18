package testing;

import static org.testng.Assert.assertTrue;

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

import pages.CartPage;
import pages.InventoryPage;
import pages.LoginClass;
import testdata.BaseTest;

public class StandAlone2 extends BaseTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String productName = "Sauce Labs Bolt T-Shirt";
		//Code for login page
		LoginClass login = new LoginClass(driver);
		login.loginDetails("standard_user","secret_sauce");
		
		//Code for inventory page
		InventoryPage inventory = new InventoryPage(driver);
		List<WebElement> products=inventory.getProductList();
		inventory.addProduct(productName);
	
		//redirecting to cartpage
		driver.findElement(By.cssSelector("a[class='shopping_cart_link']")).click();
		
		//Cart Page
//		String text1 =  driver.findElement(By.cssSelector("div[class='cart_item_label'] div[class='inventory_item_name']")).getText();
//		System.out.println(text1);
		CartPage cart = new CartPage(driver);
		Boolean match=cart.verifyProduct(productName);
		Assert.assertFalse(match);
//		Assert.assertEquals(text1, "Sauce Labs Bolt T-Shirt");
//		Thread.sleep(2000);
//		
//		//Checkout Page
		
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Utkarsh");
		driver.findElement(By.id("last-name")).sendKeys("Gupta");
		driver.findElement(By.id("postal-code")).sendKeys("302020");
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		driver.close();
	}


}
