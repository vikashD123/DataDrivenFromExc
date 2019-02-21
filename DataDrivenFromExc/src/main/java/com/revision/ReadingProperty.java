package com.revision;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingProperty {

	@Test
	public void test() throws IOException {
		
		File src=new File("./Utility/test.properties");
		
		FileInputStream fis=new FileInputStream(src);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String brow=prop.getProperty("browser");
		
		System.out.println("browser i---------"+brow);
	}
}
