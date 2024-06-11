package limitingscope;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Scope1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement uldriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(uldriver.findElements(By.xpath("//table/tbody/tr/td[1]/ul[1]/li")).size());
		int count = uldriver.findElements(By.xpath("//table/tbody/tr/td[1]/ul[1]/li")).size();
		for(int i=1;i<count;i++) {
			String clickonnewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			WebElement link = uldriver.findElements(By.tagName("a")).get(i);
			link.sendKeys(clickonnewtab);
		}
		Set<String> str = driver.getWindowHandles();
		Iterator<String> itr =str.iterator();
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		
	}
}
