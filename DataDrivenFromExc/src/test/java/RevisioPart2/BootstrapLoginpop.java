package RevisioPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapLoginpop {

	@Test
	public void test1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.goibibo.com/");
	
	driver.findElement(By.xpath("//*[text()='Sign up']")).click();
	
	driver.switchTo().frame("authiframe");
	
	driver.findElement(By.id("authMobile")).sendKeys("vikash");
	
	Thread.sleep(3000);
	
	driver.close();
}
}