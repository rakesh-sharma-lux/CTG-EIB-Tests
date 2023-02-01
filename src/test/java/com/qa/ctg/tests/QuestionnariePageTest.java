/**
 * 
 */
package com.qa.ctg.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ctg.pages.QuestionnariePage;

/**
 * Script related to the selection of random radio buttons
 *
 */
public class QuestionnariePageTest {

	WebDriver driver;
	QuestionnariePage questionPg;
	
	
	@BeforeMethod
	public void setUp() {
		BaseTest bt = new BaseTest();
		driver = bt.initBrowser("QuestionnariePage.html");
		questionPg = new QuestionnariePage(driver);
	}
	
	//To select random Yes/No radio buttons on the page
	@Test
	public void selectRandomradioButtons() {
		questionPg.selectRadioButtons();
	}
	
}
