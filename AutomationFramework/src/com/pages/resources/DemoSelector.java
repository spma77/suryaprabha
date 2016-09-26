package com.pages.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BasePage;
import com.util.PageDriver;

public class DemoSelector extends BasePage {

	public DemoSelector(PageDriver driver) {
		super(driver);
	}

	public void demoAction() {
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(
						By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a")));
		element.click();
		
	}
}
