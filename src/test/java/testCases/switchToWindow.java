package testCases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class switchToWindow {
	@Test
	public void switchWin() {
		String regex= "abc";
		Pattern p;
		Matcher m;
		p=Pattern.compile(regex);
		System.out.println("p - "+p);
		m=p.matcher("Page Title");
		System.out.println("m - "+m);
		boolean status = m.find();
		System.out.println(status);
		
	
		
	}

}
