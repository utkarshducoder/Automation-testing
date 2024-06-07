package dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
//		int i=1;
//		while(i<=5) {
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//		}
//		Thread.sleep(1000);
//		driver.findElement(By.className("buttonN")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//one more way is driver.findElement(By.xpath("//parent tagname[@attribute='value'] space //child tagname[@attribute='value']"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
//		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='22']")).click();

		
	}

}
