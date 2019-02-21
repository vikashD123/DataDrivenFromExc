package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptLab1 {
	
	@Test(enabled=false)
	public void scroll() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			//driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
			
			driver.get("https://www.facebook.com/");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			//To scroll Til some amount
			
		//	js.executeScript("window.scrollBy(0,'3000')");
			
		
			//To scroll to particular amout
			
		/*	WebElement element=driver.findElement(By.xpath("//*[text()='Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.']"));
			
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].scrollIntoView();",element);
			
			String text=element.getText();
			
			System.out.println(text); */
			
			
			//----to scroll till bottom
			
		//	Thread.sleep(3000);
			
		//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			
			//To send text
			
		//	Thread.sleep(3000);
			
		//	js.executeScript("document.getElementById('email').value='vikash'");
			
			
	}
	
	@Test(enabled=false)
	public void togetText() throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			driver.findElement(By.id("fromPlaceName")).sendKeys("BANG");
			
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			String text="return document.getElementById('fromPlaceName').value".toString();
			
		    String str=(String)js.executeScript(text);
		    
		    System.out.println(str);
			
	}
	
	@Test(enabled=false)
	public void test() throws Exception {
		

		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	@Test
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		
		js.executeScript("document.getElementById('fromPlaceName').value='BANG'");
		
		
	}

}
