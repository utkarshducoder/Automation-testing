//package StepDefinations;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.en.*;
//import org.junit.Assert; // Updated import
//
//public class LoginCredentials {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//    }
//
//    @And("user is on login page")
//    public void user_is_on_login_page() {
//        driver.get("https://practicetestautomation.com/practice-test-login/");
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) {
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//    }
//
//    @And("clicks on submit button")
//    public void clicks_on_submit_button() {
//        driver.findElement(By.xpath("//button[@id='submit']")).click();
//    }
//
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Logged In Successfully')]")));
//        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]")).getText();
//        System.out.println(actualText);
//        String expectedText = "Logged In Successfully";
//        Assert.assertEquals(expectedText, actualText);
//    }
//}