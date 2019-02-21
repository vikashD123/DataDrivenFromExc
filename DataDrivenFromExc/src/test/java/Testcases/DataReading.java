package Testcases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.CrmLoginpage;

public class DataReading  {

	 public WebDriver driver;
	
	@Test(dataProvider="reading")
	public void verifyLogin(String user,String pass) {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		
		CrmLoginpage obj=PageFactory.initElements(driver,CrmLoginpage.class);
		
		obj.verifyuser(user);
		obj.verifypass(pass);
		obj.verifyLogin();
		
	}
	@DataProvider(name="reading")
	public Object verifydata() throws Exception {
		
		FileInputStream fis =new FileInputStream("./Config/Data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("crm");
		
		int count =sheet.getPhysicalNumberOfRows();
		
		Object[][] data=new Object[count][2];
		
		for(int i=0;i<count;i++) {
			
			XSSFRow row= sheet.getRow(i);
			XSSFCell c1=row.getCell(0);
			XSSFCell c2=row.getCell(1);
			data[i][0]=c1.getStringCellValue();
			data[i][1]=c2.getStringCellValue();
			
		}
		return data;	
	
	}
	
	}

