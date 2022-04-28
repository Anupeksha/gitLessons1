package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Zoho.base.Pages.Constants;
import com.Zoho.base.Pages.ZohoBasePage;
import com.Zoho.base.Pages.ZohoPage;

public class EnterUsernamePage extends ZohoBasePage
{
	
	@FindBy(css = Constants.USERNAME)
	WebElement username;
	
	@FindBy(css=Constants.NEXT_BUTTON)
	WebElement nextButton;
	
	public ZohoPage submitUsername(String userid) {
		username.sendKeys(userid);
		nextButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new EnterPasswordPage();
	}
	
}
