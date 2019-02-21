package sreen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Takepic {

	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("Bangalore");
		
		Utility.capture(driver,"place");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		Utility.capture(driver, "value");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String str="return document.getElementById(\"fromPlaceName\").value";
		
		String text=(String)js.executeScript(str);
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
