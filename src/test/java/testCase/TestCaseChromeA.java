package testCase;

import org.testng.annotations.*;
import pageFunctions.GoogleHomePage_Functions;
import scriptDriver.DriverForChromeA;

public class TestCaseChromeA extends DriverForChromeA{

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