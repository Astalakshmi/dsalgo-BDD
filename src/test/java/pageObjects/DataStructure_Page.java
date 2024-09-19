package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;

public class DataStructure_Page {
	
	WebDriver driver = WebdriverManager.getDriver();

	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']")
	WebElement data_struc_getstarted;
	
	@FindBy(xpath = "//a[contains(text(),'Time Complexity')]")
	WebElement timecomplex;
	
	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement practice_ques;
//	@FindBy(xpath ="//a[text()='Practice Questions']")
//	WebElement practice_questions;
	
	public void data_struc_getstarted() {
		data_struc_getstarted.click();
	}
	
	public void timecomplex() {
		timecomplex.click();
	}
	
	public void practice_ques() {
		practice_ques.click();
	}
	
	
	public DataStructure_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
