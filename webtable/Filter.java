package webtable;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class Filter {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Pineapple");
		List<WebElement>veggies=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		List vegetables=veggies.stream().filter(s->s.getText().contains("Pineapple")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), vegetables.size());
	}
}
