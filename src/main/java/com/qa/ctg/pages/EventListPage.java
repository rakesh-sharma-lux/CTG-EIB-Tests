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
public class EventListPage {
	
	WebDriver driver;
	
	private WebElement eventList;
	
	public EventListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String selectListElement(int index) {
		eventList = driver.findElement(By.xpath("//span[contains(@id,\"lgi_operationCalendarDtoOperationCalendarEventList\")]"));
		eventList.click();
		return eventList.findElement(By.xpath("./ul/li[" + index +"]")).getText();
		
	}
	

}
