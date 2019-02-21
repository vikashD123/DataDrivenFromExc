package RevisioPart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousemove {
	
	@Test
	public void scroll() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
			
			Actions act=new Actions(driver);
			
			WebElement el=driver.findElement(By.xpath("//button[@class='dropbtn']"));

			act.moveToElement(el).build().perform();
			
			List<WebElement> element=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
			
			int count=element.size();
			
			System.out.println(count);
			
			for(int i=0;i<count;i++) {
				
				WebElement value=element.get(i);
				
				String text=value.getText();
				
				if(text.equalsIgnoreCase("testng")) {
					
					value.click();
					
					break;
				}
			}
			Thread.sleep(3000);
			
			driver.close();
			
			
}
}