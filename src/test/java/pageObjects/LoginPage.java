package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;

public class LoginPage {

	WebDriver driver = WebdriverManager.getDriver();

	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement signIn;
	
	@FindBy(id = "id_username")
	WebElement usernameLogin;
	
	@FindBy(id = "id_password")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement alertInvalidcredentials;
	

	public void signInclick() {
		signIn.click();
	}
	// ************************
//	public void usernameLogin()
//	{
//		usernameLogin.sendKeys("DreamTeam");
//	}

//	public void password()
//	{
//		
//		password.sendKeys("Dre@mTe@m123");
//	}

	// *********************************
	public void loginBtnclick() {
		loginbtn.click();
		
		
	}

	public String getActualmessage() {
		String alertmessage=alertInvalidcredentials.getText();
		return alertmessage;
	}
	
	public String getActualTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}
