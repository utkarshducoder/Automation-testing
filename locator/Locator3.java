package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locator3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UtkarshGupta\\eclipse-workspace\\Introduction\\Driver\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(	driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	
		
		
	}

}
