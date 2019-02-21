package com.excelandData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DAtaProvideLAb1 {
	
	WebDriver driver;
	
	@Test(dataProvider="wordpress")
	public void test1(String user,String pass) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
	    driver=new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		driver.findElement(By.id("user_login")).sendKeys(user);
		
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		
		driver.findElement(By.id("wp-submit")).click();
		
	Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login invalid data");
	
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		driver.quit();
	}
	
@DataProvider(name="wordpress")
public Object[][] passdata(){
	
	Object[][] obj=new Object[3][2];
	
	obj[0][0]="Vikash";
	
	obj[0][1]="1233@qww";
	
	obj[1][0]="demo";
			
	obj[1][1]="demo123";
	
	obj[2][0]="admin";
	
	obj[2][1]="demo123";
	
	return obj;
}

}
