package Rev;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit; //employe50500

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken {

	@Test
	public void Verify() throws MalformedURLException, IOException{
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		link.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total links-----"+link.size());
		
		List<WebElement>active=new ArrayList<WebElement>();
		
		for(int i=0;i<link.size();i++) {
			
			System.out.println(link.get(i).getAttribute("href"));
			
			if(link.get(i).getAttribute("href")!=null && (!link.get(i).getAttribute("href").contains("javascript"))) {
			
			active.add(link.get(i));
		}
	
	}
		System.out.println("Total active linkss---"+active.size());
		
		for(int j=0;j<active.size();j++) {
			
			HttpURLConnection connection=(HttpURLConnection) new URL(active.get(j).getAttribute("href")).openConnection();
			
		   connection.connect();
		   
		   String response=connection.getResponseMessage();
		   
		   connection.disconnect();
		   
		   System.out.println(active.get(j).getAttribute("href")+"---"+response);
		   
			
		}

}
}

