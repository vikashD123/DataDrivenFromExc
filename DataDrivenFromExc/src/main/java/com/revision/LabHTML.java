package com.revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class LabHTML {

	@Test
	public void test() {
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
	}
}
