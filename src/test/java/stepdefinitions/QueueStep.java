	package stepdefinitions;
	
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	
	import driverManager.WebdriverManager;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pageObjects.QueuePage;
	import pageObjects.RegisterPage;
	import utilities.ConfigFileReader;
	import utilities.LoggerLoad;
	
	public class QueueStep {
		WebDriver driver = WebdriverManager.getDriver();
		ConfigFileReader configFileReader = WebdriverManager.configReader();
		QueuePage qp = new QueuePage();
		RegisterPage rp=new RegisterPage();
		
	//-------------------@QueuePage @QueueTest_001--------
	
	@When("The User clicks Get Started button in the Queue section")
	
	public void the_user_clicks_get_started_button_in_the_queue_section() {
			qp.queueStarted();   
	}
	
	@Then("The User should get navigated to the DsAlgo Portal Queue Page")
	public void the_user_should_get_navigated_to_the_ds_algo_portal_queue_page() {
	   
	    Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("queuePage"));
		LoggerLoad.info("You are in " +driver.getTitle()+" Page.");
	}
	//---------------------  @QueueList @QueueListTest_002------------
	
	@When("The User clicks Implementation of Queue in Python link")
	public void the_user_clicks_implementation_of_queue_in_python_link() {
		qp.queueStarted();
		qp.queueInPython(); 
	}
	
	@Then("The User should get navigated to Implementation lists")
	public void the_user_should_get_navigated_to_implementation_lists() {
		 
		Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("implementQueue"));
		LoggerLoad.info("You are in " +driver.getTitle()+" Page.");
	}
	//-------------@QueueListTryEditor @QueueListEditorTest_003------ //asta
	@Given("The User is on the  Implementation lists Page")
	public void the_user_is_on_the_implementation_lists_page() {
		qp.queueStarted();
		qp.queueInPython(); 
		 
	}
	
	@When("The User clicks Try Here button in Queue Implementation List Page")
	public void the_user_clicks_try_here_button_in_queue_implementation_list_page() {
		
		qp.queueInPythonTryHere();
	    
	}
	
	//-----------------  @QueueListTryEditor @QueueListEditorTest_004---------
	@Given("the User is on the Try Editor page through the Implementation Lists page")
	public void the_user_is_on_the_try_editor_page_through_the_implementation_lists_page() {
	    
		qp.queueStarted();
		qp.queueInPython();
		qp.queueInPythonTryHere();
		
	}
	
	
	//----------------------  @DeQueue @DeQueueTest_005----------
	@When("The User clicks Implementation Using Collections Dequeue link")
	public void the_user_clicks_implementation_using_collections_dequeue_link() {
		qp.queueStarted();
		qp.deque();
	
	}	
	
	@Then("The User should get navigated to Implementation collection Page")
	public void the_user_should_get_navigated_to_implementation_collection_page() {
	    
	    Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("implementDeque"));
	    LoggerLoad.info("You are in " +driver.getTitle()+ " Page.");
	}
	
	//---------------  @DeQueueTryHere @DeQueueTryHereTest_006--------
	
	@Given("The User is on the Implementation collection Page")
	public void the_user_is_on_the_implementation_collection_page() {
	
		qp.queueStarted();
		qp.deque();
		
	}
	
	@When("The User clicks Try Here button in the Implementation collection Page")
	public void the_user_clicks_try_here_button_in_the_implementation_collection_page() {
	
		qp.dequeTryHere();	 
		
	}
	//------------------- @DeQueueTryEditor @DeQueueEditorTest_007-----------------
	
	@Given("the User is on the Try Editor page through the Implementation collection Page")
	public void the_user_is_on_the_try_editor_page_through_the_implementation_collection_page() {
	
		qp.queueStarted();
		qp.deque();
		qp.dequeTryHere();	
		
	}
	
	//----------------- @QueueArray @QueueArrayTest_008----------
	@When("The User clicks Implementation using array link")
	public void the_user_clicks_implementation_using_array_link() {
	    qp.queueStarted();
	    qp.queueImplArray();
	    
	}
	
	@Then("The User should get navigated to Implementation Array")
	public void the_user_should_get_navigated_to_implementation_array() {
		 Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("implementUsingArr"));
		 LoggerLoad.info("You are in " +driver.getTitle()+ " Page.");
	    
	}
	//----------------@QueueArrayTryHere @QueueArrayTryHereTest_009------
	@Given("The User is on the Implementation collection Array Page")
	public void the_user_is_on_the_implementation_collection_array_page() {
		
		  qp.queueStarted();
		  qp.queueImplArray();
		  
	}
	
	@When("The User clicks Try Here button in the Implementation Array Page")
	public void the_user_clicks_try_here_button_in_the_implementation_array_page() {
	    
	    qp.queueImplArrayTryHere();
	}
	
	//--------------------------@QueueArrayTryEditor @QueueArrayEditorTest_010---------
	
	@Given("the User is on the Try Editor page through the Implementation Array Page")
	public void the_user_is_on_the_try_editor_page_through_the_implementation_array_page() {
	    
		  qp.queueStarted();
		  qp.queueImplArray();
		  qp.queueImplArrayTryHere();
		  
	}
	
	
	//---------------------@QueueOperation @QueueOperationTest_011---------
	@When("The User clicks Queue Operations link")
	public void the_user_clicks_queue_operations_link() {
	    qp.queueStarted();
	    qp.queueOperation(); 
	}
	
	@Then("The User should get navigated to Queue Operation Page")
	public void the_user_should_get_navigated_to_queue_operation_page() {
		
	    Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("QueueOper"));    
	    LoggerLoad.info("You are in " +driver.getTitle()+" Page.");
	}
	
	//--------------------@QueueOperationTryHere @QueueOperTryHereTest_012-----
	@Given("The User is on the Queue Operation Page")
	public void the_user_is_on_the_queue_operation_page() {
		qp.queueStarted();
	    qp.queueOperation(); 
		
	}
	
	@When("The User clicks Try Here button in the Queue Operation Page")
	public void the_user_clicks_try_here_button_in_the_queue_operation_page() {
	    qp.queueOpsTryHere();
	    
	}
	
	//-----------------@QueueOperationTryEditor @QueueOperEditorTest_013---------
	@Given("the User is on the Try Editor page through Queue Operation Page")
	public void the_user_is_on_the_try_editor_page_through_queue_operation_page() {
	   
		qp.queueStarted();
	    qp.queueOperation(); 
	    qp.queueOpsTryHere();
		
	}
	
	
	//---------------@QueuePracticeQuestion @QueueQuestionTest_014----------
	@Given("The User is on the Implementation lists")
	public void the_user_is_on_the_implementation_lists() {
	
	    qp.queueStarted();
	}
	
	@When("The User clicks Practice Questions")
	public void the_user_clicks_practice_questions() {
		
		 if (qp.queueInPython() || qp.deque() || qp.queueImplArray() || qp.queueOperation())
		 {
			 qp.handlePracticeQuestionClick();
		 }
	}
	
	@Then("The User should navigate to queue Practice Page")
	public void the_user_should_navigate_to_queue_practice_page() {
	    
	    Assert.assertEquals(rp.actualTitle(),configFileReader.getPageTitle("practiceQuestions"));
	    LoggerLoad.info("You are in " +driver.getTitle()+" Page.");
	}
	
	
	}
