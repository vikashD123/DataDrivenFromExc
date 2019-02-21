package RevisioPart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingHiden {
	
	@Test
	public void hidden() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	
	List<WebElement>el=driver.findElements(By.xpath("//*[@id='male' and @type='radio']"));
	
	int count =el.size();
	
	System.out.println(count);
	
	for(int i=0;i<count;i++) {
		
	WebElement el2=el.get(i);
	
	int x=el2.getLocation().getX();
	
	if(x!=0) {
		
		el2.click();
	}
		
	}
	Thread.sleep(3000);
	
	driver.close();
	
	}

}
