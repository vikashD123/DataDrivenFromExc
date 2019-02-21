package com.log;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Lab2Headless {
	
	@Test
	public void verify() {
		
		Logger log=Logger.getLogger("Lab2HeadLess");
		
		PropertyConfigurator.configure("log4j.properties");
		
	  WebDriver driver=new HtmlUnitDriver();
	  
	  log.info("laaunching browser headless");
	  
	  driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	  
	  log.info("navigating to blogspot");
	  
	  System.out.println(driver.getTitle());
	  
	  log.info("getting title of url");
	  
	}

}
