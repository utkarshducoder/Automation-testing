package spicejettesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class FinalTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//Step1: opening the url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Step2: From (Selecting the from city)
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		//Step3: Selecting the city 
		driver.findElement(By.cssSelector("a[value='JAI']")).click();
		Thread.sleep(1000);
		//Step4: Now selecting the city(to city)
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();//here we need to use this syntax of xpath because there are two places where this name is present
		//Step5: Selecting the data
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//Step6: Make sure that the other calander is disabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
		}

		//Step7: To select the number of passenger
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		int i=1;
		while(i<=5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		//Step8: to validate number of passenger
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");

		//Step9: to select the checkbox as Family and Friends
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(4000);
		//Step10: To click onSubmit button
		driver.findElement(By.cssSelector("input[id*='FindFlights']")).click();
	}
}
