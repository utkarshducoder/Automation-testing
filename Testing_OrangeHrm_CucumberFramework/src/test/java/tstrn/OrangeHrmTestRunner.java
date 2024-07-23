package tstrn;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//features/ApplyLeave.feature",
		glue = "stepdef",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/reports/report1.html"}
		)
public class OrangeHrmTestRunner extends AbstractTestNGCucumberTests {

}
