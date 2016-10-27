package com.util;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Locators {
   public static HashMap <String,String> loc = new HashMap<>();
   
   public static void getElements()
   {
	   Properties p = new Properties();
		try {
			FileReader reader = new FileReader("src//resources//locators.properties");
			p.load(reader);
			Enumeration e = p.propertyNames();
			while(e.hasMoreElements()){
				String key = (String) e.nextElement();
				loc.put(key, p.getProperty(key));
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

}
