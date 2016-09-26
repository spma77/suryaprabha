package com.pages.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BasePage;
import com.util.PageDriver;

public class ResourceSelector extends BasePage{

	public ResourceSelector(PageDriver driver) {
		super(driver);
	}

	public void presentationAction() {
		WebElement element = driver.findElement(By.cssSelector(".dropdown-toggle"));
		Actions actions = new Actions(driver.getWebDriver());
		actions.moveToElement(element).build().perform();
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[4]/ul/li[2]/a")).click();
	}

}
