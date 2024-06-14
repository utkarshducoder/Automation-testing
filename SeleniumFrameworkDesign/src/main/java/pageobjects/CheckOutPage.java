package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import abstractcomponents.AbstractComponents;

public class CheckOutPage extends AbstractComponents{
	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;

	@FindBy(css="[class*='btnn']")
	WebElement submit;

	@FindBy(xpath="//button[contains(@class,'ta-item')])[2]")
	WebElement selectCountry;
	
	By countries = By.cssSelector(".ta-results");

	public void selectCountry(String countryName) {
		Actions a = new Actions(driver);
		a.sendKeys(country,countryName).build().perform();
		waitForElementToRender(countries);
		selectCountry.click();
	}
	public ConfirmationPage submitButton() {
		submit.click();
		return new ConfirmationPage(driver);
	}
}
//		Actions a = new Actions(driver);
//		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build().perform();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results ")));
//		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
//		driver.findElement(By.cssSelector("[class*='btnn']")).click();