package com.Zoho.base.Pages;

public class Constants 
{
	//Home Page
	public static final String LOGIN_LINK ="a.zh-login";
//	public static final String LOGIN_XPATH ="//div[@class='zh-user-account']/a[contains(@class, 'login')]";
	public static final String LOGIN_XPATH ="//a[contains(@class,'login') and (text()='Sign in')]";
	public static final String USERNAME ="input#login_id";
	public static final String NEXT_BUTTON = "button#nextbtn > span";
	public static final String PASSWORD = "input#password";
	public static final String REMIND_ME_LATER_BUTTON ="//a[text()='Remind me later']";
	
	//Session Home Page
	public static final String FORMS="//section[@class='zh-productssect zh-allproductsect pd-btm-0 zh-product-code']/div[2]/div[2]/div[1]/div[1]/div[@class='wrapper']/ul/li[2]/a/span[1]";
	public static final String REPORTS_PATH=System.getProperty("user.dir")+"\\Reports\\";

}
