package com.Zoho.Pages.Normal;

import org.openqa.selenium.support.PageFactory;

import com.Zoho.Sessions.ZohoTestSession;
import com.Zoho.base.Pages.ZohoBasePage;
import com.Zoho.base.Pages.ZohoPage;

public class LaunchPage extends ZohoBasePage{


	public LaunchPage() {
		System.out.println("___________Launch Page Constructor_________");
		System.out.println("___________Launch Page Constructor_________");
		System.out.println("Change for Merge 23546");
//		PageFactory.initElements(getCurrentDriver(), this);
	}
	
	@Override
	public ZohoPage openBrowser(String browserName) {
		System.out.println("Zoho Launch Page-- openBrowser : "+browserName);
//		ZohoTestSession sessionZoho = getSession();
//		sessionZoho.getConn().openBrowser("Chrome");
//		getSession().getConn().openBrowser("Chrome");
		getDriver().openBrowser("Chrome");
		
		return this;
	}
	
	public ZohoPage goToHomePage() {
		System.out.println("Zoho Launch Page-- goToHomePage --- Called");
//		ZohoTestSession sessionZoho = getSession();
//		sessionZoho.getConn().navigate("https://www.zoho.com");
//		getSession().getConn().navigate("https://www.zoho.com");
		getDriver().navigate("https://www.zoho.com");
		return new HomePage();
	}
	


}
