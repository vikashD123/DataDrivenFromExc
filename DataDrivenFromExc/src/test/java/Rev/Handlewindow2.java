package Rev;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlewindow2 {

	@Test
	public void verifyhandle() throws Exception {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://naukri.com");
		
		String parentId=driver.getWindowHandle();
		
		System.out.println("Parent id----"+parentId);
		
		Set<String>handle=driver.getWindowHandles();
		
		System.out.println("Child window id---"+handle);
		
		Iterator<String>it=handle.iterator();
		
		while(it.hasNext()) {
			
			String childid=it.next();
			
			if(!parentId.equalsIgnoreCase(childid)) {
				
			driver.switchTo().window(childid);
			
			System.out.println("child window title---"+driver.getTitle());
			
			Thread.sleep(3000);
			
			driver.close();
			
			}
		}
		
			driver.switchTo().window(parentId);
			
			System.out.println("parent window title-----"+driver.getTitle());
			
			driver.quit();
			
		
	}
}
