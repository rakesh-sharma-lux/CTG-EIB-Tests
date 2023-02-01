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
public class LoginPage {

	WebDriver driver;
	
	private WebElement userName;
	private WebElement password;
	private WebElement btnSubmit;
	private WebElement errorMsg;
	private WebElement forgetPwdLink;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage doLogin(String user , String pwd) {
		userName = driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys(user);
		
		password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(pwd);
		
		btnSubmit = driver.findElement(By.id("kc-login"));
		btnSubmit.click();
		return new HomePage(driver);
		
		
	}
	
	public String getErrorMsgText() {
		errorMsg = driver.findElement(By.id("<ID of the error message text element"));
		return errorMsg.getText();
	}
	
	public boolean CheckForgetPwdLink() {
		return forgetPwdLink.isDisplayed();
	}
	
	
}
