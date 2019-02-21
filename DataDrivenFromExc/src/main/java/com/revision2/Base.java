package com.revision2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	WebDriver driver;
	
	@BeforeMethod
	public void openbrowsertest() throws IOException {
		
		if(UtilsPropfile.data("browser").toString().equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			driver=new ChromeDriver();
			
		}
		else if(UtilsPropfile.data("browser").toString().equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/home/manjit/Downloads/geckodriver-v0.21.0-linux64/geckodriver");
			
			driver=new FirefoxDriver();
		}
		driver.get(UtilsPropfile.data("URL").toString());
	}
	
	@AfterMethod
	
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
