package driverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverManager {
	

	public static WebDriver driver;

	public static WebDriver initializeDriver(String browserName) {
		if (browserName != null && browserName.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
			
		} else if (browserName != null && browserName.equalsIgnoreCase("EDGE")) {
			driver = new EdgeDriver();
			
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}
		
		public static void closeDriver() {
			//driver.quit();
		}
}
