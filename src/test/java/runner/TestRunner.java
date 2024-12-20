package runner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigFileReader;

@CucumberOptions(
		 features = {"./src/test/resources/features"},
    glue = {"stepdefinitions","hooks"},
    monochrome = true,

   tags= "@Login or @RegisterInvalidCredentials or @Array or @LinkedList or @Stack or @Tree or @DataStructure or @Queue or @Graph" ,
    plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
    		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
    		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    		// "rerun:target/rerun.txt",
    		})

 public class TestRunner extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser) {
		ConfigFileReader.setBrowserType(browser);
	}
	@Override
    @DataProvider(parallel = true)//true means execute parallely false mean not execute parallely
	
    public Object[][] scenarios() {
				
		return super.scenarios();
    }	
}