package Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAsert {

	@Test
	public void hard() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		System.out.println("test case 1 strarted");
		
		String actual_title=driver.getTitle();
		
		String expected_title="KSRTC Official Website for Online Bus Ticket Booking - KSRTC.in";
		
		Assert.assertEquals(actual_title, expected_title);
		
		System.out.println("test completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	@Test
	public void hardtest2() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		System.out.println("test 2 started");
		
		SoftAssert assertion=new SoftAssert();
		
		String actual=driver.getTitle();
		
		String expected="KSRTC Official Website for Online Bus Ticket Booking";
		
		assertion.assertEquals(actual, expected);
		
		System.out.println("test 2 completed");
		
		assertion.assertAll();
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
}
