package Revision;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptCode {

	@Test(enabled=false)
	public void test1() {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,300)");	
	}
	
	
	@Test(enabled=false)
	public void scrollDown() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
	}
	
	@Test
	public void scrollTillelement() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement el=driver.findElement(By.xpath("//*[text()='General Info']"));
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView();",el);
		
		String text=el.getText();
		
		System.out.println(text);
	}
}
