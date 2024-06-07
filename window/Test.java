package window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Test {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".yt-spec-touch-feedback-shape__fill")).click();
		
//		driver.findElement(null)
//		driver.close();
	}
//	<div class="yt-spec-touch-feedback-shape__fill" style=""></div>
}
