package RevisioPart2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDrop {

	@Test
	public void test1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		
		List<WebElement>el=driver.findElements(By.xpath("//ul[@role='menu']//li/a"));
		
		int count=el.size();
		
		System.out.println("Total-------"+count);
		
		for(int i=0;i<count;i++) {
			
			WebElement value=el.get(i);
			
			String text=value.getText();
			
			if(text.equalsIgnoreCase("css")) {
				
				value.click();
				
				break;
			}
		}
		Thread.sleep(2000);
		
		driver.close();
				
	}
}
