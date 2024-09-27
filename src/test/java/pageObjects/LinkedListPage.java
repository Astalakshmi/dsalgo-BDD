package pageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.WebdriverManager;
import utilities.LoggerLoad;

public class LinkedListPage{
	
	
	WebDriver driver = WebdriverManager.getDriver();
	
	
	@FindBy (xpath = "//h5[text()='Linked List']/../a") 
	WebElement getStartedButton;
	
	@FindBy (partialLinkText = "Introduction") 
	WebElement introductionLink;
	
	@FindBy (partialLinkText ="Creating Linked LIst") 
	WebElement creatingLinkedListLink;
	
	@FindBy (partialLinkText = "Types of Linked List") 
	WebElement typesOfLinkedListLink;
	
	@FindBy (partialLinkText = "Implement Linked List in Python") 
	WebElement implementLinkedListLink;
	
	@FindBy (partialLinkText = "Traversal") 
	WebElement traversalLink;
	
	@FindBy (partialLinkText = "Insertion") 
	WebElement insertionLink;
	
	@FindBy (partialLinkText = "Deletion") 
	WebElement deletionLink;
	
	@FindBy (partialLinkText = "Practice Questions")
	WebElement linkedListPracticeLink;
	
	
	@FindBy (partialLinkText = "Try here>>>") 
	WebElement tryEditor;
	//@FindBy (name = "code") WebElement inputCode;
	
	@FindBy (xpath = "//div[contains(@class , 'CodeMirror') and contains(@class,'cm-s-default')]//textarea") 
	WebElement inputCode;
	
	@FindBy (xpath = "//button") 
	WebElement runButton;
	
	@FindBy(xpath = "//*[@id='output']")
	WebElement output;
	
	@FindBy(id ="answer_form")
	WebElement formText;
	
	
	public void clickGetStartedBtn() {
		getStartedButton.click();
    }
	
	public void clickIntroductionLink() {
		introductionLink.click();
		
    }
	
	public void clickCreatingLinkedListLink() {
		creatingLinkedListLink.click();
		
    }
	
	public void clickTypesOfLinkedListLink() {
		typesOfLinkedListLink.click();
		
    }
	
	public void clickImplementLinkedListLink() {
		implementLinkedListLink.click();
		
    }
	
	public void clickinsertionLink() {
		insertionLink.click();
		
    }
	
	public void clicktraversalLink() {
		traversalLink.click();
		
    }
	
	public void clickdeletionLink() {
		deletionLink.click();
		
    }
	
	public void clicktryEditor() {
		tryEditor.click();
    }
	
	public void setCode(String input) {	 
		 try {
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//			   WebElement enterText = new WebDriverWait(driver, Duration.ofSeconds(60))
//			       		  .until(ExpectedConditions.visibilityOfElementLocated
//			       				  (By.xpath("//textarea[1]")));	
			   inputCode.sendKeys(input);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		   }
		   
		 catch(Exception e) {
				//System.out.println("try editor not displayed");
				LoggerLoad.error("Interactable exception try editor not displayed ");
			}
		     
    }
	
	public void clickRunBtn() {
        runButton.click();
    }
	
	public String getOutput() {
		return output.getText();
	}
	
	public void clickPracticeLink() {
		linkedListPracticeLink.click();
	}
	
	//consructor
		public LinkedListPage() 
		{ 
			PageFactory.initElements(driver, this);
		}
		
	
}
