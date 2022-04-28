package com.Zoho.web;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.Zoho.Sessions.ZohoTestSession;

public interface webConnector extends zohoWebConnector{

	
	void openBrowser(String browserName);
	void navigate(String url);
	void quit();
	WebDriver getCurrentDriver();
	ZohoTestSession getSession();
	boolean isStopExecution();
	void setStopExecution(boolean stopExecution);
	void assertAll();
	SoftAssert getSoftAssert();
	void setSoftAssert(SoftAssert softAssert);
}
