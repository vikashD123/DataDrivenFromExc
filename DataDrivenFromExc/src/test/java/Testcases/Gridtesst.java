package Testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Gridtesst {

	@Test
	public void test1() throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities().chrome();
		
		cap.setPlatform(Platform.LINUX);
		
		URL url=new URL("http://192.168.1.17:4444/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(url, cap);
		
		driver.get("https://www.goibibo.com/");
		
		System.out.println("title is--"+driver.getTitle());
		
		driver.close();
		
		
	}
}
