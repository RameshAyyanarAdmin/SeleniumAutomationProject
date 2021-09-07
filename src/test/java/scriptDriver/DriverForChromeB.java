package scriptDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class DriverForChromeB {

	protected WebDriver driver;
	
	
	@BeforeTest
	public void LaunchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\ChromeDrivers\\TestCaseChromeB\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--incognito");	
			options.addArguments("--disable-popup-blocking");
			options.addArguments("disable-infobars");
			DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		    options.merge(capabilities);	
		    driver = new ChromeDriver(options);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
