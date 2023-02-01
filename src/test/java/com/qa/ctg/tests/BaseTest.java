/**
 * 
 */
package com.qa.ctg.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author sharmara
 *
 */
public class BaseTest {

	WebDriver driver;
	
	public WebDriver initBrowser(String fileName) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String userDir = System.getProperty("user.dir");
		
		driver.get(userDir + "/src/test/resources/sourceFiles/" + fileName);
		
		return driver; 
	}
}
