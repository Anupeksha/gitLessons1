package testCases;

import org.testng.annotations.Test;

import com.Zoho.Sessions.ZohoTestSession;


public class loginTest2 {
	@Test
	public void login() {
		//One testcase will have 
		//1-Driver
		//1-Report Object
		//1-ZohoTest session, driver, report
		
//		zohoWebConnector conn = new ZohoDriver();
//		conn.openBrowser("Chrome");
//		conn.validateLogin();
		
		ZohoTestSession session = new ZohoTestSession(); //WebConnector is initialized
//		ZohoPage newZohoPage = session.init();
//		newZohoPage.openBrowser("Chrome");
		
		session
			.init()	//Store session in TestContext, returns the object of LaunchPage
			.openBrowser("Chrome")
			.goToHomePage()
			.validator(false).validateTitle("Zoho | Cloud Software Suite for Businesses")
			.validator(false).validateText("jkji", "XYZ")
			.goToEnterUsernamePage()
			.validator(false).validateTitle("YYUU")
			.submitUsername("aloo080817@gmail.com")
			.submitPassword("lucky@11");
			
		session.end();
			
		
//		
//		ZohoPage newZohoPage = new LaunchPage();
//		newZohoPage.goToHomePage();
	}
}
