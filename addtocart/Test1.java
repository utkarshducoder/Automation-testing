package addtocart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Test1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		addToCart(driver);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button[@type='button']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy"); //will not work because it requires some wait time so synchronization should be used
		driver.findElement(By.className("promoBtn")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}
	public static void addToCart(WebDriver driver) {
		String []veggies = {"Cucumber","Brocolli","Beetroot"};
		List<WebElement> elements=driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for(int i=0;i<elements.size();i++) {
			String []name = elements.get(i).getText().split("-");
			//now we are getting the text of each elment present at each index and splitting them with - so it gies array
			String resultantfruit = name[0].trim();
			System.out.println(resultantfruit);
			//removing the pace if it is there
			List<String> al = Arrays.asList(veggies);
			for(int x=0;x<al.size();x++) {
				System.out.println(al.get(x));
			}
			List arr = Arrays.asList(veggies);
			if(arr.contains(resultantfruit)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==veggies.length)
					break;
			}
		}
		
	}
}
	