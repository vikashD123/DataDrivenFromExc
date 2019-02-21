package RevisioPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascrpt {

	@Test(enabled=false)
	public void scrolltest1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.goibibo.com");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,300)");
	
	Thread.sleep(3000);
	
	driver.close();
	}
	
	@Test(enabled=false)
	public void scrolltillbottom() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	Thread.sleep(5000);
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	Thread.sleep(3000);
	
	//driver.close();
	
	}
	@Test(enabled=false)
	public void scrolltillElement() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.goibibo.com");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement el=driver.findElement(By.xpath("//*[text()='About Us']"));
	
	Thread.sleep(4000);
	
	js.executeScript("arguments[0].scrollIntoView()",el);
	
	}
	@Test
	public void sendvalue() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.goibibo.com");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	Thread.sleep(3000);
	
	js.executeScript("document.getElementById('gosuggest_inputSrc').value='gosugges'");
	
	}
}
