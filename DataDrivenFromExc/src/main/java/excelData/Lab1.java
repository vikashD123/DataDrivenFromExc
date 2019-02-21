package excelData;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab1 {

	WebDriver driver;
	
	@Test(dataProvider="wordlogin")
	public void verifyLogin(String name,String pass) {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		driver.findElement(By.id("user_login")).sendKeys(name);
		
		driver.findElement(By.name("pwd")).sendKeys(pass);
		
		driver.findElement(By.name("wp-submit")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"Title verified");
		
		System.out.println("page tile got verified");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@DataProvider(name="wordlogin")
	public Object verifyLogin() throws Exception {
		
		FileInputStream fis=new FileInputStream("./Config/Data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("wordpress");
		
		int count =sheet.getPhysicalNumberOfRows();
		
		Object[][] data=new Object[count][2];
		
		for(int i=0;i<count;i++) {
			
		  XSSFRow row=sheet.getRow(i); 
		  
		  XSSFCell c1=row.getCell(0);
			
		  XSSFCell c2=row.getCell(1);
		  
		  data[i][0]=c1.getStringCellValue();
		  
		  data[i][1]=c1.getStringCellValue();
		}
		return data;
	}
}
