	package pageObjects;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	
	import driverManager.WebdriverManager;
	import utilities.ConfigFileReader;
	
	public class RegisterPage{
		WebDriver driver = WebdriverManager.getDriver();
		ConfigFileReader configFileReader = WebdriverManager.configReader();
		
		//locators
		@FindBy(xpath="//a[normalize-space()='Register']")
		WebElement registerLink;
		@FindBy(xpath="//input[@id='id_username']")
		WebElement username;
		@FindBy(xpath="//input[@id='id_password1']")
		WebElement password;
		@FindBy(xpath="//input[@id='id_password2']")
		WebElement confirmPassword;
		@FindBy(xpath="//input[@value='Register']")
		WebElement registerBtn;
		@FindBy(xpath="//a[normalize-space()='Login']")
		WebElement loginLink;
					//After signin password 
		@FindBy(xpath ="//input[@id='id_password']")
		WebElement signInPassword;
		
		//Action Methods
		
	public void registerLink() {
			
		registerLink.click();
		}
		public void username() {
		
		//	username.sendKeys("DreamTeam");
			
			username.sendKeys(configFileReader.getUsername());
			
		}
		public void password() {
		
			//password.sendKeys("Dre@mTe@m123");
			password.sendKeys(configFileReader.getPassword());
		}
		public void confirmPassword() {
			
			//confirmPassword.sendKeys("Dre@mTe@m123");
			confirmPassword.sendKeys(configFileReader.getPassword());
		}
		
		public void registerBtn() {
			
			registerBtn.click();
		}
		
		public void signInPassword() {
			signInPassword.sendKeys("Dre@mTe@m123");
		}
		public String actualTitle() {
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			return actualTitle;
		}
	
	//	public void ValidateHomePage() {
	//		Assert.assertEquals(titlepage(), "NumpyNinja");
	//	}
	//	
		public RegisterPage() {
			PageFactory.initElements(driver, this);
		}
	
	}
