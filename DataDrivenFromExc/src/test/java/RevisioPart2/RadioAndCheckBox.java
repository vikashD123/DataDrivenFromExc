package RevisioPart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioAndCheckBox {
	
	@Test(enabled=false)
	public void test1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
		
		int count=radio.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement el=radio.get(i);
			
			String text=el.getAttribute("id");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("python")) {
				
				el.click();
				
				break;
			}
			
		}
		Thread.sleep(3000);
		
		driver.close();
	
	
	}

	@Test(enabled=true)
	public void test2() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> check=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
	
				int count=check.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement el=check.get(i);
			
			String text=el.getAttribute("id");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("code")) {
				
				el.click();
			
			}
		}
		Thread.sleep(2000);
		
		driver.close();
	}	

	
	@Test(enabled=true)
	public void test3() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BANG");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String text="return document.getElementById('fromPlaceName').value";
		
		String str=(String)js.executeScript(text);
		
		System.out.println(str);
}
}
