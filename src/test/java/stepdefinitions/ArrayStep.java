package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import utilities.ConfigFileReader;
import utilities.ExcelFileReader;
import utilities.LoggerLoad;

public class ArrayStep {
	
	WebDriver driver=WebdriverManager.getDriver();
	ArrayPage arrayObj=new ArrayPage();
		
	ConfigFileReader configFileReader= WebdriverManager.configReader();
	ExcelFileReader reader = ExcelFileReader.getInstance();
	
	String excelFilePath= "./src/test/resources/Excel/testData.xlsx";
	String input;
	String expectedOutput;
	String pythonCode;	

	@When("the User clicks Get Started button in the Array section")
	public void the_user_clicks_get_started_button_in_the_array_section() {
		arrayObj.clickArrGetStartedBtn();
	}

	@Then("the User should get navigated to the Array Module  Page")
	public void the_user_should_get_navigated_to_the_array_module_page() {
		  Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("arrayPage"));
	}
	
	@Given("the User is on the Array Module page")
	public void the_user_is_on_the_array_module_page() {
		arrayObj.clickArrGetStartedBtn();
	}

	@When("the User clicks Arrays in Python link in the Array Module Page")
	public void the_user_clicks_arrays_in_python_link_in_the_array_module_page() {
	  arrayObj.clickArrAIPLink();
	}

	@Then("the User should get navigated to the Arrays in Python Page")
	public void the_user_should_get_navigated_to_the_arrays_in_python_page() {
	   Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("arraysInPython"));
	}

	@Given("the User is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAIPLink();
	}

	@When("the User clicks the Try here in Arrays in Python Page")
	public void the_user_clicks_the_try_here_in_arrays_in_python_page() {
	  arrayObj.clickArrTryHereBtn();
	}
	
	@Given("the User is on the Try Editor page through the Arrays in Python Page")
	public void the_user_is_on_the_try_editor_page_through_the_arrays_in_python_page() {
		   arrayObj.clickArrGetStartedBtn();
		   arrayObj.clickArrAIPLink();
		   arrayObj.clickArrTryHereBtn();
	}
	
	@When("the User clicks Practice Questions link in the Python Page")
	public void the_user_clicks_practice_questions_link_in_the_python_page() {
	    arrayObj.clickArrPracticeQnsLink();
	}

	@Then("the User should get navigated to the Practice Questions Page from the Array in Python Page")
	public void the_user_should_get_navigated_to_the_practice_questions_page_from_the_array_in_python_page() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("practiceQuestions"));
	}

	@Given("the User is on the Practice Questions page")
	public void the_user_is_on_the_practice_questions_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAIPLink();
		arrayObj.clickArrPracticeQnsLink();
	}

	@When("the User clicks the Search the array link in Practice Questions Page")
	public void the_user_clicks_the_search_the_array_link_in_practice_questions_page() {
	    arrayObj.clickArrPracQnsQn1();
	}

	@Then("the User should get navigated to the Search the Array Page")
	public void the_user_should_get_navigated_to_the_search_the_array_page() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("tryEditor"));   
	}

	@When("the User clicks the Max Consecutive Ones link in Practice Questions Page")
	public void the_user_clicks_the_max_consecutive_ones_link_in_practice_questions_page() {
		arrayObj.clickArrPracQnsQn2();
	   
	}

	@Then("the User should get navigated to the Max Consecutive Ones Page")
	public void the_user_should_get_navigated_to_the_max_consecutive_ones_page() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("tryEditor"));
	}
	
	@When("the User clicks the Find Numbers with Even Number of Digits link in Practice Questions Page")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link_in_practice_questions_page() {
	    arrayObj.clickArrPracQnsQn3();
	}

	@Then("the User should get navigated to the Find Numbers with Even Number of Digits Page")
	public void the_user_should_get_navigated_to_the_find_numbers_with_even_number_of_digits_page() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("tryEditor"));
	}
	
	@When("the User clicks the Squares of a Sorted Array link in Practice Questions Page")
	public void the_user_clicks_the_squares_of_a_sorted_array_link_in_practice_questions_page() {
	    arrayObj.clickArrPracQnsQn4();
	}

	@Then("the User should get navigated to the Squares of a Sorted Array Page")
	public void the_user_should_get_navigated_to_the_squares_of_a_sorted_array_page() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("tryEditor"));
	}

	@When("the User clicks Arrays using List link in the Array Module Page")
	public void the_user_clicks_arrays_using_list_link_in_the_array_module_page() {
	    arrayObj.clickArrAULLink();
	}

	@Then("the User should get navigated to the Arrays using List Page")
	public void the_user_should_get_navigated_to_the_arrays_using_list_page() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("arraysUsingList"));
	}

	@Given("the User is on the Arrays using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
	    arrayObj.clickArrGetStartedBtn();
	    arrayObj.clickArrAULLink();
	}

	@When("the User clicks the Try here in Arrays using List Page")
	public void the_user_clicks_the_try_here_in_arrays_using_list_page() {
	   arrayObj.clickArrTryHereBtn();
	   System.out.println("Actual Title-------------->"+arrayObj.getActualTitle());
		}
	
	@Given("the User is on the Try Editor page through the Arrays using List")
	public void the_user_is_on_the_try_editor_page_through_the_arrays_using_list() {
		arrayObj.clickArrGetStartedBtn();
		   arrayObj.clickArrAULLink();
		   arrayObj.clickArrTryHereBtn(); 
	}
	
	@When("the User clicks Practice Questions link in the Arrays using List Page")
	public void the_user_clicks_practice_questions_link_in_the_arrays_using_list_page() {
	    arrayObj.clickArrPracticeQnsLink();
	}
	
	@Then("the User should get navigated to the Practice Questions Page from Arrays using List")
	public void the_user_should_get_navigated_to_the_practice_questions_page_from_arrays_using_list() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("practiceQuestions"));
	}

	@When("the User clicks Basic Operations in Lists link in the Array Module Page")
	public void the_user_clicks_basic_operations_in_lists_link_in_the_array_module_page() {
		arrayObj.clickArrBOLLink();
	}

	@Then("the User should get navigated to the Basic Operations in Lists Page")
	public void the_user_should_get_navigated_to_the_basic_operations_in_lists_page() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("basicOperInList"));
	}

	@When("the User clicks the Try here in Basic Operations in Lists Page")
	public void the_user_clicks_the_try_here_in_basic_operations_in_lists_page() {
	    arrayObj.clickArrTryHereBtn();
	}

	@Given("the User is on the Try Editor page through the Basic Operations in Lists Page")
	public void the_user_is_on_the_try_editor_page_through_the_basic_operations_in_lists_page() {
		arrayObj.clickArrGetStartedBtn();
		   arrayObj.clickArrBOLLink();
		   arrayObj.clickArrTryHereBtn();   
	}

	@Given("the User is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
	   arrayObj.clickArrGetStartedBtn();
	   arrayObj.clickArrBOLLink();
	}

	@When("the User clicks Practice Questions link in the Basic Operations in Lists Page")
	public void the_user_click_practice_questions_link_in_the_basic_operations_in_lists_page() {
	   arrayObj.clickArrPracticeQnsLink();
	}

	@Then("the User should get navigated to the Practice Questions Page from the Basic Operations in Lists")
	public void the_user_should_get_navigated_to_the_practice_questions_page_from_the_basic_operations_in_lists() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("practiceQuestions"));  
	}

	
	@When("the User clicks Applications of Array link in the Array Module Page")
	public void the_user_clicks_applications_of_array_link_in_the_array_module_page() {
	    arrayObj.clickArrAOALink();
	}

	@Then("the User should get navigated to the Applications of Array Page")
	public void the_user_should_get_navigated_to_the_applications_of_array_page() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("appOfArray"));
	}
	
	@When("the User clicks the Try here in Applications of Array Page")
	public void the_user_clicks_the_try_here_in_applications_of_array_page() {
		arrayObj.clickArrTryHereBtn();
	}

	@Given("the User is on the Try Editor page through the Applications of Array Page")
	public void the_user_is_on_the_try_editor_page_through_the_applications_of_array_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAOALink();
		arrayObj.clickArrTryHereBtn();
	}

	@Given("the User is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAOALink();
	}

	@When("the User clicks Practice Questions link in the Applications of Array Page")
	public void the_user_clicks_practice_questions_link_in_the_applications_of_array_page() {
		arrayObj.clickArrPracticeQnsLink();
	}

	@Then("the User should get navigated to the Practice Questions Page from the Applications of Array")
	public void the_user_should_get_navigated_to_the_practice_questions_page_from_the_applications_of_array() {
		Assert.assertEquals(arrayObj.getActualTitle(), configFileReader.getPageTitle("practiceQuestions"));
	}


	@Given("the User is on the Try Editor page")
	public void the_user_is_on_the_try_editor_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAIPLink();
		arrayObj.clickArrTryHereBtn();
	}

	@Given("the User is on the Search the Array Page")
	public void the_user_is_on_the_search_the_array_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAULLink();
		arrayObj.clickArrPracticeQnsLink();
		arrayObj.clickArrPracQnsQn1();
	}

	@When("the User enters code from {string} in {int} in the Editor section and click Run")
	public void the_user_enters_code_from_in_in_the_editor_section_and_click_run(String sheetName, int rowNumber) throws InterruptedException, IOException {
		List <Map <String, String>> excelData = reader.getData(excelFilePath,sheetName);
		 input= excelData.get(rowNumber).get("pythonCode");
		 expectedOutput=excelData.get(rowNumber).get("output");
		 arrayObj.enterCodePractice(input);
		 LoggerLoad.info("TextEditor is not waiting till the Code to be entered");
		 arrayObj.clickTryHereRunBtn();
		LoggerLoad.info("TextEditor Run");
	}

	@When("the User enters code from {string} in {int} in the Editor section and click Submit")
	public void the_user_enters_code_from_in_in_the_editor_section_and_click_submit(String sheetName, int rowNumber)throws IOException, InterruptedException {
		List <Map <String, String>> excelData1 = reader.getData(excelFilePath,sheetName);
		input= excelData1.get(rowNumber).get("pythonCode");
		expectedOutput=excelData1.get(rowNumber).get("output");
		arrayObj.enterCodePractice(input);
		
		 LoggerLoad.info("TextEditor is not waiting till the Code to be entered");
		 arrayObj.clickSubmitBtn();
		LoggerLoad.info("TextEditor Submit");
	   	}
	
	@Then("the User should vaidate the expected output in the Practice Questions Output section")
	public void the_User_should_vaidate_the_expected_output_in_the_Practice_Questions_Output_section() throws InterruptedException {
		Assert.assertEquals(arrayObj.getTryHereOutputText(), expectedOutput);  
		}

	@Given("the User is on the Max Consecutive Ones Page")
	public void the_user_is_on_the_max_consecutive_ones_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAIPLink();
		arrayObj.clickArrPracticeQnsLink();
		arrayObj.clickArrPracQnsQn2();
	}

	@Given("the User is on the Find Numbers with Even Number of Digits Page")
	public void the_user_is_on_the_find_numbers_with_even_number_of_digits_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAULLink();
		arrayObj.clickArrPracticeQnsLink();
		arrayObj.clickArrPracQnsQn3();
	}

	@Given("the User is on the Squares of a Sorted Page")
	public void the_user_is_on_the_squares_of_a_sorted_page() {
		arrayObj.clickArrGetStartedBtn();
		arrayObj.clickArrAULLink();
		arrayObj.clickArrPracticeQnsLink();
		arrayObj.clickArrPracQnsQn4();
	}
	
}
	
