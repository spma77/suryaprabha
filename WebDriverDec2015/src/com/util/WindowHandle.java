package com.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandle {
	static void windowSwitchEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.pinterest.com/");
		String win = driver.getWindowHandle();
		driver.switchTo().window(win);
		driver.findElement(By.name("email")).sendKeys("fhjhfiu");
		
		
		
		
	}
	
public static void main(String[] args) {
	WindowHandle.windowSwitchEx();
	
}
}
