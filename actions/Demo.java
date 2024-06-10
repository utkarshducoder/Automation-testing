package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Demo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=2396605800976333190&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061781&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		//Now to perform action we need to create the object of Actions class
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
		
	}
}
//<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="Search Amazon.in" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search Amazon.in" spellcheck="false">

/*
 * moveToElement(): used to move the cursor to the center of the specified element
 * build(): used to make the action ready to execute
 * perform(): used to execute the action
 * contextClick(): used to do right click on the specified element
 * keyDown(): used to press the particular key
 * doubleClick(): used to do double click
 * */	
 