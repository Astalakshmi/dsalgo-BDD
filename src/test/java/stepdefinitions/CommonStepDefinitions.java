package stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

public class CommonStepDefinitions {
	
	WebDriver driver = WebdriverManager.getDriver();

	ConfigFileReader configFileReader = WebdriverManager.configReader();

	LinkedListPage linkedlistObj = new LinkedListPage();
	
	@Given("the user is in homepage and logged in")
	public void the_user_is_in_homepage_and_logged_in() {
		driver.get(configFileReader.getHomeUrl());
		LoggerLoad.info("You are in " +driver.getTitle() +"home page.");
		
		
	}
	
	@Then("the User should get navigated to the Try Editor Page")
	public void the_user_should_get_navigated_to_the_try_editor_page() {
		String tryEditorPageTitle = linkedlistObj.getActualTitle();
	    Assert.assertEquals(tryEditorPageTitle,configFileReader.getPageTitle("tryEditor"));
	    
	}
	
	@When("the User enters a sample code as {string} in the Editor section and click Run")
	public void the_user_enters_a_sample_code_as_in_the_editor_section_and_click_run(String input) {
		System.out.println(input);

		linkedlistObj.setCode(input);
		linkedlistObj.clickRunBtn();
	    
	}

	@Then("the User should get the {string} in the screen")
	public void the_user_should_get_the_output_in_the_screen(String expectedOutput) {
		
		try {
			try {
				Alert alert = driver.switchTo().alert();
				System.out.println("Alert text is: " + alert.getText());
				alert.accept();
			} catch (NoAlertPresentException e) {
				System.out.println("No alert was found.");
			}
		} catch (org.openqa.selenium.UnhandledAlertException e) {
			System.out.println("Unhandled Alert Exception caught. Handling it...");
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert text is: " + alert.getText());
			alert.accept();
		}
	    
	}

	
	

}