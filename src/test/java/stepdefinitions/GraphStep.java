package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import pageObjects.RegisterPage;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

public class GraphStep {
	WebDriver driver = WebdriverManager.getDriver();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	GraphPage gp = new GraphPage ();
	RegisterPage rp=new RegisterPage();
	
	//------- @GraphPage @GraphTest_001--------
	@When("The User clicks Get Started button in the Graph section")
	public void the_user_clicks_get_started_button_in_the_graph_section() {
	   gp.graphStarted();

	}
	
	@Then("The User should get navigated to the DsAlgo Portal Graph Page")
	public void the_user_should_get_navigated_to_the_ds_algo_portal_graph_page() {
	   
		 Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("graphPage"));
		 LoggerLoad.info("You are in "+ driver.getTitle() +" Page.");
	}
	//-----------@GraphList @GraphListTest_002---------
	@Given("The User is on the Graph Page")
	public void the_user_is_on_the_graph_page() {
		gp.graphStarted();
	    
	}
	
	@When("The User clicks Graph link")
	public void the_user_clicks_graph_link() {
		gp.graphLink();
	}
	
	@Then("The User should get navigated to first Topic Graph Page")
	public void the_user_should_get_navigated_to_first_topic_graph_page() {
	   
		Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("graph"));
		LoggerLoad.info("You are in "+ driver.getTitle() +" Page.");
	}
	//----------------@GraphTryHere @GraphTryHereTest_003------------
	@Given("The User is on the first Topic Graph Page")
	public void the_user_is_on_the_first_topic_graph_page() {
	   
		gp.graphStarted();
		
	}
	
	@When("The User clicks Try Here button in the first topic Graph Page")
	public void the_user_clicks_try_here_button_in_the_first_topic_graph_page() {
		gp.graphLink();
		gp.graphTryHere();
		
	}
	//-------------------------@GraphTryEditor @GraphEditorTest_004-----
	@Given("the User is on the Try Editor page through the first Topic Graph Page")
	public void the_user_is_on_the_try_editor_page_through_the_first_topic_graph_page() {
	   
		gp.graphStarted();
		gp.graphLink();
		gp.graphTryHere();
	}

	//---------------  @GraphRepresentations @GraphRepTest_005----------
	@When("The User clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() {
//		gp.graphStarted();
		gp.graphRepresent();
	   
	}
	
	@Then("The User should get navigated to Graph Representation Page")
	public void the_user_should_get_navigated_to_graph_representation_page() {
	   
		Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("graphRep"));
		LoggerLoad.info("You are in "+ driver.getTitle() +" Page.");
	   
	}
	//------------------ @GraphReprTryHere @GraphReprTryHereTest_006-------
	@Given("The User is on the Graph Representation Page")
	public void the_user_is_on_the_graph_representation_page() {
		gp.graphStarted();
		gp.graphRepresent();
	   
	}
	
	@When("The User clicks Try Here button in the Graph Representation Page")
	public void the_user_clicks_try_here_button_in_the_graph_representation_page() {
		gp.graphRepresentTryHere();
		
	}
	//-----------------------  @GraphReprTryEditor @GraphReprEditorTest_007-------
	@Given("the User is on the Try Editor page through the Graph Representation Page")
	public void the_user_is_on_the_try_editor_page_through_the_graph_representation_page() {
		gp.graphStarted();
		gp.graphRepresent();
		gp.graphRepresentTryHere();
	}

	
	//---------------- @GraphPracticeQuestion @GraphQuestionTest_008------
	@When("The User clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		
	   if (gp.graphLink() || gp.graphRepresent()) 
	   {
		   gp.handleGraphPracticeQuestion();
	   }
	   
	}
	
	@Then("The User should navigate to Practice Question Page")
	public void the_user_should_navigate_to_practice_question_page() {
	   
	  Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("practiceQuestions"));
	  LoggerLoad.info("You are in "+ driver.getTitle() +" Page.");
	}
	

}
