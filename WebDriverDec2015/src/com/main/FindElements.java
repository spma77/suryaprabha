package com.main;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {
	public static void driverAPISample(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
	List<WebElement> elements = driver.findElements(By.xpath("html/body/header/div[1]/div/ul/li/a"));
	
	//for clicking each element
	for(WebElement e : elements){
		e.click();
	}
	
	System.out.println(elements.size());

	}
		public static void main(String[] args) {
			FindElements.driverAPISample();
		}
		
	
	
	
	
	
}

