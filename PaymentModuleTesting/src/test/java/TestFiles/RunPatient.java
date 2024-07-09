package TestFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C://Users//UtkarshGupta//eclipse-workspace//PaymentModuleTesting//src//test//resources//features//Login.feature","C:/Users/UtkarshGupta/eclipse-workspace/PaymentModuleTesting/src/test/resources/features/Dashboard.feature"},
		glue = "StepDefinations",
		dryRun = false,
		monochrome = true
		)
public class RunPatient {

}
