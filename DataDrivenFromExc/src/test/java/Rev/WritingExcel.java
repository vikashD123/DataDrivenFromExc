package Rev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingExcel {

	@Test
	public void test1() throws IOException {
		
		File src=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		sheet.getRow(0).createCell(2).setCellValue("Vikash");
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
		
	}
}
