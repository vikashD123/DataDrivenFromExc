package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousemovement {

	@Test(enabled=false)
	public void handlingMouseOver() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement element=driver.findElement(By.xpath("//*[text()='Automation Tools']"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
		act.moveToElement(element).build().perform();
		
		List<WebElement> value=driver.findElements(By.xpath("//*[@class='dropdown-content']//a"));
		
		int count=value.size();
		
		System.out.println("Total value----"+count);
		
		for(int i=0;i<count;i++) {
			
			WebElement text=value.get(i);
			
			String str=text.getText();
			
			System.out.println(str);
			
			if(str.equalsIgnoreCase("testng")) {
				
				text.click();
				
				break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	@Test(enabled=false)
	public void act() {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("fromPlaceName"))).click().keyDown(Keys.SHIFT).sendKeys("bangalore").build().perform();
		
	}
	@Test(enabled=false)
	public void doubclick() {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("fromPlaceName"))).click().keyDown(Keys.SHIFT).sendKeys("bangalore").doubleClick().build().perform();	
		
		
	}
	
	@Test
	public void contextRight() {
		
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("fromPlaceName"))).contextClick().build().perform();
		
		
	}
	
}
