package RevisioPart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WAitMethod {

	@Test(enabled=false)
	public void test1() throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		
		WebElement el=driver.findElement(By.xpath("//*[text()='QTP']"));
		
		boolean status=el.isDisplayed();
		
		if(status) {
			
			System.out.println("value is displayed");
		}
		else {
			System.out.println("value is not displayed");
		}
		
}
	
	
	@Test
	
	
	public void explic() {
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	
	driver.findElement(By.xpath("//*[text()='Click me to start timer']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,3000);
	
	WebElement el=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='QTP']")));
	
	boolean status=el.isDisplayed();
	
	if(status) {
		
		System.out.println("value displayed");
	}
	else {
		
		System.out.println("value didn't displayed");
	}
	}	
	
}