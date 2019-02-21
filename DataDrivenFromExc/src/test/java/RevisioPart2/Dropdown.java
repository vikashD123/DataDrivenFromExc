package RevisioPart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test(enabled=false)
	public void drop_down() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("month"));
		
		Select s=new Select(el);
		
		s.selectByIndex(4);
		
		Thread.sleep(2000);
		
		s.selectByValue("8");
	
		Thread.sleep(2000);
		
		s.selectByVisibleText("Nov");
		
		driver.close();
		
	}
	@Test(enabled=false)
	public void test2() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement el=driver.findElement(By.id("month"));
		
		Select s=new Select(el);
		
		WebElement el1=s.getFirstSelectedOption();
		
		System.out.println("Before electing value i------"+el1.getText());
		
		s.selectByIndex(8);
		
		WebElement el2=s.getFirstSelectedOption();
		
		System.out.println("After selecting value is-----"+el2.getText());
		
		Thread.sleep(2000);
		
		driver.close();	
		
	}
	@Test
	public void test3() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	 WebElement el=driver.findElement(By.xpath("//*[@id='month']"));
	 
	 Select s=new Select(el);
	 
	 List<WebElement> value=s.getOptions();
	 
	 int count=value.size();
	 
	 System.out.println(count);
	 
	 for(int i=0;i<count;i++) {
		 
		 WebElement el2=value.get(i);
		 
		 String text=el2.getText();
		 
		 System.out.println(text);
		 
		 if(text.equalsIgnoreCase("Nov")) {
			 
			 el2.click();
			 
			 break;
		 }
	 }
	 Thread.sleep(2000);
	 driver.close();
	
	}
}
