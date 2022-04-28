package com.Zoho.base.Pages;

import com.Zoho.Pages.Normal.EnterUsernamePage;
import com.Zoho.Pages.Normal.HomePage;
import com.Zoho.web.webConnector;

public interface ZohoNormalPage {
	
	//Zoho based general functions
	ZohoPage goToHomePage();
	ZohoPage goToEnterUsernamePage();
	void goToRegisterPage();
	ZohoPage submitUsername(String userid);
	ZohoPage submitPassword(String password);
	webConnector validator(boolean stopExecution);
	

}
