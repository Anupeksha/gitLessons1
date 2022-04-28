package com.Zoho.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.Zoho.base.Pages.ZohoPage;

public abstract class ZohoValidationDriver implements webConnector{

	WebDriver driverOriginal;
	WebDriverListener listener;
	WebDriver decorated;
	boolean stopExecution;
	SoftAssert softAssert = new SoftAssert();

	public boolean isStopExecution() {
		return stopExecution;
	}

	public void setStopExecution(boolean stopExecution) {
		this.stopExecution = stopExecution;
	}

	public ZohoPage validateTitle(String expectedPageTitle) {
//		Assert.assertEquals(decorated.getTitle(), expectedPageTitle);
		if(!expectedPageTitle.equals(decorated.getTitle()))
			softAssert.fail("Page titles do not match. Actual title is : "+decorated.getTitle());
		if(isStopExecution()==true)
			assertAll();
		return getSession().getCurrentZohoPage();
	}

	public void validateLogin() {
		System.out.println("ZohoValidationDriver Abstract Class ---- ValidateLogin Function");
	}
	
	public ZohoPage validateText(String locator, String expectedText) {
//		Assert.assertEquals(By.cssSelector(locator).findElement(decorated), expectedText);
		String actualText = "ABC";
		if(!actualText.equals(expectedText))
			softAssert.fail("Text do not match. Actual text is : "+actualText);
		if(isStopExecution()==true)
			assertAll();
		return getSession().getCurrentZohoPage();
	}

	public void assertAll()
	{
		softAssert.assertAll();
	}

	public SoftAssert getSoftAssert() {
		return softAssert;
	}

	public void setSoftAssert(SoftAssert softAssert) {
		this.softAssert = softAssert;
	}
	
	
}
