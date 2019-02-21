package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {

	WebDriver driver;
	
	@Test(dataProvider="word")
	public void test(String user,String pass) {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	    driver=new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		driver.findElement(By.id("user_login")).sendKeys(user);
		
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		
		driver.findElement(By.id("wp-submit")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"title didn't matched");
		
		System.out.println("Page Title verified");
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	@DataProvider(name="word")
	public Object[][]page(){
		
		Object[][]data=new Object[3][2];
		
		data[0][0]="Vikash";
		
		data[0][1]="1233";
		
		data[1][0]="demo";
		data[1][1]="ebxJS<H";
		
		data[2][0]="admin";
		data[2][1]="demo123";
		
		return data;
	}
	
	
	
	
	
}
