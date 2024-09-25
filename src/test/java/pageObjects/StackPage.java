package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;

public class StackPage {
	
	WebDriver driver = WebdriverManager.getDriver();
	
//	public StackPage(WebDriver webDriver) {
//		PageFactory.initElements(webDriver, this);
//	}
//	
	@FindBy (xpath = "//h5[text()='Stack']/../a") 
	WebElement getStartedButton;
	
	@FindBy (partialLinkText = "Operations in stack")
	WebElement operationsLink;
	
	@FindBy (partialLinkText ="Implementation") 
	WebElement implementationLink;
	
	@FindBy (partialLinkText = "Applications")
	WebElement applicationsLink;
	
	@FindBy (partialLinkText = "Practice Questions") 
	WebElement stackPracticeLink;
	
	@FindBy (partialLinkText = "Try here>>>") 
	WebElement tryEditor;
	
	@FindBy (xpath = "//div[contains(@class , 'CodeMirror') and contains(@class,'cm-s-default')]//textarea") 
	WebElement inputCode;
	
	@FindBy (xpath = "//button") 
	WebElement runButton;
	
	public void clickGetStartedBtn() {
		getStartedButton.click();
    }
	
	public void clickImplementationLink() {
		implementationLink.click();
    }
	
	public void clickApplicationsLink() {
		applicationsLink.click();
    }
	
	public void clickOperationsLink() {
		operationsLink.click();
    }
	
	public void clicktryEditor() {
		tryEditor.click();
    }
	
	public void setCode() {
		inputCode.sendKeys("print"+"\"Hello\"");
    }
	
	public void clickRunBtn() {
		runButton.click();
    }
	
	public void clickPracticeLink() {
		stackPracticeLink.click();
	}
	
	//consructor
		public StackPage() 
		{ 
			PageFactory.initElements(driver, this);
		}
		
	

}
