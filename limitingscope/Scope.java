package limitingscope;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Scope {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1.) get the count of how many links are there on the page
		
		System.out.println("Count of driver "+driver.findElements(By.tagName("a")).size());
		
		//Creating sub driver element for particualar section
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limitig webDriver scope
		
		//2.) Count of footer section links	
		
		System.out.println("Count of sub driver "+ footerdriver.findElements(By.tagName("a")).size());
		
		//3.) To get the count of links present in one ofteh section of footer 
		
		WebElement uldriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println("Count of ul driver "+uldriver.findElements(By.tagName("a")).size());
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//4.) Now we need to check whether the links present inside uldriver are working or not except 0th index link
		
		for(int i=1;i<uldriver.findElements(By.tagName("a")).size();i++) {
			
			String clickonnewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//			driver.findElements(By.tagName("a")).get(i).sendKeys(clickonnewtab);
//			
			WebElement link = uldriver.findElements(By.tagName("a")).get(i);
            wait.until(ExpectedConditions.elementToBeClickable(link));
            link.sendKeys(clickonnewtab);
			Thread.sleep(5000L);
		
		}//opens all the tabs
		
		//5.) Now we need to get the title of each page whihc i sopen in new tab 
		
		Set<String> windows=driver.getWindowHandles();//[first page,second page, third page, fourth page]
		
		Iterator<String>itr = windows.iterator();
		
			while(itr.hasNext()) {
		
				driver.switchTo().window(itr.next());
				
				System.out.println(driver.getTitle());
				
				
			}
			
		}
	}

