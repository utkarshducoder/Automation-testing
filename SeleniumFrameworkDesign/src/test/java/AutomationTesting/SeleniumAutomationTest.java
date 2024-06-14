package AutomationTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.CartPage;
import pageobjects.CheckOutPage;
import pageobjects.ConfirmationPage;
import pageobjects.Landing;
import pageobjects.ProductCatalogue;

class SeleniumAutomationTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String productName = "ZARA COAT 3";
		String countryName = "india";
		//Object of Landing class

		Landing ln = new Landing(driver);	

		ln.goTo(); //driver.get("url")

		ProductCatalogue pd = ln.landingDetails("guptautkarsh53@gmail.com","UtkarshGupta@24"); //userEmail.sendKeys and password.sendKeys

		//Object of ProductCatalogue
		List<WebElement>items = pd.getProductList();
		pd.addProductToCart(productName);
		CartPage cp = pd.goToCartPage();
		Boolean match = cp.verifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckOutPage checkoutpage = cp.goToCheckOut();
		checkoutpage.selectCountry(countryName);
		ConfirmationPage confirmpage =checkoutpage.submitButton();
		String confirmMesaage = confirmpage.getConfirmationMessage();
		Assert.assertTrue(confi.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}

}
