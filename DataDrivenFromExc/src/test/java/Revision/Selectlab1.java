package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selectlab1 {

	@Test(enabled=false)
	public void test1() throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement drop_down=driver.findElement(By.xpath("//*[contains(@id,'day')]"));
			
			Select element=new Select(drop_down);
			
			element.selectByIndex(9);
			
			Thread.sleep(2000);
			
			element.selectByValue("19");
			
			Thread.sleep(2000);
			
			element.selectByVisibleText("31");
			
			Thread.sleep(2000);
			
			driver.close();
	}
	@Test(enabled=true)
	public void test2() {
		
		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement el=driver.findElement(By.xpath("//*[contains(@name,'birthday_day')]"));
			
			Select dropdown=new Select(el);
			
			WebElement element1=dropdown.getFirstSelectedOption();
			
			System.out.println("Before selecting----"+element1.getText());
			
			dropdown.selectByIndex(21);
			
			WebElement element2=dropdown.getFirstSelectedOption();
			
			System.out.println("After selecting value is-----"+element2.getText());
	}
	
	@Test(enabled=false)
	public void test3() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
		
			WebElement element=driver.findElement(By.id("month"));
			
			Select dropdown=new Select(element);
			
			List<WebElement> element1=dropdown.getOptions();
			
			int count=element1.size();
			
			System.out.println("Total values-----"+count);
			
			for(int i=0;i<count;i++) {
				
				WebElement element2=element1.get(i);
				
				String text=element2.getText();
				
				System.out.println("values----"+text);
				
				if(text.equalsIgnoreCase("aug")) {
					
					element2.getText();
					
					break;
					
				}
			}
			Thread.sleep(2000);
			
			driver.close();
	}
	
}
