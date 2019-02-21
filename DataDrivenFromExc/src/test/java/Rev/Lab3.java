package Rev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Lab3 {

	@Test
	public void reading() throws IOException {
		
		File src=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("crm");
		
		String vlue=sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(vlue);
		
		String val1=sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(val1);
	}
}
