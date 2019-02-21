package RevisioPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingFrame {
	
	@Test
	public void test() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///home/manjit/Documents/myframe.html");
		
		int count=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(count);
		
		driver.switchTo().frame("jqueryui");
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Vikash");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[text()='Click here for Selenium tutorial']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
