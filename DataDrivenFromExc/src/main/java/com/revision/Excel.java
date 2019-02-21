package com.revision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {

	@Test(enabled=false)
	public void test() throws Exception {
		
		File src=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		String value=sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		String value1=sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value1);
	}
	@Test
	public void test1()throws Exception {
		
		File src=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		sheet.getRow(0).createCell(3).setCellValue("Reader");
		
		sheet.getRow(1).createCell(3).setCellValue("Writer");
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
	}
}
