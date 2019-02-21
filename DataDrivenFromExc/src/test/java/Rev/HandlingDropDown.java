package Rev;

import java.util.List;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropDown {

	@Test
	public void dropDown() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		//1 way
		
/*		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("month"));
		
		Select dropdown=new Select(el);
		
		dropdown.selectByIndex(0);
		
		dropdown.selectByValue("2");
		
		dropdown.selectByVisibleText("Aug");
	*/
		
		//2nd way
		
/*		driver.get("https://www.facebook.com/");
		
	    Select s=new Select(driver.findElement(By.id("month")));
	    
	    WebElement el=s.getFirstSelectedOption();
	    
	    System.out.println("before selecting-----"+el.getText());
	    
	    s.selectByIndex(0);
	    
	    WebElement el1=s.getFirstSelectedOption();
	   
	    System.out.println("After selecting ------"+el1.getText());
	*/
		
		//3rd way
		
		driver.get("https://www.facebook.com/");
		
		Select s=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> el=s.getOptions();
		
		System.out.println("Size----"+el.size());
		
		for(int i=0;i<el.size();i++) {
			
			WebElement value=el.get(i);
			
			String text=value.getText();
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("dec")) {
				
				value.click();
				
				break;
			}
			
			
           
		}
		
	}
}
