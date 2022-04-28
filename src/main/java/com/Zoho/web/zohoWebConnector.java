package com.Zoho.web;

import com.Zoho.base.Pages.ZohoPage;

public interface zohoWebConnector{
	
	void logout();
	ZohoPage validateTitle(String expectedPageTitle);
	ZohoPage validateText(String locator, String expectedText);
	void validateLogin();

}
