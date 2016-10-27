package com.pages;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class LoginPage extends BasePage {
	public LoginPage(PageDriver driver) {
		super(driver);
	}

	public String invalidLogin(String Uname, String pwd) {
		String error = null;
		driver.maximize();
		driver.findElement(By.cssSelector(Locators.loc.get("login-username"))).sendKeys(Uname);
		driver.findElement(By.cssSelector(Locators.loc.get("login-password"))).sendKeys(pwd);
		driver.findElement(By.cssSelector(Locators.loc.get("login-submit"))).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		error = driver.findElement(By.cssSelector(Locators.loc.get("login-error"))).getText();
		return error;
	}

	public boolean performLogin(String uname, String pwd) {
		driver.findElement(By.cssSelector(Locators.loc.get("login-username"))).sendKeys(uname);
		driver.findElement(By.cssSelector(Locators.loc.get("login-password"))).sendKeys(pwd);
		driver.findElement(By.cssSelector(Locators.loc.get("login-submit"))).click();
		return true;
	}

}
