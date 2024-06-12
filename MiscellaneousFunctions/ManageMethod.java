package MiscellaneousFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ManageMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.manage().addCookie("name of the cookie"); //used to add cookies
//		driver.manage().deleteAllCookies(); //used to delete all cookies
//		driver.manage().deleteCookie("name of the cookie); //used to delete particular cookie
		driver.get("https://mail.google.com/mail/u/1/#inbox");
		driver.close();
	}
}
