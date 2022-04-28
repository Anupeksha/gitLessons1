package com.Zoho.base.Pages;

import org.testng.Reporter;

import com.Zoho.Pages.Normal.EnterUsernamePage;
import com.Zoho.Pages.Normal.HomePage;
import com.Zoho.Sessions.ZohoTestSession;
import com.Zoho.web.webConnector;

public interface ZohoPage extends ZohoNormalPage,ZohoSessionPage{

//	By default all functions are public
	
	//browser based functions
	ZohoPage openBrowser(String browserName);
	void quit();
	void getTotalWindows();
	ZohoTestSession getSession();
	
	//Zoho based general functions
	ZohoPage goToHomePage();
	ZohoPage goToEnterUsernamePage();
	void goToRegisterPage();
	ZohoPage submitUsername(String userid);
	webConnector validator(boolean stopExecution);
	
	//Zoho session based functions
	void createSurvey();
	void logout();
	
	
}
