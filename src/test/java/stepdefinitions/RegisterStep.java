package stepdefinitions;

import org.openqa.selenium.WebDriver;
import driverManager.WebdriverManager;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class RegisterStep {
	
	WebDriver driver = WebdriverManager.getDriver();
	
	RegisterPage registerObj = new RegisterPage();
	HomePage homeObj = new HomePage();
	
	@Given("The User is on the Home Page")
	public void the_user_is_on_the_home_page() {
		homeObj.getStartedhomeclick();
	}

	@When("The User clicks on the Register link")
	public void the_user_clicks_on_the_register_link() {
		registerObj.registerLink();
	//	registerObj.setUsername();
		//registerObj.setPassword();
	//	registerObj.setConfirmPassword();
		registerObj.registerBtnclick();
	}

	@Then("The User should get navigated to Register Page")
	public void the_user_should_get_navigated_to_register_page() {
		
	//	rp.ValidateHomePage();   //Assert home page
	//	registerObj.titlepage();
	//  Assert.assertEquals(driver.getTitle(), "NumpyNinja");
	}

	
}
