package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class TextReader {

	public static String readFile(String value) throws Throwable {
		String path = "./src/main/resources/credentials.properties";
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(value);
	}
	
}
