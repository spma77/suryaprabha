package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil {

	public static void takeScreenshot(WebDriver driver, String fileName) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
			try {
				FileUtils.copyFile(file, new File(fileName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
