package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;

public class GraphPage {
	
WebDriver driver = WebdriverManager.getDriver();
	
	//locator
	
				//Get_Started_Graph
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement graphStarted;
	
	     //Topic covered Graph
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Graph']")
	WebElement graphLink;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement graphTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement graphEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement graphRunbtn;
	
	  			//Topic covered Graph Representation
	@FindBy(xpath="//a[normalize-space()='Graph Representations']")
	WebElement graphRepresent;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement graphRepresentTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement graphRepresentEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement graphRepresentRunbtn;
	         
	           //Action Methods
	public void graphStarted() 
	{
		graphStarted.click();
	}
	public void graphLink() 
	{
		graphLink.click();
	}	
	public void graphTryHere()
	{
		graphTryHere.click();
	}
	public void graphEditor()
	{
		graphEditor.click();
	}
	public void graphRunbtn()
	{
		graphRunbtn.click();
	}
	
	public void  graphRepresent() 
	{
		 graphRepresent.click();
	}	
	public void graphRepresentTryHere()
	{
		graphRepresentTryHere.click();
	}
	public void  graphRepresentEditor()
	{
		 graphRepresentEditor.click();
	}
	public void graphRepresentRunbtn()
	{
		graphRepresentRunbtn.click();
	}
	//consructor
	public GraphPage() 
	{ 
		PageFactory.initElements(driver, this);
	}
	

}
