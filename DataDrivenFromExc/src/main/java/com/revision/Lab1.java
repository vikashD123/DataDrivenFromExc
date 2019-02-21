package com.revision;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Lab1 {

	@Test
	public void logFile() {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		Logger log=Logger.getLogger("Lab1");
		
		PropertyConfigurator.configure("log4j.properties");
		
		WebDriver driver=new ChromeDriver();
		
		log.info("chrome is launching");
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		log.info("navigating to blogspot");
		
		WebElement el=driver.findElement(By.xpath("//*[text()='Automation Tools']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(el).build().perform();
		
		log.info("moving cursor to specified element");
		
		List<WebElement> el1=driver.findElements(By.xpath("//*[@class='dropdown-content']//a"));
		
		int count =el1.size();
		
		System.out.println(count);
		
		log.info("getting no elements present");
	}
}
