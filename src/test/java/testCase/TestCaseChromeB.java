package testCase;

import org.testng.annotations.Test;

import pageFunctions.GoogleHomePage_Functions;
import scriptDriver.DriverForChromeA;
import scriptDriver.DriverForChromeB;

public class TestCaseChromeB extends DriverForChromeB{

	@Test
	public void TestMethod() {	
		try{
			driver.get("https://www.google.com/");
			GoogleHomePage_Functions googleHomePage_Object=new GoogleHomePage_Functions(driver);
			googleHomePage_Object.homePageFunctions();
			driver.quit();
		}
		catch(Exception e) 
		{
			e.printStackTrace();	
		}
	}
}
