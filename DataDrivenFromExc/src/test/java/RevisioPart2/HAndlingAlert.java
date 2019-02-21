package RevisioPart2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HAndlingAlert {

	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alt=driver.switchTo().alert();
		
	/*	String text=alt.getText();
		
		System.out.println(text);
		
		alt.accept();
		
		*/
		//To click on dismiss
		
		//alt.dismiss();
	}
}
