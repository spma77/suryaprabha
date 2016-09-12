package com.util;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowSize {
	static void windowEx(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		
		//maximize
		//driver.manage().window().maximize();
		
		//fullscreen
		//driver.manage().window().fullscreen();
		
		//set position
		//Point pt = new Point(300,500);
		//driver.manage().window().setPosition(pt);
		
		//dimension
		Dimension dim = new Dimension(40,40);
		driver.manage().window().setSize(dim);
		
		
		}
		
	public static void main(String[]args){
		
		WindowSize.windowEx();
		
	}
	

}
