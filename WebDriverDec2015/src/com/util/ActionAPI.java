package com.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//Hover on an element you can see drop down options

public class ActionAPI {
	static void actionEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		WebElement element = driver.findElement(By.cssSelector(".dropdown-toggle"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		
		
	}
	public static void main(String[] args) {
		ActionAPI.actionEx();
		
	}

}
