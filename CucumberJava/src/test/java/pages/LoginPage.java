package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By txt_username = By.xpath("//input[@id='username']");
    By txt_password = By.xpath("//input[@id='password']");
    By txt_submit = By.xpath("//button[@id='submit']");
    By logout_btn = By.xpath("//a[contains(text(),'Log out')]");
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String pass) {
        driver.findElement(txt_password).sendKeys(pass);
    }

    public void clickSubmit() {
        driver.findElement(txt_submit).click();
    }

    public void logout() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(logout_btn).click();
    }
}
