package com.uibot.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LibMethods {
	public static Properties prop = new Properties();
	
	// Write a code base for reading from property
	public static Properties loadProp(){
		try {
			prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
			return prop;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
