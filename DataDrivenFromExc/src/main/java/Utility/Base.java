package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public WebDriver driver;
	
	@BeforeMethod()
	public void openbrowser() throws Exception {
		
		if(Utilityacc.fecth("browser").toString().equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
			
			driver=new ChromeDriver();
		}
		else if(Utilityacc.fecth("browser").toString().equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/home/manjit/Downloads/geckodriver-v0.21.0-linux64/geckodriver");
			
			driver=new FirefoxDriver();
		}
		
		driver.get(Utilityacc.fecth("URL").toString());
	}
	
	@AfterMethod()
	public void tearDown() {
		
		driver.close();
	}
}
