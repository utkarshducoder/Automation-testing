package relativeloctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

class FirstProgram {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement element =driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(element)).getText()); //above
		WebElement dateofbirth = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofbirth)).click(); //below
		
		//leftOf
		WebElement left = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(left)).click();
		//rightOf
		WebElement right = driver.findElement(By.cssSelector("label[for='inlineRadio1']"));
		driver.findElement(with(By.tagName("label")).toRightOf(right)).click();
	}
}
