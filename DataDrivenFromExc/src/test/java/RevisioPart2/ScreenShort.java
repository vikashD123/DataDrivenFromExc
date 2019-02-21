package RevisioPart2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.Capture;

public class ScreenShort {

	@Test(enabled=false)
	public void test1() throws IOException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		Capture.screen(driver,"blog");
		
		System.out.println("Screen short taken");
	}
	
	@Test
	public void test2() throws IOException, InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source,new File("./Screen/spot.png"));
		
		System.out.println("Screen short taken");
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
