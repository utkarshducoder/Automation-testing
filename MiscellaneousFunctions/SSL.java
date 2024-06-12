package MiscellaneousFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class SSL {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions(); //Creatin object of ChromeOptions class
		options.setAcceptInsecureCerts(true); //use the method ChromeOptions class setAcceptInsecureCerts and set it to true 
		WebDriver driver = new ChromeDriver(options); //pass the object of CHromeOptions to the bject of WebDriver
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}
}
