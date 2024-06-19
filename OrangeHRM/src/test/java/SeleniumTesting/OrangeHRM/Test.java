package SeleniumTesting.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String username = "Admin";
        String password = "admin123";

        // Landing page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Increased timeout

        try {
            // Enter username and password
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
            usernameField.sendKeys(username);

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Password']")));
            passwordField.sendKeys(password);

            // Click login button
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Dashboard - assuming this clicks a pending button
            WebElement pendingBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-icon-button.oxd-icon-button--danger.orangehrm-report-icon")));
            pendingBtn.click();

            // Pending Self Review - assuming this is a search input
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type for hints...']")));
            inputField.sendKeys("a");

            // Dropdown interaction
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='empNameInput']")));
            dropdown.click();

            WebElement firstItem = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[role='listbox'] div[role='option']:first-child")));
            firstItem.click();
            
            driver.findElement(By.cssSelector("div div[class='oxd-select-wrapper'] div[class='oxd-select-text.oxd-select-text--focus'] div[class='oxd-select-text-input']")).click();

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
////div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']
