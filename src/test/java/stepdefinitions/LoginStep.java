package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
//import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utilities.ConfigFileReader;
import utilities.ExcelFileReader;
import utilities.LoggerLoad;

public class LoginStep {

	WebDriver driver = WebdriverManager.getDriver();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	RegisterPage registerObj = new RegisterPage();
	HomePage homeObj = new HomePage();
	LoginPage loginObj = new LoginPage();
	String excelFilepath;
	String ExpectedMessage;
	String ExpectedResultsValidcred;

	@Given("The User is on the login page")
	public void the_user_is_on_the_login_page() {
		homeObj.getStartedhomeclick();
		loginObj.signInclick();
		LoggerLoad.info("The user is on the " + driver.getTitle() + " page.");
	}

//	@When("The User valid credentials and clicks the login button")
//	public void the_user_valid_credentials_and_clicks_the_login_button() {
//		loginObj.signIn();
//		registerObj.username();
//		registerObj.signInPassword();
//		loginObj.loginBtnclick();
//	}

	@Then("The User should get navigated to the Home page and logged in")
	public void the_user_should_get_navigated_to_the_home_page_and_logged_in() {
		// rp.ValidateHomePage();
		// rp.titlepage();
		homeObj.getActualTitle();

	}

	@Given("The User navigates to the Home page")
	public void the_user_navigates_to_the_home_page() {

		homeObj.getActualTitle();
	}

	@When("The User enters the valid username and password {string}")
	public void the_user_enters_the_valid_username_and_password(String LoginCredentials)
			throws EncryptedDocumentException, IOException {
		excelFilepath = "./src/test/resources/Excel/TestData.xlsx";
		System.out.println("File Path :" + excelFilepath);
		ExcelFileReader reader = new ExcelFileReader();

		List<Map<String, String>> testdata = reader.getData(excelFilepath, LoginCredentials);
		// System.out.println("# of Rows:" + reader.countRow());
		String username = testdata.get(0).get("username");
		String password = testdata.get(0).get("password");
		ExpectedResultsValidcred = testdata.get(0).get("Expected Message");
		System.out.println("The Expected results are :" + ExpectedResultsValidcred);
		LoggerLoad.info("User Enter Login credential with username as \" " + username + "\" and password as\" "
				+ password + "\" ");
		if (username != null || password != null) {
			registerObj.setUsername(username);
			registerObj.setLoginPassword(password);
			loginObj.loginBtnclick();
		}
	}

	@Then("The User get navigated to home page and successfully logged in")
	public void the_user_get_navigated_to_home_page_and_successfully_logged_in() {
		Assert.assertEquals(loginObj.getActualTitle(), configFileReader.getPageTitle("homePage"));
		LoggerLoad.info("The user is on the " + driver.getTitle() + " home page and successfully logged in.");
	}

	@When("The User enters the username {string} password {int} and clicks on login button")
	public void the_user_enter_the_username_password_and_clicks_on_login_button(String sheetName, int RowNumber)
			throws EncryptedDocumentException, IOException {
		excelFilepath = "./src/test/resources/Excel/TestData.xlsx";
		// System.out.println("File Path :" + excelFilepath);
		ExcelFileReader reader = new ExcelFileReader();
		List<Map<String, String>> testdata = reader.getData(excelFilepath, sheetName);
		// System.out.println("# of Rows:" + reader.countRow());
		String username = testdata.get(RowNumber).get("username");
		String password = testdata.get(RowNumber).get("password");
		ExpectedMessage = testdata.get(RowNumber).get("Expected Message");

		if (username != null || password != null) {

			registerObj.setUsername(username);

			registerObj.setLoginPassword(password);
			loginObj.loginBtnclick();
			try {

				Alert alert = driver.switchTo().alert();
				System.out.println("The alert in username :" + alert.getText());
				String actualText= alert.getText();
				Assert.assertEquals(actualText, ExpectedMessage);
			} catch (NoAlertPresentException e) {
				System.out.println("The Alert is not present in Username TextField");

			}
			
			
			LoggerLoad.info("User Enter Login credential with username as \" " + username + "\" and password as\" "
					+ password + "\" ");

		}
	}

	@Then("The User gets suggested to enter the valid credentials")
	public void The_User_gets_suggested_to_enter_the_valid_credentials() {

		if (ExpectedMessage.equalsIgnoreCase("Please fill out this field")) {
			// System.out.println("The alert message is " + loginObj.getActualmessage());
			// Assert.assertEquals(loginObj.getActualmessage(), ExpectedMessage);

			LoggerLoad.error(
					"The user get the message:  " + ExpectedMessage + " for successfully logged into the application.");
		} else if (ExpectedMessage.equalsIgnoreCase("Invalid Username and Password")) {
			System.out.println("The alert message is " + loginObj.getActualmessage());
			Assert.assertEquals(loginObj.getActualmessage(), ExpectedMessage);
			LoggerLoad.error(
					"The user get the message:  " + ExpectedMessage + " for successfully logged into the application.");
		}
		// configFileReader.getPageTitle("treePage"));

		// System.out.println(homeObj.getActualTitle());
	}

	@Given("The User is on the home page without Login")
	public void The_user_is_on_the_home_page_without_Login() {
		homeObj.getStartedhomeclick();
		LoggerLoad.info(
				"The user is on the " + driver.getTitle() + " page trying to access the dropdown list without Login.");
		// loginObj.signInclick();
	}

	@When("The User clicked any of the dropdown list")
	public void The_User_clicked_any_of_the_dropdown_list() {
		List<WebElement> anydropdownClick = homeObj.dropdownWithoutLogin();
		for (WebElement eachclick : anydropdownClick) {
			homeObj.clickspecificdropdownNames(eachclick);
		}
	}

	@Then("The User should get the alert message to access the dropdown list")
	public void The_User_should_get_the_alert_message_to_access_the_dropdown_list()

	{
		for (WebElement eachclick : homeObj.dropdownWithoutLogin())
			homeObj.clickspecificdropdownNames(eachclick);
		homeObj.getalertMessage();
		Assert.assertEquals(homeObj.getActualMessage(), configFileReader.getAlert("dropdownWithoutLoginAlert"));
		LoggerLoad.info("The User is seeing the alert message  " + homeObj.getActualMessage());

	}

}
