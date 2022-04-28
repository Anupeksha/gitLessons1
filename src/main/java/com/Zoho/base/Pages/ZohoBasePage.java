package com.Zoho.base.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.Zoho.Sessions.ZohoTestSession;
import com.Zoho.web.webConnector;

public class ZohoBasePage implements ZohoPage{
	
	public ZohoBasePage() {
		System.out.println("___________ ZohoBasePage Constructor_________");
		PageFactory.initElements(getCurrentDriver(), this);
		getSession().setCurrentZohoPage(this);
	}

	public ZohoPage openBrowser(String browserName) {
		System.out.println("ZohoBasePage openBrowser function");
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public void getTotalWindows() {
		// TODO Auto-generated method stub
		
	}

	public ZohoPage goToHomePage() {
		return null;
//		System.out.println("Zoho Base Page-- goToHomePage --- Called");
//		We keep the body empty here in BasePage class
	}

	public void goToRegisterPage() {
		// TODO Auto-generated method stub
		
	}

	public ZohoPage submitUsername(String userid) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public webConnector validator(boolean stopExecution) {
		getSession().getConn().setStopExecution(stopExecution);
		System.out.println("stopExecution : "+getSession().getConn().isStopExecution());
		return getSession().getConn();
	}

	public void createSurvey() {
		// TODO Auto-generated method stub
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}
	
	public ZohoTestSession getSession()
	{
		return (ZohoTestSession) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}
	
	public webConnector getDriver()
	{
		return getSession().getConn();
	}
	
	public WebDriver getCurrentDriver()
	{
		return getSession().getConn().getCurrentDriver();
	}

	public ZohoPage goToEnterUsernamePage() {
		return null;
		// TODO Auto-generated method stub
		
	}

	public ZohoPage submitPassword(String password) {
		// TODO Auto-generated method stub
		return null;
		
	}


}
