package com.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;

public class ResourseUtil {
	
	public static <X>X retrieveResourse(HttpResponse responce,Class<X> cl)
	{
		String json;
		try {
			json = EntityUtils.toString(responce.getEntity());
			json = json.substring(1);
			json = json.substring(0, json.length()-1);
			System.out.println(json);
			
			System.out.println(cl.getName());
			
			ObjectMapper mapper = new ObjectMapper();
			//String json1 = json.substring(1);
			return mapper.readValue(json, cl);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
