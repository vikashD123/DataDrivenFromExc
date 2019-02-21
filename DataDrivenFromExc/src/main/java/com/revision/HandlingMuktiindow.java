package com.revision;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingMuktiindow {
	
	@Test
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parentId=driver.getWindowHandle();
		
		System.out.println("parent window id----"+parentId);
		
		Set<String> handle=driver.getWindowHandles();
		
		System.out.println("child id-----"+handle);
		
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

}
