package Utility;

import java.io.FileInputStream;
import java.util.Properties;


public class Utilityacc {

	public static Object fecth(String key) throws Exception {
		
		FileInputStream fis=new FileInputStream("./Source/Config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		return prop.getProperty(key);
		
	}
}
