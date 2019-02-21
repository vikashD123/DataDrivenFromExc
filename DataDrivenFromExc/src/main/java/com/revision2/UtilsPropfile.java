package com.revision2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilsPropfile {

	public static Object data(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./Utility/test.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		return prop.getProperty(key);
	}
}
