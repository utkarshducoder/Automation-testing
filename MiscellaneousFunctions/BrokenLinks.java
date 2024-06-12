package MiscellaneousFunctions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");//for particular one link
		List<WebElement> links = driver.findElements(By.cssSelector("table[class='gf-t'] tbody tr td ul li[class='gf-li'] a"));
		SoftAssert s = new SoftAssert();
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
			//openConnection method is present in URL class so we have created object of URL class like this new URL()
			//return type of openConnection() is HttpURLConnection and we are doing casting also here 
			conn.setRequestMethod("HEAD"); //using method HEAD for connection of request
			conn.connect();//now we have sucsessfully conneted the link
			int respcode = conn.getResponseCode();
			System.out.println(respcode); //gives the code of response
			/*
			 * If Status code is greater then 400 then that is a broken link
			 * If status code is 200 to 399 then correct link
			 */
//			if(respcode>400) {
//				System.out.println("The link is broken with text "+link.getText());
//				Assert.assertTrue(false);
//			}
			s.assertTrue(respcode<400,"The link is broken with text"+link.getText());
		}
		s.assertAll();
		
		
		
		
		
		
		
		
		
		
//		
//		HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
//		//openConnection method is present in URL class so we have created object of URL class like this new URL()
//		//return type of openConnection() is HttpURLConnection and we are doing casting also here 
//		conn.setRequestMethod("HEAD"); //using method HEAD for connection of request
//		conn.connect();//now we have sucsessfully conneted the link
//		System.out.println(conn.getResponseCode()); //gives the code of response
		/*
		 * If Status code is greater then 400 then that is a broken link
		 * If status code is 200 to 399 then correct link
		 */
		
	}
}
