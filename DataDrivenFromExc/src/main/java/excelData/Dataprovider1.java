package excelData;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider1 {

	@DataProvider(name="accessdata")
	public static Object fecth() throws Exception {
		
		FileInputStream fis=new FileInputStream("./Config/Data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("crm");
		
		int count=sheet.getPhysicalNumberOfRows();
		
		Object[][] data=new Object[count][2];
		
		for(int i=0;i<count;i++) {
		
		XSSFRow row=sheet.getRow(i);
		
		XSSFCell cell1=row.getCell(0);
		
		XSSFCell cell2=row.getCell(1);
		
		data[i][0]=cell1.getStringCellValue();
		
		data[i][1]=cell2.getStringCellValue();
	}
		
		return data;
	}
	}
