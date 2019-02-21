package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ksrtdropdown {

	@Test
	public void test() {
		

		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
			
			driver.findElement(By.id("fromPlaceName")).sendKeys("BANGALORE");
			
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			String str="return document.getElementById(\"fromPlaceName\").value";
			
			String text=(String)js.executeScript(str).toString();		
					
			System.out.println(text);
	}
}
