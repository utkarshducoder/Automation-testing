package webtable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class LiveDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement>elements = driver.findElements(By.xpath("//tbody//tr/td[1]"));
		List<String>originallist = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		for(String str:originallist) {
			System.out.println(str);
		}
		System.out.println("---------");
		List<String> resultantlist = originallist.stream().sorted().collect(Collectors.toList());
		for(String st:resultantlist) {
			System.out.println(st);
		}
		Assert.assertTrue(originallist.equals(resultantlist));
		
		//scan the column and getText as Beans
		List<String>price;
		do {
			List<WebElement>rows = driver.findElements(By.xpath("//tbody//tr/td[1]"));
		price = rows.stream().filter(a->a.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		if(price.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
	}while(price.size()<1);
	}

	public static String getPrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
}
