package com.excelandData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readingEx {
	
	@Test(enabled=false)
	public void test1() throws IOException {
		
		File ssrc=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(ssrc);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("crm");
		
		String value=sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		String value1=sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(value1);
		
		wb.close();
		
	}
	@Test(enabled=false)
	public void writeexcel() throws IOException {
		
		File src=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		sheet.getRow(1).createCell(2).setCellValue("monica");
		
		sheet.getRow(2).createCell(2).setCellValue("durban");
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
		
	}
	@Test
	public void countEl() throws Exception {
		
		File src=new File("./Config/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		int row=sheet.getLastRowNum();
		
		System.out.println("value-----"+row);
		
		for(int i=0;i<row;i++) {
			
			String data=sheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(data);
		}
		wb.close();
		
	}

}
