package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
		features = ".//Features/Test.feature",
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		plugin= {"pretty",
				 "html:target/cucumber-reports/report_html.html",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		plugin= {"pretty", "html:target/cucumber-reports/report_html.html",
//				           "json:target/cucumber-reports/report_json.json",
//				           "junit:target/cucumber-reports/report_xml.xml"}
)

public class Run extends AbstractTestNGCucumberTests {

}
