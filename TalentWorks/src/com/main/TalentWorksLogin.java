package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TalentWorksLogin {
	public static void GoogleLogin() {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://dev.talentworks.io/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);

		WebElement element = driver.findElement(By.xpath("html/body/data/div/div/div/div[3]/a[1]"));
		element.click();
		
		//Get handle to the login window
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}

		WebElement userName = driver.findElement(By.xpath(".//*[@id='Email']"));
		userName.sendKeys("suryaprabha.v@gmail.com");
		driver.findElement(By.id("next")).click();
		
		//This is to get handle to the password window
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}

		WebElement passWord = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		passWord.sendKeys("Wlifc11252");

		WebElement signIn = driver.findElement(By.xpath(".//*[@id='signIn']"));
		signIn.click();
		
	}
	
	public static void main(String[] args) {
		TalentWorksLogin.GoogleLogin();
	}

}
