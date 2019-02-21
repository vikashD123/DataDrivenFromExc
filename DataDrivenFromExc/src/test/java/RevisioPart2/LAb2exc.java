package RevisioPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LAb2exc {

	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user=driver.findElement(By.id("email"));
		
		Lab1.highlight(driver,user);
		
		user.sendKeys("Vikassh");
		
		WebElement pass=driver.findElement(By.id("pass"));
		
		Lab1.highlight(driver,pass);
		
		pass.sendKeys("12345");
		
		WebElement button=driver.findElement(By.id("loginbutton"));
		
		Lab1.highlight(driver,button);
		
		button.click();
	}
}
