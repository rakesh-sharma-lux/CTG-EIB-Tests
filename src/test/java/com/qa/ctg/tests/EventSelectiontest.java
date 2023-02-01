/**
 * 
 */
package com.qa.ctg.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ctg.pages.EventListPage;

/**
 * Test related to selection of 5th event from the Events list
 *
 */

public class EventSelectiontest {

	WebDriver driver;
	EventListPage eventLst;
	
	@BeforeMethod
	public void setUp() {
		BaseTest bt = new BaseTest();
		driver = bt.initBrowser("name_of_Event_List_page.html");
		eventLst = new EventListPage(driver);
	}
	
	//Test related to selection of 5th event from the Events list
	@Test
	public void verifyEventListItem() {
		String str = eventLst.selectListElement(5);
		Assert.assertEquals(str, "D1 approval by Advisory Committee");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
