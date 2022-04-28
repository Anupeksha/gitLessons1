package com.Zoho.Pages.Normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoho.base.Pages.Constants;
import com.Zoho.base.Pages.ZohoBasePage;
import com.Zoho.base.Pages.ZohoPage;

public class HomePage extends ZohoBasePage {
	
	public HomePage() {
		System.out.println("___________HomePage Constructor_________");
//		PageFactory.initElements(getCurrentDriver(), this);
	}

	@FindBy(xpath = Constants.LOGIN_XPATH)
	WebElement loginLink;

	public EnterUsernamePage goToEnterUsernamePage() {
		loginLink.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new EnterUsernamePage();
	}

}
