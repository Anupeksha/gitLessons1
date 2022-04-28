package com.Zoho.web;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Assert;
import org.testng.Reporter;

import com.Zoho.Sessions.ZohoTestSession;
import com.Zoho.base.Pages.ZohoPage;

import ZohoListeners.ZohoEventListener;

public class ZohoDriver extends ZohoValidationDriver {


	public void logout() {
		// TODO Auto-generated method stub
		
	}

	public void openBrowser(String browserName) {
		System.out.println("ZohoDriver openBrowser Function : "+browserName);
		driverOriginal = new ChromeDriver();
		listener = new ZohoEventListener();
		decorated = new EventFiringDecorator(listener).decorate(driverOriginal);
		decorated.manage().window().maximize();
		decorated.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	public void navigate(String url) {
		decorated.get(url);
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public WebDriver getCurrentDriver() {
		// TODO Auto-generated method stub
		return decorated;
		
	}

	public ZohoTestSession getSession() {
		return (ZohoTestSession) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}


	
}
