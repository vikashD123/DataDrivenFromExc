package RevisioPart2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UntrustedCerti {
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		DesiredCapabilities ds=new DesiredCapabilities();
		
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.merge(ds);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://www.cacert.org/");
		
		
	}
}
