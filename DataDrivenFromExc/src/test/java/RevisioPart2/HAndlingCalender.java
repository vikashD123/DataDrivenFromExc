package RevisioPart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HAndlingCalender {

	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='Onward Date']")).click();
		
		List<WebElement> value=driver.findElements(By.xpath("//*[@class='rb-calendar']//tr/td"));
		
		int count=value.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement el=value.get(i);
			
			String text=el.getText();
			
			if(text.equalsIgnoreCase("25")) {
				
				el.click();
				
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
	}
	
}
