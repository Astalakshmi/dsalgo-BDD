package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;

public class QueuePage {
	
	WebDriver driver = WebdriverManager.getDriver();
	
	//locator
	
				//Get_Started_Queue
	@FindBy(xpath="//a[@href='queue']")
	WebElement queueStarted;
	
				//Topic covered queueInPython
	@FindBy(xpath="//a[normalize-space()='Implementation of Queue in Python']")
	WebElement queueInPython;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement queueInPythonTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement queueInPythonEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement queueInPythonRunbtn;
	
	@FindBy(xpath="//pre[@id='output']")
	WebElement outputQueueInPython;
	             //Topic covered collection.deque
	@FindBy(xpath="//a[normalize-space()='Implementation using collections.deque']")
	WebElement deque;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement dequeTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement dequeEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement dequeRunbtn;
	
					//Topic covered collection in Array
	@FindBy(xpath="//a[normalize-space()='Implementation using array']")
	WebElement queueImplArray;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement queueImplArrayTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement queueImplArrayEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement queueImplArrayRunbtn;
			//Topic covered Queue Operation
	@FindBy(xpath="//a[normalize-space()='Queue Operations']")
	WebElement queueOperation;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement queueOpsTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement queueOpsEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement queueOpsRunbtn;
	
	//Action Methods
	
	public void queueStarted()
	{
		 queueStarted.click();
	}
	public void queueInPython()
	{
		queueInPython.click();
	}
	public void queueInPythonTryHere()
	{
		queueInPythonTryHere.click();
	}

	public void deque()
	{
		deque.click();
	}
	public void dequeTryHere()
	{
		dequeTryHere.click();
	}
	
	public void queueImplArray()
	{
		queueImplArray.click();
	}
	public void queueImplArrayTryHere()
	{
		queueImplArrayTryHere.click();
	}
	public void queueOperation()
	{
		queueOperation.click();
	}
	public void queueOpsTryHere()
	{
		queueOpsTryHere.click();
	}
	
	//consructor
	public QueuePage() {
		PageFactory.initElements(driver, this);
	}
}
