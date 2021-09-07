package pageFunctions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import pageObjects.GoogleHomePage_Objects;

public class GoogleHomePage_Functions {

	public WebDriver driver;

	public GoogleHomePage_Functions(WebDriver driver) {
		this.driver=driver;
	}
	public By Fluentwait(By byValue) {
		try {
			final By byVal=byValue;
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
					.withTimeout(Duration.ofSeconds(30)) 			
					.pollingEvery(Duration.ofSeconds(5)) 			
					.ignoring(NoSuchElementException.class);
			wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver driver ) {
					return driver.findElement(byVal);
				}
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return byValue;
	}


	public void homePageFunctions() {
		try {
			Thread.sleep(5000);
			driver.findElement(Fluentwait(GoogleHomePage_Objects.headerGoogleAppsEllipse)).click();
			driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@role='presentation']")));
			driver.findElement(Fluentwait(GoogleHomePage_Objects.googleAppsMaps)).click();
			Thread.sleep(5000);
			driver.get("https://www.google.com/");
			driver.switchTo().defaultContent();
			driver.findElement(Fluentwait(GoogleHomePage_Objects.headerGoogleAppsEllipse)).click();
			driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@role='presentation']")));
			Thread.sleep(2000);
			driver.findElement(Fluentwait(GoogleHomePage_Objects.googleAppsNews)).click();
			Thread.sleep(5000);
			driver.get("https://www.google.com/");
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void homePageHeaderValidations() {
		try {
			Thread.sleep(5000);
			
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void homePageFooterValidations() {
		try {
			Thread.sleep(5000);
			
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void homePageSearchSectionValidations() {
		try {
			Thread.sleep(5000);
			
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
