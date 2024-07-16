package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features = ".//features//Register.feature"
//		features = ".//features/", //used to run all the features files present in the features folder
		features = {".//features/Register.feature", ".//features/LoginUser.feature"},
		glue = "stepdefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/report1.html"}
		)
//features = {".//features/LogFeature.feature",".//features/Customer.feature"}

public class TestRun extends AbstractTestNGCucumberTests{

}
