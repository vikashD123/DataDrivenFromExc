package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class BootLogin {

	@Test
	public void loginPop() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.goibibo.com/");
	
	driver.findElement(By.xpath("//*[text()='Sign up']")).click();
	
	driver.switchTo().frame("authiframe");
	
	driver.findElement(By.id("authMobile")).sendKeys("hi");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("mobileSubmitBtn")).click();
	
	WebElement element=driver.findElement(By.xpath("//*[text()='Please enter a valid mobile']"));
	
	String text=element.getText();
	
	Assert.assertTrue(text.contentEquals("realease"),"value didn't matched");
	
	
	
}
}