package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;

public class HeaderDsalgo {
	WebDriver driver = WebdriverManager.getDriver();
	

			//	locators
	@FindBy(xpath = "//a[text()='Data Structures']")
	WebElement dataStructure;

	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[text()='Arrays']")
	WebElement array;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[text()='Linked List']")
	WebElement linkedList;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[text()='Stack']")
	WebElement stack;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[text()='Queue']")
	WebElement queue;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[text()='Tree']")
	WebElement tree;
	
	@FindBy(xpath = "//div[@class='nav-item dropdown show']/div/a[text()='Graph']")
	WebElement graph;
	
	
			//Action Methods
	public void getStarted() {
		dataStructure.click();
	}
	
	public void array() {
		array.click();
	}
	
	public void linkedList() {
		linkedList.click();
	}
	
	public void stack() {
		stack.click();
	}
	
	public void queue() {
		queue.click();
	}
	
	public void tree() {
		tree.click();
	}
	
	public void graph() {
		graph.click();
	}
	
	public HeaderDsalgo() {
		PageFactory.initElements(driver, this);
	}
}
