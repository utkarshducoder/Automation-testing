package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1000);
		int i=1;
		while(i<=5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		//		System.out.print(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='date2']")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//Now checking if it returns 1 then it is enabled o/w false
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
//			System.out.println("is enabled");
			Assert.assertTrue(true);
		}
		else {
//			System.out.println("is disabled");
			Assert.assertTrue(false);
		}
		
	}
	/*If we want to check about is anything enabled or disabled then instead of using isEnabled we should use this getAttribute("style") whether it is returning
	 * opacity is 1(enabled) or 0.5(disabled) so we will use this if teh text of this is 1 then it is enabled ow disabled
	 * 
	 * 
	 * */

	//<input name="ctl00$mainContent$view_date2" type="text" readonly="readonly" id="ctl00_mainContent_view_date2" class="custom_date_pic required home-date-pick">
}
