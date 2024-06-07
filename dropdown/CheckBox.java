package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CheckBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//isSelected() is used to check whether the checkbox is selected or not return boolean value
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//size() is used to get teh count of total elements whihc are mentioned
	}

}
//<input id="ctl00_mainContent_chk_SeniorCitizenDiscount" type="checkbox" name="ctl00$mainContent$chk_SeniorCitizenDiscount">