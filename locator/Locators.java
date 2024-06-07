package locator;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UtkarshGupta\\eclipse-workspace\\Introduction\\Driver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//used to manage the time of Selenium
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Utkarsh");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("guptautkarsh53@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7424898000");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7424898333");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Utkarsh");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.cssSelector("#chkboxOne")).click();
		WebElement checkbox1 = driver.findElement(By.id("chkboxOne"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox1);
		WebElement checkbox2 = driver.findElement(By.id("chkboxTwo"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox2);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.submit")));
        submitButton.click();
//		driver.findElement(By.cssSelector("button[class='submit']")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}
}
