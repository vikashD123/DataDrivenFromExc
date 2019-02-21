package com.log;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LAb1 {

	@Test
	public void imlicitList() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		Logger log=Logger.getLogger("LAb1");
		
		PropertyConfigurator.configure("log4j.properties");
		
		WebDriver driver=new ChromeDriver();
		
		log.info("lauching browser");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		log.info("navigated to blogspot");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		log.info("clicking on button");
		
		WebElement el=driver.findElement(By.xpath("//p[text()='QTP']"));
		
		boolean status=el.isDisplayed();
		
		if(status) {
			System.out.println("status is dissplayed");
		}
		else {
			System.out.println("status is not displayed");
		}
	}
}
