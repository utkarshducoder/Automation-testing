package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(@class,'p-element p-button p-component')]")
    public WebElement loginToCVR;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public  WebElement pass;

    @FindBy(className = "p-button-label")
    public  WebElement loginButton;
    
    @FindBy(xpath = "//h5[contains(text(),'Patientintake')]")
    public WebElement patientIntake; 

    public void clickCVR() {
        loginToCVR.click();
    }

    public void enterUserName(String uname) {
        userName.sendKeys(uname);
    }

    public void enterPassword(String password) {
        pass.sendKeys(password);
    }

    public void clickOnLogin() {
        loginButton.click();
    }
    
    public void clickIntake() {
    	patientIntake.click();
    }
}
