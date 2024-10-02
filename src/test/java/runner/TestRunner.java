package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "./src/test/resources/features" }, glue = { "stepdefinitions",
		"hooks" }, monochrome = true,
		tags = "@LoginTC_001",

		plugin = { "pretty", "html:target/cucumber-reports/cucumber.html" }) // HTML report

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true) // true means execute parallely false mean not execute parallely

	public Object[][] scenarios() {

		return super.scenarios();
	}

}

//   "json:target/cucumber-reports/cucumber.json",// JSON report
//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"