/**
 * 
 */
package com.qa.ctg.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ctg.pages.HomePage;
import com.qa.ctg.pages.LoginPage;

/**
 * Tests related to Login page
 *
 */
public class LoginPageTest{
	WebDriver driver;
	LoginPage loginpg;
	
	@BeforeMethod
	public void setUp() {
		BaseTest bt = new BaseTest();
		driver = bt.initBrowser("LoginPage.html");
		loginpg = new LoginPage(driver);
	}
	
	
	//Test to verify successful login and successMessage
	@Test
	public void verifyValidUserLogin() {
		HomePage homepg = loginpg.doLogin("abc@gmail.com", "password123");
		//After successful login the user redirects to homepage where success message is displayed
		Assert.assertEquals(homepg.getSuccessMsgText(),"Success");
	
	}
	
	//Test to verify invalid email pattern error message
	@Test
	public void verifyInValidEmailError() {
		loginpg.doLogin("abc@gmail", "password123");
		Assert.assertEquals(loginpg.getErrorMsgText(), "invalid email");
	}
	
	
	//Test to verify wrong email error message
	@Test
	public void verifyWrongEmailError() {
		loginpg.doLogin("abc@hotmail.com", "password123");
		Assert.assertEquals(loginpg.getErrorMsgText(), "enter correct email");
	}
	
	
	//Test to verify successful login and correct page
	@Test
	public void verifyHomePageTitle() {
		HomePage homepg = loginpg.doLogin("abc@gmail.com", "password123");
		Assert.assertEquals(homepg.getPageTitle(), "Homepage");
		
	}
	
	
	//Test to verify forget password link
	@Test
	public void verifyForgetPwdLink() {
		Assert.assertTrue(loginpg.CheckForgetPwdLink());
	}
	
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
