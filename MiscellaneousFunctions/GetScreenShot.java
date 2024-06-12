package MiscellaneousFunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GetScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.16.1");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\UtkarshGupta\\screen.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		//Step1: do casting of WebDriver object to TakeScreenShot and invoking getScreenShotAs(OutputType.FILE)
//		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//Step2: moving the screenshot from src to local directory of our system
//		FileUtils.copyFile(src, new File("C:\\Users\\UtkarshGupta\\screenshot.png"));
	}
}
