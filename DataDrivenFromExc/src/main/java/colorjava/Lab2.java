package colorjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab2 {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el1=driver.findElement(By.id("email"));
		
		Lab1.color(driver,el1);
		
		el1.sendKeys("vikash");
		
		WebElement el2=driver.findElement(By.id("pass"));
		
         Lab1.color(driver, el2);
         
         el2.sendKeys("raju@1222");
         
         WebElement el3=driver.findElement(By.id("loginbutton"));
         
         Lab1.color(driver, el3);
         
         el3.click();
				
	}			
}
