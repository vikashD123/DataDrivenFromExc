package RevisioPart2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jaclor1 {

	public static void color(WebDriver driver,WebElement el) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('Style','background:yellow;border:2px solid red');",el);
		
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('Style','border:2px solid blue')",el);
		
	}
}
