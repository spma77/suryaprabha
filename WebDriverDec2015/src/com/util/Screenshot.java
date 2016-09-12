package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshot {
	static void ScreenshotEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.whiteboxqa.com/");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		if(file.exists());
		{
			System.out.println(file.getAbsolutePath());
			try {
				FileUtils.copyFile(file, new File("C:\\Users\\suryaprabha\\Screen1.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
		
	}
public static void main(String[] args) {
	Screenshot.ScreenshotEx();
}
}
