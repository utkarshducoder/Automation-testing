package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//features/Customer.feature",
		glue = "stepdefination",
		dryRun = false,
		monochrome = true, //to make the output looks in readable format
		plugin = {"pretty","junit:target/cucumber-reports/report1_xml.xml", "html:target/cucumber-reports/report2.html",
		"json:target/cucumber-reports/report3.json"}
		//		plugin = {"pretty","junit:target/cucumber-reports/report3_xml.xml"} used to generate the report in the xml format
		//		plugin = {"pretty","json:target/cucumber-reports/report2_json.json"} used to generate the report in the json fomrat
		//		plugin = {"pretty","html:target/cucumber-reports/report.html"} used to generate the report in the html format
		)
public class Run {

}
