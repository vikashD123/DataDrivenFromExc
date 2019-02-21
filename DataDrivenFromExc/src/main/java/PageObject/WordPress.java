package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WordPress {
	
	WebDriver driver;
	
	public WordPress(WebDriver driver) {
		
		this.driver=driver;
		
	}
		
@FindBy(how=How.ID,using="user_login")WebElement UserId;

@FindBy(how=How.NAME,using="pwd")WebElement passId;

@FindBy(how=How.XPATH,using="//*[@name='wp-submit']")WebElement loginButton;

public void userValue(String user) {
	
	UserId.sendKeys(user);
}

public void passvalue(String pass) {
	
	passId.sendKeys(pass);
}

public void clickButton() {
	loginButton.click();
}
		
	}

