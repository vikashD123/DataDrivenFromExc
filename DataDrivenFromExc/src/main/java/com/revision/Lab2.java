package com.revision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Lab2 {

	@Test(enabled=false)
	public void readEx() throws IOException {
		
		File src=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("wordpress");
		
		String value=sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		String value1=sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value1);
	}
	
	@Test
	public void writedata() throws Exception {
		
		File src=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("wordpress");
		
		sheet.getRow(0).createCell(2).setCellValue("NAvya");
		
		sheet.getRow(1).createCell(2).setCellValue("Akshta");
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
		
		
		
		
		
		
		
		
		
	}
}
