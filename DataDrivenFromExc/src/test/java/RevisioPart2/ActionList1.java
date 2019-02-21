package RevisioPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionList1 {

	@Test
	public void performaction() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
		//	driver.get("https://www.facebook.com/");
			
			driver.get("https://login.yahoo.com/config/login_verify2?.intl=in");
			
			Actions act=new Actions(driver);
			
		//	To perform double click
			
		//	act.moveToElement(driver.findElement(By.id("email"))).click().keyDown(Keys.SHIFT).sendKeys("vikash").doubleClick().build().perform();
			
			//To perfor right click
			
		//	act.moveToElement(driver.findElement(By.id("email"))).contextClick().build().perform();
			
			// Element not clickble-------
			
			WebElement el=driver.findElement(By.id("persistent"));
			
			act.moveToElement(el).click().build().perform();
			
			
			
			
			
	}
}
