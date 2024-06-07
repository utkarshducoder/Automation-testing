package window;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WindowActivity {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\UtkarshGupta\\\\eclipse-workspace\\\\Introduction\\\\Driver\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
	}
}
