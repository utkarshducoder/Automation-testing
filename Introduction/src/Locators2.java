import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

class Locators2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\UtkarshGupta\\\\eclipse-workspace\\\\Introduction\\\\Driver\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String name = "Utkarsh";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		String password = getPassword(driver);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+ name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	public static String getPassword(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String password=driver.findElement(By.cssSelector("form p")).getText();
		String [] pass = password.split("'");
		String [] finalpassword = pass[1].split("'");
		String fpass = finalpassword[0];
		return fpass;
	}
	
}