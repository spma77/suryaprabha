package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	public static void performLogin() {

		// opening a browser
		WebDriver driver = new FirefoxDriver();

		// get the website whiteboxqa
		driver.get("https://www.facebook.com/");

		// click on login link
		WebElement email = driver.findElement(By.id("email"));

		// enter email/pwd
		email.sendKeys("suryaprabha.v@gmail.com");
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("prabha");
		
		WebElement loginBtn = driver.findElement(By.id("u_0_o"));
		loginBtn.click();
		
		//by using xpath
		driver.findElement(By.xpath(".//*[@id='u_0_1']"));
		
		//by using css selector
		driver.findElement(By.cssSelector("#u_0_1"));
		
		//by using Classname
		driver.findElement(By.className("inputtext" ));
		
		//by using Linktext
		driver.findElement(By.linkText("Forgot account?"));
		
		//by using partialLinkText
		driver.findElement(By.partialLinkText("Forgot"));
		
		//by using tagname
		driver.findElement(By.tagName("href"));
		
		
		

	}
	public static void main(String[] args) {
		LoginPage.performLogin();
	}
}