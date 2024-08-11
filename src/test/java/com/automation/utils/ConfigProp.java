package com.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProp {
	
	static Properties prop;
	
	public static void configData() {
		
		prop=new Properties();
		
		try {
			prop.load(new FileInputStream("src\\test\\resources\\config\\config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static String getData(String key) {
		return prop.getProperty(key);
	}

}
