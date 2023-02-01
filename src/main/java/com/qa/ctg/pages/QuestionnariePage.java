/**
 * 
 */
package com.qa.ctg.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author sharmara
 *
 */
public class QuestionnariePage {
	
	WebDriver driver;
	
	List<WebElement> radioBtns;
	
	public QuestionnariePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void selectRadioButtons() {
		//Take all rows in a list
		List<WebElement> eList = driver.findElements(By.xpath("//tbody//tr/td[*]//tr"));

		for (WebElement e : eList) {
			// Generate Random number to select the radio button
			Random rand = new Random();
			int randomNum = rand.nextInt(20) + 1;

			// Selecting the radio button based on even/odd output
			if (randomNum % 2 == 0)
				e.findElement(By.xpath("./td[1]/input")).click();
			else
				e.findElement(By.xpath("./td[2]/input")).click();

		}
	
	}
}
