package com.test.whoop;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Christopher Hardy
 *
 */
public class TestSuiteWhoop {

	public static void main(String[] args) {

		TestSuiteWhoop testSuite = new TestSuiteWhoop();
		
		testSuite.testCaseHomePageTitle();
		
		testSuite.testCaseAboutUs();
		
		testSuite.testCaseJobOppurtunity();
		
		testSuite.testCaseAdvisor();
		
		driver.quit();
	}
	
	static WebDriver driver = new HtmlUnitDriver();

	TestSuiteWhoop() {

		driver = new HtmlUnitDriver();

		driver.get("http://www.whoop.com");

	}

	void testCaseHomePageTitle() {

		System.out.println("Page title is: " + driver.getTitle());
		assertEquals(driver.getTitle(), "WHOOP");	
	}

	void testCaseAboutUs() {

		@SuppressWarnings("static-access")
		WebElement elementAbout = driver.findElement(By.cssSelector("a.btn.btn-clearblue").partialLinkText("About"));  

		elementAbout.click();
	}

	void testCaseJobOppurtunity() {

		WebElement element1 = driver.findElement(By.id("career-34980")); 

		System.out.println("Element Job is: " + element1.getText());
		assertTrue(element1.getText().contains("Software Engineer in Test, Web"));
		assertTrue(element1.getText().contains("Responsibilities"));
	}

	void testCaseAdvisor() {

		WebElement elementImage = driver.findElement(By.tagName("img"));

		System.out.println("Element Advisor Image is: " + elementImage.isDisplayed());

		Actions action = new Actions(driver);

		action.moveToElement(elementImage).perform();

		WebElement advisorElement = driver.findElement(By.className("bio"));

		action.moveToElement(advisorElement);

		action.click();

		action.perform();

		System.out.println("Element Advisor is: " + advisorElement.getText());
		assertTrue(advisorElement.getText().contains("Nicholas Negroponte"));
	}
}
