package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web Elements
    @FindBy(id = "gender-male")
    WebElement genderMale;

    @FindBy(id = "gender-female")
    WebElement genderFemale;

    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "Newsletter")
    WebElement newsletterCheckbox;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(className = "result")
    WebElement registrationResultMessage;

    // Page Methods
    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            genderMale.click();
        } else if (gender.equalsIgnoreCase("female")) {
            genderFemale.click();
        }
    }

    public void setFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void setEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void subscribeToNewsletter() {
        if (!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public String getRegistrationResultMessage() {
        return registrationResultMessage.getText();
    }

    // Register Method
    public void register(String gender, String firstName, String lastName, String email, String password, String confirmPassword) {
        selectGender(gender);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        subscribeToNewsletter();
        clickRegisterButton();
    }
}
