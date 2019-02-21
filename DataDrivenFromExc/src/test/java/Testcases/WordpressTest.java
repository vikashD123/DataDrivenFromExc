package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.WordPress;

public class WordpressTest {
	
	@Test
	public void verifyLogin() {
		
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
	
	WordPress login=PageFactory.initElements(driver,WordPress.class);
	
	login.userValue("admin");
	
	login.passvalue("demo123");
	
	login.clickButton();
	}

}
