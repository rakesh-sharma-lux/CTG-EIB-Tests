/**
 * 
 */
package com.qa.ctg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author sharmara
 *
 */
public class HomePage {

	WebDriver driver;
	WebElement successMsg;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getSuccessMsgText() {
		successMsg = driver.findElement(By.id("<ID of the success message text element"));
		return successMsg.getText();
	}
}
