//package StepDefinations;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.en.*;
//
//public class GoogleSearchSteps {
//	
//	WebDriver driver = new ChromeDriver();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		driver.manage().window().maximize();
//		System.out.println("First Step to open the browser");
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		driver.get("https://www.google.com/");
//		System.out.println("make sure user is on google serahc page");
//	}
//
//	@When("user enters text in the searhc box")
//	public void user_enters_text_in_the_searhc_box() {
//		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation step by step");
//		System.out.println("Next step the user enters teh text whihc they want to search");
//	}
//
//	@And("hits enter key")	
//	public void hits_enter_key() {
//		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
//		System.out.println("After writting the text the user press the enter key");
//	}
//
//	@Then("user is navigated to search reults")
//	public void user_is_navigated_to_search_reults() {
//		driver.getPageSource().contains("Online Courses");
//		System.out.println("the end result should be that the user redirects to the seached page");
//	}
//	
//
//
//}
