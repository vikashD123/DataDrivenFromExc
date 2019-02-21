package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DropDown.LabHigh;

public class Labjava {

	@Test(enabled=true)
	public void test12() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user=driver.findElement(By.id("email"));
		
		LabHigh.color(driver,user);
		
		user.sendKeys("Vikash");
		
		WebElement pass=driver.findElement(By.id("pass"));
		
		LabHigh.color(driver,pass);
		
		pass.sendKeys("12424");
		
		WebElement button=driver.findElement(By.id("loginbutton"));
		
		LabHigh.color(driver,button);
		
		button.click();
		
		
	}
	
}
