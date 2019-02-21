package RevisioPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	@Test
	public void test1() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
		act.dragAndDrop(drag, drop).build().perform();
		
	}
}
