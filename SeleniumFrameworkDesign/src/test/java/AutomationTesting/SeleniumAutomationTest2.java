package AutomationTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Landing;
import pageobjects.ProductCatalogue;

class SeleniumAutomationTest2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Object of Landing class
		
		Landing ln = new Landing(driver);	
		
		ln.goTo(); //driver.get("url")
		
		ln.landingDetails("guptautkarsh53@gmail.com","UtkarshGupta@24"); //userEmail.sendKeys and password.sendKeys
		
//		driver.findElement(By.id("userEmail")).sendKeys("guptautkarsh53@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("UtkarshGupta@24");
//		driver.findElement(By.id("login")).click();
		
		//Object of ProductCatalogue
		
		List<WebElement> items = driver.findElements(By.cssSelector("div.col-lg-4"));
		WebElement item = items.stream().filter(s ->s.findElement(By.cssSelector(".card-body b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		item.findElement(By.cssSelector(".card-body button:last-of-type")).click(); 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container"))); //this element is visible on the screen it willw ait
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("button[routerlink*='cart']")).click();
		List<WebElement>cartprods = driver.findElements(By.cssSelector("ul[class='cartWrap ng-star-inserted']"));
		Boolean flag =cartprods.stream().anyMatch(s->s.findElement(By.cssSelector("ul h3")).getText().equals("ZARA COAT 3"));
		//		System.out.println(flag);
		Assert.assertTrue(flag);
		System.out.println("Item is presnt");
		driver.findElement(By.cssSelector("li[class='totalRow'] button")).click();

		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results ")));
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		driver.findElement(By.cssSelector("[class*='btnn']")).click();
		String text = driver.findElement(By.className("hero-primary")).getText();
		Assert.assertTrue(text.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}
	
}
