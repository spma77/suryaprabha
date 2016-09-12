package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static void waitsSample() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(
						By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a")));
		element.click();
	}

	public static void main(String[] args) {
		ExplicitWait.waitsSample();
	}

}
