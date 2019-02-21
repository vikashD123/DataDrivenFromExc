package Rev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LAb1 {

	@Test(enabled=false)
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[contains(text(),'Click me to start timer')]")).click();
		
		WebElement el=driver.findElement(By.xpath("//*[text()='QTP']"));
		
		boolean status=el.isDisplayed();
		
		if(status) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is not displayed");
		}
		Thread.sleep(3000);
		
		driver.close();
	}
	
	@Test(enabled=true)
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//*[text()='Click me to start timer']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,3000);
		
		WebElement el=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'QTP')]")));
		
		boolean status=el.isDisplayed();
		
		if(status) {
			
			System.out.println("Value is displayed");
		}
		else {
			System.out.println("VAlue is not diplayed");
		}
	}
}
