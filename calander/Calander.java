package calander;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

class Calander {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(1000);
		WebElement calendar = driver.findElement(By.id("form-field-travel_comp_date"));
		
		//Date to be selected is December 25
		//Clicking the calander
		
		Actions a = new Actions(driver);
		
		a.click(calendar).build().perform();
		
		//Selecting month
//		System.out.println(driver.findElement(By.cssSelector("div[class='flatpickr-month'] div[class='flatpickr-current-month'] span[class='cur-month']")).getText());
//		while(!driver.findElement(By.cssSelector("div[class='flatpickr-month'] div[class='flatpickr-current-month'] span[class='cur-month']")).getText().contains("November")) {
//			driver.findElement(By.cssSelector(" div[class='flatpickr-month'] span[class='flatpickr-next-month'])")).click();
////			break;
////		}
//		
//			System.out.println("By");
		
		//Grab all the dates on the basis of comman thing here it is the className which is common 
		//Selecting date
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		
		//Now iterate through each day and compare each date whether it is equals to the desired date or not
		
		for(int i=0;i<dates.size();i++) {
		
			String date = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			
			if(date.equals("23")) {
			
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				
				break;
			
			}
		
		}
		
	}

	}
//}
