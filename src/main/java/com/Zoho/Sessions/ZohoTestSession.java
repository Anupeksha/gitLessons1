		package com.Zoho.Sessions;

import org.testng.Reporter;

import com.Zoho.Pages.Normal.LaunchPage;
import com.Zoho.base.Pages.ZohoPage;
import com.Zoho.web.ZohoDriver;
import com.Zoho.web.webConnector;

public class ZohoTestSession {
	webConnector wCon;
	ZohoPage currentZohoPage;
	
	public ZohoPage getCurrentZohoPage() {
		return currentZohoPage;
	}

	public void setCurrentZohoPage(ZohoPage currentZohoPage) {
		this.currentZohoPage = currentZohoPage;
	}

	public ZohoTestSession()
	{
		wCon = new ZohoDriver();
	}

	public ZohoPage init()
	{
		if(Reporter.getCurrentTestResult().getTestContext().getAttribute("session")==null)
			Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);
		
//		ZohoPage page = new LaunchPage();
		return new LaunchPage();
	}
	
	public webConnector getConn()
	{
		return wCon;
	}
	
	
	public void end()
	{
		getConn().assertAll();
	}
}
