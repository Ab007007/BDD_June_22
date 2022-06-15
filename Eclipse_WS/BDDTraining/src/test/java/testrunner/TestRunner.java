package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/feature/",
		glue = {"stepdefinition"},
		monochrome = true,
//		dryRun = true,
		tags = "@pom",
//		tags = "@uat and @regression",
//		tags = "@uat or @regression",
		plugin = {"pretty", "junit:target/JunitReports/reports.xml",
							"json:target/JsonReports/reports.json",
							"html:target/HTMLReports/reports.html"}
		)
public class TestRunner {

	
}
