package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {
	static void CrossBrowserTestingEX() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("suryaprabha.v@gmail.com");

		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("bdhgdg");

		WebElement loginBtn = driver.findElement(By.id("u_0_n"));
		loginBtn.click();
		
		//chrome
		
		//System.setProperty("webDriver chrome.driver", )//path of the chrome driver.exe
		//driver = new ChromeDriver();
	}
	public static void main (String[]args){
		CrossBrowserTesting.CrossBrowserTestingEX();
	}
}