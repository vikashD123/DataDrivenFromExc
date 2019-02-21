package Rev;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab2 {

	@Test(enabled=false)
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//To scroll till ssome poit
		
	//	js.executeScript("window.scrollBy(0,500)");
		
	//	To scrooll till bottom
		
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	//To scrool to particular element
		
	//	WebElement el=driver.findElement(By.xpath("//*[@id='sendLinkButton']"));
		
	//	js.executeScript("arguments[0].scrollIntoView()",el);
		
		
		//To send text
		
	//	js.executeScript("document.getElementById('smsTXTBOX').value='vikash'");	
		
	}
	@Test(enabled=true)
	public void test12() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BANG");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.SHIFT);
		
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		
		String value="return document.getElementById('fromPlaceName').value";
		
		String str=(String)js.executeScript(value);
		
		System.out.println(str);
		
	
	}
}
