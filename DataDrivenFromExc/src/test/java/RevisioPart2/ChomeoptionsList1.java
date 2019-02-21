package RevisioPart2;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class ChomeoptionsList1 {

	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		ChromeOptions opt=new ChromeOptions();
		
		//---------(1)To disable infor bar
		
		// opt.addArguments("--disable-infobars");
		
		//(2)--------To run headLesss--------
		
	//	opt.addArguments("headless");
		
		
		//(3)To add extensions-----------
		
	//	opt.addExtensions(new File("/home/manjit/Downloads/Proxy-SwitchyOmega_v2.5.19.crx"));
		
		//To accept insecure certi
		
		DesiredCapabilities ds=new DesiredCapabilities();
		
        ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        
        opt.merge(ds);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://www.cacert.org/");
		
	   System.out.println(driver.getTitle());
		
	}
}
