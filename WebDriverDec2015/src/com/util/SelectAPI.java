package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAPI {
	static void selectEx() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement dd = driver.findElement(By.id("month"));
		Select select = new Select(dd);
		select.selectByIndex(3);

		// select.
		System.out.println(select.toString());

	}

	public static void main(String[] args) {
		SelectAPI.selectEx();
	}
}
