package RevisioPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ColoringElement {

	@Test
	public void textHighlight() {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
		
	WebElement user=driver.findElement(By.id("email"));
	
	Jaclor1.color(driver,user);
	
	user.sendKeys("vikash");
	
	WebElement pass=driver.findElement(By.id("pass"));
	
	Jaclor1.color(driver,pass);
	
	pass.sendKeys("1234");
	
	WebElement button=driver.findElement(By.id("loginbutton"));
	
	Jaclor1.color(driver,button);
	
	button.click();
	
	
	
	
}
}