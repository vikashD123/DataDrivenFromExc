package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyError {

	@Test
	public void VerifyError() {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		WebElement element=driver.findElement(By.className("GQ8Pzc"));
		
		String actual=element.getText();
		
		String expected="Enter an email or phone number";
		
		System.out.println("Test started");
		
		Assert.assertEquals(actual, expected,"value didn't matched");
		
		System.out.println("test completed");
	}
}
