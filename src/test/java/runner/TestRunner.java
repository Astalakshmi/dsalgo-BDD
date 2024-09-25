package runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		 features = {"./src/test/resources/features"},
    glue = {"stepdefinitions","hooks"},
    monochrome = true,
    tags= "@Login" ,
    plugin = { "pretty",                      
               "html:target/cucumber-reports/cucumber.html",
               "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"} )
 
	
public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
    @DataProvider(parallel = false)//true means execute parallely false mean not execute parallely
	
    public Object[][] scenarios() {
				
		return super.scenarios();
}
	
}


