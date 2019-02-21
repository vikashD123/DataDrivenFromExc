package excelData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab3 {

	WebDriver driver;
	
	@Test(dataProvider="wordpressLogin")
	public void testWord_press(String user,String pass) {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		driver.findElement(By.name("log")).sendKeys(user);
		
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		
		driver.findElement(By.id("wp-submit")).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@DataProvider(name="wordpressLogin")
	public Object pagedata() throws Exception{
		
		FileInputStream fis=new FileInputStream("./Config/Data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("wordpress");
		
		int count=sheet.getPhysicalNumberOfRows();
		
		Object[][]data=new Object[count][2];
		
		for(int i=0;i<count;i++) {
		
		XSSFRow row=sheet.getRow(i);
		
		XSSFCell c1=row.getCell(0);
		
		XSSFCell c2=row.getCell(1);
		
		data[i][0]=c1.getStringCellValue();
		
		data[i][1]=c2.getStringCellValue();
		
		}
		return data;
	}
}
