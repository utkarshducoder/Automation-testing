package patienttest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Form {
	//	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	
	
	@DataProvider(name = "searchDataSet")
	public Object[][] middleData() {
	    return new Object[][] {
	        { "gupta" },
	        { "singh" },
	        { "mishra" }
	    };
	}
//	@DataProvider(name="selectAddress")
//	public Object[] getAddress() {
//		return new Object[] {"Test1","Test2","Test3"};
//	}
//
//	@DataProvider(name="selectCity")
//	public Object[] cityDetails() {
//		return new Object[] {"kolkata","mumbai","Delhi"};
//	}
//
//	@DataProvider(name = "contact")
//	public Object[] gtNumber() {
//		return new Object[] {"1234567899","1234567898","1234567890"};
//	}
//
	@Test(dataProvider = "searchDataSet")
	public void middleName(String name) {
	    // Wait
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS); // Adjust the timeout as per your needs

	    // Opening link
	    driver.get("https://forms.centerforvein.com/#/patient-intake/AE935E8D-5541-4B56-B26B-5D2001D7E243");

	    WebElement element = driver.findElement(By.xpath("//input[@name='data[patient_middle_name]']"));
	    element.clear();
	    element.sendKeys(name);
	    
	    
	}
	
//
//	@Test(dataProvider = "selectAddress",enabled = false)
//	public void setAddress1(String address) throws InterruptedException {
//		WebElement address1 = driver.findElement(By.xpath("//input[@name='data[patient_address_line_1]']"));
//		address1.clear();
//		Thread.sleep(2000);
//		address1.sendKeys(address);
//	}
//
//	@Test(dataProvider = "selectCity",enabled = false)
//	public void selectCity(String selectcity) throws InterruptedException {
//		WebElement city = driver.findElement(By.xpath("//input[@name='data[patient_city]']"));
//		//		Thread.sleep(2000);
//		city.clear();
//		Thread.sleep(2000);
//		city.sendKeys(selectcity);
//
//	}
//	
//	@Test(dataProvider = "contact",enabled = false)
//	public void patientContact(String number) throws InterruptedException {
//		WebElement phone = driver.findElement(By.xpath("//input[@name='data[patient_cell_phone]']"));
//		phone.clear();
//		Thread.sleep(1000);
//		phone.sendKeys(number);
//	}
	@Test
	public void selectGender() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@aria-autocomplete='list'])[4]")).click();
	}

//	@Test
//	public void fillEthnicity() {
//		WebElement lists = driver.findElement(By.xpath("//div[@class='choices__list choices__list--dropdown is-active']/div[@role='listbox']"));
//		
//	}

	//(//select[@name='data[patient_ethnicity]'])
}








