package Revision;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitImplictExplict {

	@Test(enabled=false)
	public void testimplicit() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//*[text()='Click me to start timer']")).click();
		
		WebElement element=driver.findElement(By.xpath("//p[text()='QTP']"));
		
		boolean status=element.isDisplayed();
		
		if(status) {
			
			System.out.println("Element is displayed");
			
		}
		else {
			System.out.println("Element is not displayed");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	@Test(enabled=true)
	public void testexplicit() {
	
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//*[text()='Click me to start timer']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='QTP']")));
		
	boolean value=status.isDisplayed();
		
	if(value) {
		
		System.out.println("value is displayed");
	}
	else {
		System.out.println("value is not displayed");
	}
		
	}
}
