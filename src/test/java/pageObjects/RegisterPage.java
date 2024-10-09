package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import driverManager.WebdriverManager;

public class RegisterPage {
	WebDriver driver = WebdriverManager.getDriver();

	boolean isRequired;

	// locators
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement registerLink;

	@FindBy(id = "id_username")
	WebElement username;

	@FindBy(xpath = "//input[@id='id_password1']")
	WebElement password;

	@FindBy(xpath = "//input[@id='id_password2']")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@value='Register']")
	WebElement registerBtn;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement loginLink;

	// After successful registered the user account comes this signin password
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement loginPassword;

	public void registerLinkclick() {
		registerLink.click();
	}
//	public void username() {
//	
//		username.sendKeys("DreamTeam");
//	}

	public void setUsername(String userName) {
		username.sendKeys(userName);
	}

	public String getUserNameValidationMessage() {
		return username.getAttribute("validationMessage");
	}

//	public void password() {
//	
//		password.sendKeys("Dre@mTe@m123");
//	}

	// public void setRegpassword(String passWord) {
	// //add for 44 to 47
//			password.sendKeys(passWord);
//		}

	public void setLoginPassword(String passWord) {
		loginPassword.sendKeys(passWord); // i changed to login
			}

	public String getPasswordNameValidationMessage() {
		return loginPassword.getAttribute("validationMessage");
	}
//	public void setConfirmPassword() {
//
//		confirmPassword.sendKeys("Dre@mTe@m123");
//	}

//	public void setConfirmPassword(String confirmPassword) {
//	
//				confirmPassword.sendKeys(confirmPassword);
//			}

	public void registerBtnclick() {

		registerBtn.click();
	}

//	public void signInPassword() {
//		signInPassword.sendKeys("Dre@mTe@m123");
//	}

//	public void ValidateHomePage() {
//		Assert.assertEquals(titlepage(), "NumpyNinja");
//	}

	public String getActualTitle() {
		return driver.getTitle();
	}

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

}
