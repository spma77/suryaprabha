package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {
	
	
	public String url;
	public String browser;
	
	public Configuration()
	{
		readProps();
	}
	
	public void readProps()
	{
		Properties p = new Properties();
		try {
			FileReader reader = new FileReader("src//resources//config.properties");
			
			p.load(reader);
			
			url = p.getProperty("url");
			browser = p.getProperty("browser");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
