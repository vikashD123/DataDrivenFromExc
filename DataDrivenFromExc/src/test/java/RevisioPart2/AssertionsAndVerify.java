package RevisioPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsAndVerify {

	@Test
	public void test1() throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actual=driver.getTitle();
		
		System.out.println(actual);
		
		String expected="Facebook – log in or sign up";
		
		Assert.assertEquals(actual, expected,"Value didn't matched");
		
		System.out.println("Test 1 completed");
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		
		driver.findElement(By.xpath("//*[contains(@class,'CwaK9')]")).click();
		
		WebElement el=driver.findElement(By.xpath("//div[contains(@class,'GQ8Pzc')]"));
		
		String actual=el.getText();
		
		SoftAssert as=new SoftAssert();
		
		as.assertTrue(actual.contains("V"),"value didn't matched");
		
		System.out.println("Test 2 completed");
		
		as.assertAll();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
}
