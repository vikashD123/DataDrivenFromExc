package Rev;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HandleMultiwindow {
	
	@Test
	public void handle() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.findElement(By.xpath("//*[@href='http://www.google.com']")).click();
		
		Set<String>handle=driver.getWindowHandles();
		
		Iterator<String>it=handle.iterator();
		
		String parentId=it.next();
		
		System.out.println("Parent window id===="+parentId);
		
		String childId=it.next();
		
		System.out.println("Child window id------"+childId);
		
		driver.switchTo().window(childId);
		
		System.out.println("child window title---"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentId);
		
		System.out.println("parent window title----"+driver.getTitle());
		
		driver.quit();
	}

}
