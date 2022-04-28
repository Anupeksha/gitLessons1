package ZohoListeners;

import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Reporter;

import com.Zoho.Sessions.ZohoTestSession;
import com.Zoho.web.webConnector;

//public class ZohoEventListener implements WebDriverEventListener{

public class ZohoEventListener implements WebDriverListener {

	public void beforeAnyWebElementCall(WebElement element, Method method, Object[] args) {

		System.out.println("About to call a " + method.getName()+"---"+element.getTagName());
		boolean err = true;
		if(err)
		{
			getDriver().getSoftAssert().fail("Element not found"+ element.getText());
			getDriver().assertAll();
		}

	}
	
	public void beforeFindElement(WebElement element, By locator) {
		System.out.println("##########before finding : " + element);
		System.out.println("before finding : " + locator);
	}
	

	public void afterAnyWebElementCall(WebElement element, Method method, Object[] args, Object result) {
		System.out.println(method.getName() + " called");
	}

	public void beforeGet(WebDriver driver, String url) {
		System.out.println(driver +"-------"+url);
	}
	
	public webConnector getDriver()
	{
		ZohoTestSession currentSession = (ZohoTestSession) Reporter.getCurrentTestResult().getAttribute("session");
		return currentSession.getConn();
	}

	
}
