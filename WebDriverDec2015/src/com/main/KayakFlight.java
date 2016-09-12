package com.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KayakFlight {
	public static void FlightReservation() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.kayak.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		WebElement element = driver.findElement(By.linkText("Flights"));
		element.click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		WebElement from = driver.findElement(By.name("origin"));
		from.clear();
		Actions actions = new Actions(driver);
		Actions actionsFrom = actions.keyDown(from,Keys.SHIFT).sendKeys("BOS");
		actionsFrom.sendKeys(Keys.ENTER).build().perform();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		WebElement to = driver.findElement(By.name("destination"));
		Actions actionsTo = actions.keyDown(to, Keys.SHIFT).sendKeys("SFO");
		actionsTo.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//*[contains(@id,'travelDates-start')]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath(".//*[@id='datepicker']/div[3]/span[2]/span[2]/span[3]/span[4]/span")).click();
		driver.findElement(By.xpath("//*[contains(@id,'travelDates-end')]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath(".//*[@id='datepicker']/div[3]/span[2]/span[2]/span[4]/span[7]/span")).click();
		takeScreenShot(driver, "Dates");

		driver.findElement(By.xpath(".//*[contains(@id, 'travelers')]/span[1]")).click();
		driver.findElement(By.xpath(".//*[contains(@id, 'submit')]")).click();
		takeScreenShot(driver, "searchResults");
	}

	public static void main(String[] args) {
		KayakFlight.FlightReservation();

	}

	public static void takeScreenShot(WebDriver driver, String name) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		if (file.exists())
			;
		{
			System.out.println(file.getAbsolutePath());
			try {
				FileUtils.copyFile(file, new File("C:\\Users\\suryaprabha\\" + name + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
