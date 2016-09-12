package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateAPI {
	public static void navigateSample() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		WebElement element = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a"));
		element.click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("http://whiteboxqa.com/");
	}
	public static void main(String[]args){
    NavigateAPI.navigateSample();
}
}