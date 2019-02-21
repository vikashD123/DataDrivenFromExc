package Rev;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogTest {
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		Logger log=Logger.getLogger("LogTest");
		
		PropertyConfigurator.configure("log4j.properties");
		
		WebDriver driver=new ChromeDriver();
		
		log.info("--chrome Launching---");
}
}