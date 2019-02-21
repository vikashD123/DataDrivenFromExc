package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LAb {

	@Test
	public void dropdown() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	/*	WebElement el=driver.findElement(By.id("day"));
		
		Select s=new Select(el);
		
		s.selectByIndex(0);
		
		s.selectByValue("2");
		
		s.selectByVisibleText("21");
		
		WebElement el1=driver.findElement(By.id("month"));
		
		Select s1=new Select(el1);
		
		s1.selectByIndex(0);
		
		s1.selectByValue("4");
		
		s1.selectByVisibleText("Aug");
		
		WebElement el2=driver.findElement(By.id("year"));
		
		Select s2=new Select(el2);
		
		s2.selectByIndex(0);
		
		s2.selectByValue("2018");
		
		s2.selectByVisibleText("2011");
		*/
		
	/*	Select s=new Select(driver.findElement(By.id("month")));
		
		WebElement el=s.getFirstSelectedOption();
		
		System.out.println("before selecting--"+el.getText());
	
		s.selectByVisibleText("Aug");
		
		WebElement el1=s.getFirstSelectedOption();
		
		System.out.println("After selecting---"+el1.getText());
		
		*/
		
		Select s=new Select(driver.findElement(By.id("month")));
		
	     List <WebElement> el=s.getOptions();
	     
	     System.out.println("Total size----"+el.size());
	     
	     for(int i=0;i<el.size();i++) {
	    	 
	    	 WebElement el2= el.get(i);
	    	 
	    	 String text=el2.getText();
	    	 
	    	 System.out.println(text);
	    	 
	    	 if(text.equalsIgnoreCase("Aug")) {
	    		 
	    		 el2.click();
	    		 
	    		 break;
	    	 }
	     }
		
	}
}
