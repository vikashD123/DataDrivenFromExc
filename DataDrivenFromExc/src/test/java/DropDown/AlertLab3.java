package DropDown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertLab3 {

	@Test
	public void test() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		//to get text from alert
	//	System.out.println(alt.getText());
		
		Thread.sleep(3000);
		
		//to click on ok button
		//alt.accept();
		
		//To click on dismiss
		
		alt.dismiss();
	}
}
