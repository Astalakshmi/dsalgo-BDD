package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import utilities.ConfigFileReader;
//import driverManager.WebDriverManager;
import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
//import pageObjects.SignInPage;

public class ArrayStep {
	
//	public WebDriver driver=WebDriverManager.getDriver();
//	public SignInPage sip=new SignInPage(driver);
//	public ArrayPage ap=new ArrayPage(driver);
//	
//	ConfigFileReader configFileReader= new ConfigFileReader();
	
	@Given("the User navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
//		driver.get(configFileReader.getUrl("url"));
	}

	@When("the User valid credentials and clicks the login button")
	public void the_user_valid_credentials_and_clicks_the_login_button() {
//		sip.signIn();
//		sip.setUserName();
//		sip.setPassword();
//		sip.signInButton();
	}

	@Then("the User should be navigated to the Home page and logged in")
	public void the_user_should_be_navigated_to_the_home_page_and_logged_in() {
//		System.out.println("Logged IN");
//	    Assert.assertEquals(driver.getTitle(),configFileReader.get_Exp_Title("signInPage_Exp_Title"));
	}

//----------------@AIP @Array_TC_001---------------------
	@Given("the User is on the DsAlgo Portal Home page")
	public void the_user_is_on_the_ds_algo_portal_home_page() {
//		 driver.get(configFileReader.getUrl("url")); 
	}

	@When("the User clicks Get Started button in the Array section")
	public void the_user_clicks_get_started_button_in_the_array_section() {
//		ap.arrGetStarted();
	}

	@Then("the User should get navigated to the Array Module  Page")
	public void the_user_should_get_navigated_to_the_array_module_page() {
//		  Assert.assertEquals(driver.getTitle(), configFileReader.get_Exp_Title("arrModPage_Exp_Title"));
	}
	
//----------------@AIP @Array_TC_002-----------------	
	@Given("the User is on the Array Module page")
	public void the_user_is_on_the_array_module_page() {
//		driver.get(configFileReader.getUrl("arrModUrl"));
	}

	@When("the User clicks Arrays in Python link in the Array Module Page")
	public void the_user_clicks_arrays_in_python_link_in_the_array_module_page() {
//	  ap.arrArrInPy();
	}

	@Then("the User should get navigated to the Arrays in Python Page")
	public void the_user_should_get_navigated_to_the_arrays_in_python_page() {
//	   Assert.assertEquals(driver.getTitle(), configFileReader.get_Exp_Title("arrAIPPage_Exp_Title"));
	}

//--------------@AIPTryEditor @Array_TC_003---------------
	@Given("the User is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
//		driver.get(configFileReader.getUrl("arrAIPUrl"));
	}

	@When("the User clicks the Try here in Arrays in Python Page")
	public void the_user_clicks_the_try_here_in_arrays_in_python_page() {
//	  ap.tryHereBtn();
	}

	@Then("the User should get navigated to the Try Editor Page")
	public void the_user_should_get_navigated_to_the_try_editor_page() {
//		Assert.assertEquals(driver.getTitle(), configFileReader.get_Exp_Title("tryEditorPage_Exp_Title"));
	}
	
//-----------------@AIPPracQns @Array_TC_004-------------------
	@When("the User clicks Practice Questions link in the Python Page")
	public void the_user_clicks_practice_questions_link_in_the_python_page() {
//	    ap.practiceQnsLink();
	}

	@Then("the User should get navigated to the Practice Questions Page")
	public void the_user_should_get_navigated_to_the_practice_questions_page() {
//		Assert.assertEquals(driver.getTitle(), configFileReader.get_Exp_Title("arrInPyPage_Exp_Title"));
	}

//-----------------@AIPPracQns1 @Array_TC_005-----------------------
	@Given("the User is on the Practice Questions page")
	public void the_user_is_on_the_practice_questions_page() {
//		driver.get(configFileReader.getUrl("pracQnsUrl"));
	}

	@When("the User clicks the Search the array link in Practice Questions Page")
	public void the_user_clicks_the_search_the_array_link_in_practice_questions_page() {
//	    ap.pracQnsQn1();
	}

	@Then("the User should get navigated to the Search the Array Page")
	public void the_user_should_get_navigated_to_the_search_the_array_page() {
//		Assert.assertEquals(driver.getTitle(), configFileReader.get_Exp_Title("tryEditorPage_Exp_Title"));   
	}

//-----------------@AIPPracQns2 @AIPPracQns2TC_006----------------
	@When("the User clicks the Max Consecutive Ones link in Practice Questions Page")
	public void the_user_clicks_the_max_consecutive_ones_link_in_practice_questions_page() {
	   
	}

	@Then("the User should get navigated to the Max Consecutive Ones Page")
	public void the_user_should_get_navigated_to_the_max_consecutive_ones_page() {
	   
	}
//------------------@AIPPracQns3 @AIPPracQns3TC_007------------------	
	
	@When("the User clicks the Find Numbers with Even Number of Digits link in Practice Questions Page")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link_in_practice_questions_page() {
	    
	}

	@Then("the User should get navigated to the Find Numbers with Even Number of Digits Page")
	public void the_user_should_get_navigated_to_the_find_numbers_with_even_number_of_digits_page() {
	    
	}

//-----------------@AIPPracQns4 @AIPPracQns4TC_008-----------------
	
	@When("the User clicks the Squares of a Sorted Array link in Practice Questions Page")
	public void the_user_clicks_the_squares_of_a_sorted_array_link_in_practice_questions_page() {
	    
	}

	@Then("the User should get navigated to the Squares of a Sorted Array Page")
	public void the_user_should_get_navigated_to_the_squares_of_a_sorted_array_page() {
	    
	}

////-----------------@AUL @AULTC_009----------------
//	@When("the User clicks Arrays using List link in the Array Module Page")
//	public void the_user_clicks_arrays_using_list_link_in_the_array_module_page() {
//	    
//	}
//
//	@Then("the User should get navigated to the Arrays using List Page")
//	public void the_user_should_get_navigated_to_the_arrays_using_list_page() {
//	    
//	}
//
////----------------@AULTryEditor @AULEditorTC_010------------
//	
//	@Given("the User is on the Arrays using List page")
//	public void the_user_is_on_the_arrays_using_list_page() {
//	    
//	}
//
//	@When("the User clicks the Try here in Arrays using List Page")
//	public void the_user_clicks_the_try_here_in_arrays_using_list_page() {
//	   
//	}
//
////----------------@AULPracQns @AULPracQnsTC_011-----------
//	
//	@When("the User clicks Practice Questions link in the Arrays using List Page")
//	public void the_user_clicks_practice_questions_link_in_the_arrays_using_list_page() {
//	    
//	}
//	
////----------------@----------
//	
//	

}