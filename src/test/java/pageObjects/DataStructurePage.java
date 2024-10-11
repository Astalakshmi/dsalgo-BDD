package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driverManager.WebdriverManager;

public class DataStructurePage {

	WebDriver driver = WebdriverManager.getDriver();

	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']")
	WebElement getstarted;

	@FindBy(xpath = "//a[contains(text(),'Time Complexity')]")
	WebElement timecomplex;

	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement tryhere;
	
	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement practice_ques;

	public void getStartedclick() {
		getstarted.click();
	}

	public void timeComplexclick() {
		timecomplex.click();
	}
	
	public void tryHereclick() {
		tryhere.click();
	}

	public void pracQuesclick() {
		practice_ques.click();
	}

	public String getActualTitle() {
		return driver.getTitle();
	}
	
	public DataStructurePage() {
		PageFactory.initElements(driver, this);
	}
}
