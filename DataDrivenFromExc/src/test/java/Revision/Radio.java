package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {

	@Test(enabled=false)
	public void testradio() {
		
       System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		WebElement el=driver.findElement(By.id("c#"));
		
		el.click();
		
		System.out.println(el.isSelected());
	}
	@Test
	public void test2() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> element=driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
		
		int count=element.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement value=element.get(i);
			
			String text=value.getAttribute("id");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("python")) {
				
				value.click();
				
				break;
				
			}
		}
	Thread.sleep(2000);
		
		driver.close();
	}
}
