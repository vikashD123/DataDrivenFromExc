package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Lab4 {

	WebDriver driver;
	
	@Test(dataProvider="wordp",dataProviderClass=Lab5.class)
	public void readExce(String user,String pass) {
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
        driver=new ChromeDriver();
		
        driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
        
        driver.findElement(By.id("user_login")).sendKeys(user);
        
        driver.findElement(By.name("pwd")).sendKeys(pass);
        
        driver.findElement(By.id("wp-submit")).click();
	}
	@AfterMethod
	public void TearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
