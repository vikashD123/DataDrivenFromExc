package excelData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascript {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//---To scroll to some amount
		
		//Below was for facebook
		
	//	js.executeScript("window.scrollBy(0,400)");
		
		//To scroll till particular element
		
	//	WebElement el=driver.findElement(By.xpath("//a[text()='Sign Up']"));
		
	//	js.executeScript("arguments[0].scrollIntoView();",el);
		
	
		// to scroll till bottom
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		//to send text without sendkeys() method
		
	//	js.executeScript("document.getElementById('email').value='Vikash'");
		
		
	//To get text
		
		String text="return document.getElementById('fromPlaceName').value";
		
		String str=(String)js.executeScript(text);
		
		System.out.println(str);
	}

}
