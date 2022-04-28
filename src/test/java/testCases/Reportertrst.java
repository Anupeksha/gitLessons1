package testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reportertrst {

	@Test
	public void test1()
	{
		Reporter.getCurrentTestResult().getTestContext().setAttribute("Appname", "PMS");
		String s = (String) Reporter.getCurrentTestResult().getTestContext().getAttribute("Appname");
		System.out.println(s);
	}
}
