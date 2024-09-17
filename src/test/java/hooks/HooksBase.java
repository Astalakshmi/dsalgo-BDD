package hooks;

import org.openqa.selenium.WebDriver;

import driverManager.WebdriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksBase {
	
	@Before
	public void launchBrowser() {
		WebDriver driver = WebdriverManager.initializeDriver("Chrome");
			driver.get("https://dsportalapp.herokuapp.com");
		}

		@After
		public void quitbrowser() {
			WebdriverManager.closeDriver();

		}
	
}
