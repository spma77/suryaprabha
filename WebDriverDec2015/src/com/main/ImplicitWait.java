package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void waitsSample() {

		// opening a browser
		WebDriver driver = new FirefoxDriver();

		// get the website whiteboxqa
		driver.get("https://www.facebook.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		// click on login link
		WebElement email = driver.findElement(By.id("email"));

		// enter email/pwd
		email.sendKeys("suryaprabha.v@gmail.com");
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("mano6anu1");

		WebElement loginBtn = driver.findElement(By.id("u_0_n"));
		loginBtn.click();
	}

	public static void main(String[] args) {
		ImplicitWait.waitsSample();
	}
}