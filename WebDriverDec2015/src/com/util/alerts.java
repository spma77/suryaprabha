package com.util;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class alerts 
{
	static void alertEx(){
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/suryaprabha/Desktop/try.html");
	driver.findElement(By.id("test")).click();
	Alert alert = driver.switchTo().alert();
	
	
	System.out.println("the text" + alert.getText());
	
	alert.accept();
	//alert.dismiss();
	
	}
	public static void main(String[] args) {
		alerts.alertEx();
	}

}
