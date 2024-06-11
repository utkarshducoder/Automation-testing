package frames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class MyFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame"))); //Frames are not identified so we need to switchTo frames like this
		driver.findElement(By.id("draggable")).click(); //after switching to the framwe we are selecting the element inside frame
		Actions a = new Actions(driver); //we need to perform drag and drop action so we need to create Actions class object
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source,destination).build().perform(); //dragAndDrop method accept two arguments whihc are source and destination WebElement
		driver.switchTo().defaultContent(); //This is used to come back from frames to the normal window
	}
}
