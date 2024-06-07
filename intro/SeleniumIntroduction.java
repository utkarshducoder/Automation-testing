package intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class SeleniumIntroduction {
	public static void main(String[] args) {

		
//		//For Google Chrome
////		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UtkarshGupta\\eclipse-workspace\\Introduction\\Driver\\chromedriver-win32\\chromedriver.exe");
////		WebDriver driver = new ChromeDriver();////
////        driver.get("https://www.youtube.com/"); //get() of WebDriver interface is used to fetch the url 
////        System.out.println(driver.getTitle()); //getTitle() method of WebDriver interface will give the title of that page which we have passed in get().
////        System.out.println(driver.getCurrentUrl()); //used for validate whther the same url is opening or not which we have passed in get().
//        driver.close(); //current window gets closed whihc we have passed in get()
//        driver.quit(); //all windows whihc will be operned by selenium will be closed
        
        //For Firefox
//		System.getProperty("webdriver.gecko.driver", "here pass the url of a firefox driver as a value");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("pass teh url whihc we want to target");
//        System.out.println(driver.getCurrentUrl());
//        driver.close();
//        driver.quit();
		
		//For microsoft edge
//		System.getProperty("webdriver.edge.driver", "path of driver of edge");
//		WebDriver driver = new 	EdgeDriver();
//		driver.get("pass the url which we want to render");
//		System.out.println(driver.getCurrentUrl());//to validate teh url
//		driver.close();//close only teh current tab
//		driver.quit();//close all teh tabs
	}
}
