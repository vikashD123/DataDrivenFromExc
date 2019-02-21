package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CrmLoginpage {

   public WebDriver driver;
	
	public CrmLoginpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="username")WebElement user;
	
	@FindBy(how=How.NAME,using="password")WebElement pass;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")WebElement login_Button;
	
	public void verifyuser(String userId) {
		
		user.sendKeys(userId);
	}
	
	public void verifypass(String passId) {
		
		pass.sendKeys(passId);
	}
	
	public void verifyLogin() {
		
		login_Button.click();
	}
}
