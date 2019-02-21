package com.revision;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogLabv1 {
	
	@Test
	public void test() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		Logger log=Logger.getLogger("LabLabv1");
		
		PropertyConfigurator.configure("log4j.properties");
		
		WebDriver driver=new ChromeDriver();
		
		log.info("--Launching chrome browser");
		
		driver.get("https://www.facebook.com/");
		
		log.info("--Navigaating to facebook");
		
		driver.findElement(By.id("email")).sendKeys("Vikash");
		
		log.info("send text to edit box");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source,new File("./Screen/faacebook.png"));
		
		log.info("Sending pic to screen folder");
		
	}

}
