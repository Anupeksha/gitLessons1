package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Zoho.base.Pages.Constants;
import com.Zoho.base.Pages.ZohoBasePage;
import com.Zoho.base.Pages.ZohoPage;

public class EnterPasswordPage extends ZohoBasePage
{
	@FindBy(css = Constants.PASSWORD)
	WebElement password_input;
	
	@FindBy(css = Constants.NEXT_BUTTON)
	WebElement signinButton;
	
	@FindBy(css = Constants.REMIND_ME_LATER_BUTTON)
	WebElement remineMeLater;
	
	public ZohoPage submitPassword(String password) {
		password_input.sendKeys(password);
		signinButton.click();
		try
		{
			Thread.sleep(2000);
			remineMeLater.click();
		}
		catch(Exception ex)
		{
			System.out.println("No Remind me Later button found");
		}
		return new mainHomePage();
	}
}
