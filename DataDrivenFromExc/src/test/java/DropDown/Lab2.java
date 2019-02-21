package DropDown;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab2 {

	@Test(enabled=false)
	public void test1() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	
	driver.findElement(By.xpath("//a[contains(@href,'http://www.facebook.com')]")).click();
	
	Set<String>handle=driver.getWindowHandles();
	
	Iterator<String>it=handle.iterator();
	
	String parentId=it.next();
	
	System.out.println("parent window Id--------"+parentId);
	
	String childId=it.next();
	
	System.out.println("child window id---------"+childId);
	
	driver.switchTo().window(childId);
	
	driver.findElement(By.id("email")).sendKeys("Vikash");
	
	Thread.sleep(3000);
	
	driver.close();
	
	driver.switchTo().window(parentId);
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(3000);
	
	driver.close();
	
	}
	
	@Test(enabled=false)
	public void naukriTest2() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parentId=driver.getWindowHandle();
		
		System.out.println("Parent id-----"+parentId);
		
		Set<String>handle=driver.getWindowHandles();
		
		System.out.println("Child window Id===="+handle);
		
		Iterator<String>it=handle.iterator();
		
		while(it.hasNext()) {
			
			String childId=it.next();
			
			if(!parentId.equalsIgnoreCase(childId)) {
				
				driver.switchTo().window(childId);
				
				System.out.println(driver.getTitle());
				
				Thread.sleep(3000);
				
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
	public void test3() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		Set<String>handle=driver.getWindowHandles();
		
		
		ArrayList<String>tab=new ArrayList<>(handle);
		
		driver.switchTo().window(tab.get(2));
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(tab.get(1));
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(tab.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
