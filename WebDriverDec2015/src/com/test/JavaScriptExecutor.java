package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScriptExecutor {
	static void jsExecEX()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//need to create an instance of your javaScript executer
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("alert('hello')");
	}
	public static void main(String[] args) {
		JavaScriptExecutor.jsExecEX();
		
	}

}

