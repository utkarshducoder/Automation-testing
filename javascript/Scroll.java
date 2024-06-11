package javascript;

import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class Scroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver; //Step1: to create an object of JavascriptExecutor
		js.executeScript("window.scrollBy(0,500)"); //used to scroll down the page whihc i currently open
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //used to scroll the partiular elemnet in whole window
		
		//Sum the elements present indies the table element 
	List<WebElement> elements = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int sum=0;
	for(int i=0;i<elements.size();i++) {
		sum += Integer.parseInt(elements.get(i).getText());
	}
	System.out.println(sum);
	int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
	Assert.assertEquals(total, sum);
	}
}
