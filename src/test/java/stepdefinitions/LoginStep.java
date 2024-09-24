package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.IndexPage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

	public class LoginStep {
		
		WebDriver driver = WebdriverManager.getDriver();
		ConfigFileReader configFileReader = WebdriverManager.configReader();
		RegisterPage rp = new RegisterPage();
		IndexPage ip = new IndexPage();
		LoginPage lp = new LoginPage();
		
		@Given("The User navigates to the login page")
		
		public void the_user_navigates_to_the_login_page() {
			
			 ip.getStarted();
			 lp.signIn();
		}
	
		@When("The User valid credentials and clicks the login button")
		
		public void the_user_valid_credentials_and_clicks_the_login_button() {
		  
		   rp.username();
		   rp.signInPassword();
		   lp.loginbtn();
		}
		@Then("The User should be navigated to the Home page and logged in")
	
		public void the_user_should_be_navigated_to_the_home_page_and_logged_in() {

			Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("homePage"));
			LoggerLoad.info("You are in " +driver.getTitle()+" Page.");
		}
	
		@Given("The User navigates to the Home page")
		
		public void the_user_navigates_to_the_home_page() {
		
			driver.get(configFileReader.getHomeUrl());

		// ip.getStarted();// tried not working this line
			
		}
		
		@When("The User should clicks Logo NumpyNinja")
		
		public void the_user_should_clicks_logo_numpy_ninja() {
				 
			   lp.numpyLogo();
		}
		
		@Then("The User should get navigated to HomePage")
		
		public void the_user_should_get_navigated_to_home_page() {
	
			Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("homePage"));
			LoggerLoad.info("You are in " +driver.getTitle()+" Page.");
		}
	}
