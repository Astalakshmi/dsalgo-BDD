package stepdefinitions;

import org.openqa.selenium.WebDriver;
import driverManager.WebdriverManager;
import io.cucumber.java.en.*;
import pageObjects.IndexPage;
import pageObjects.RegisterPage;

public class RegisterStep {
	
	WebDriver driver = WebdriverManager.getDriver();
	
	RegisterPage rp = new RegisterPage();
	IndexPage ip = new IndexPage();
	
	@Given("The User is on the Home Page")
	public void the_user_is_on_the_home_page() {
		ip.getStarted();
	}

	@When("The User clicks on the Register link")
	public void the_user_clicks_on_the_register_link() {
	  rp.registerLink();
	  rp.username();
	  rp.password();
	  rp.confirmPassword();
	  rp.registerBtn();
	}

	@Then("The User should get navigated to Register Page")
	public void the_user_should_get_navigated_to_register_page() {
		
	//	rp.ValidateHomePage();   //Assert home page
		rp.titlepage();
	//  Assert.assertEquals(driver.getTitle(), "NumpyNinja");
	}

	
}
