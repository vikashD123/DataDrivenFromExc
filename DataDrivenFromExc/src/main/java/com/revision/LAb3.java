package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LAb3 {
	
	WebDriver driver;

	@Test(dataProvider="wordpress")
	public void testverify(String user,String pass) {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
        driver=new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		driver.findElement(By.id("user_login")).sendKeys(user);
		
		driver.findElement(By.name("pwd")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@name='wp-submit']")).click();
		
		
	}
	@AfterMethod
	public void tearDown() throws Exception {
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	@DataProvider(name="wordpress")
	public Object verify() {
		
		Object[][]data=new Object[3][2];
		
		data[0][0]="Akshtaka";
		
		data[0][1]="lick@123";
		
		data[1][0]="bmbbkjihkjkl";
		
		data[1][1]="XXggf@123";
		
		data[2][0]="bmbnbkj";
		
		data[2][1]="hkhjhkjh";
		
		return data;
				
	}
	
	
	
	
	
	
	
}
