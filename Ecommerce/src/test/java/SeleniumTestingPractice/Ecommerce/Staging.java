package SeleniumTestingPractice.Ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Staging {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait;

	@Test
	public void setup() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("mobile");
		Thread.sleep(1000);
		search.sendKeys(Keys.RETURN);
		//		Thread.sleep(2000);
		//		driver.findElement(null)
		
		String actual = driver.findElement(By.xpath("//span[@class='BUOuZu']/span")).getText();
		String  expected = "mobile"; 
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label/div[contains(text(),'SAMSUNG')]")).click();
		Thread.sleep(1000);
//		driver.findElement(null)
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,400)");
	
		driver.findElement(By.xpath("//div[@class='bs1+1t']/div[@title='4★ & above']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class, 'tUxRFH')]//div[contains(@class, 'row')]//div[contains(text(), 'SAMSUNG Galaxy F14 5G (GOAT Green, 128 GB)')]")).click();
		
	}
//	
//	@Test
//	public void selectingMobile() throws InterruptedException {
////		Thread.sleep(4000);
////		driver.findElement(By.xpath("//div[contains(@class, 'tUxRFH')]//div[contains(@class, 'row')]//div[contains(text(), 'SAMSUNG Galaxy F14 5G (GOAT Green, 128 GB)')]")).click();
//	}

}
