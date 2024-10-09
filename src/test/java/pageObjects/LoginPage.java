package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;

public class LoginPage {

	WebDriver driver = WebdriverManager.getDriver();

	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement signIn;
	
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement loginPassword;
	
//	@FindBy(id = "id_username")
//	WebElement usernameLogin;

//	@FindBy(id = "id_password")
//	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement alertInvalidcredentials;
	
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement validcredentialstext;
	
	@FindBy(xpath = "//a[text()='Register!']")
	WebElement loginpageRegisterlink;
	
	

	public void signInclick() {
		signIn.click();
	}
	
	public void setUsername(String userName) {
		username.sendKeys(userName);
	}
	
	public void setLoginPassword(String passWord) {
		loginPassword.sendKeys(passWord); // i changed to login
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
	public String getLoginValidationMessage() {
		return validcredentialstext.getText();
	}
	

	public String getInvalidLoginValidationMessage() {
		return alertInvalidcredentials.getText();
	}

	public String getActualTitle() {
		return driver.getTitle();
	}

	public void loginpageRegisterlink() {
		loginpageRegisterlink.click();
	}
	
	public String getUserNameValidationMessage() {
		return username.getAttribute("validationMessage");
	}
	
	public String getPasswordNameValidationMessage() {
		return loginPassword.getAttribute("validationMessage");
	}
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}
