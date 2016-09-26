package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageDriver {
	
		WebDriver driver;
		Configuration configuration;
		
		public PageDriver(Configuration config){
			this.configuration = config;
			initializeBrowser();
			
			//this.driver = new FirefoxDriver();
			//driver.get("configuration.URL");
		}
		public void initializeBrowser()
		{
			String browser = configuration.browser;
			
			switch (browser)
			{
			case "firefox":
				startFirefox();
				break;
			case "chrome":
				startChrome();
				break;
			case "ie":
				startIE();
				break;
			default:
					break;
				
			}
			driver.get(configuration.url);
		}
		public void startFirefox()
		{
			this.driver = new FirefoxDriver();
		}
		public void getWindowHandles()
		{
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}
		}
		public void startChrome()
		{
			System.setProperty("webDriver chrome.driver", "./chromedriver.exe");//path of the chrome driver.exe
			this. driver = new ChromeDriver();
			
		}
		public void startIE()
		{
			System.setProperty("webDriver.ie.driver","./IEDriverServer.exe" );//path of the ie driver.exe
			this.driver = new InternetExplorerDriver();
			
		}
//		public void startHTML()
//		{
//			this.driver = new HtmlUnitDriver();
//		}
		public void get(String url)
		{
			driver.get(url);
		}
		public WebElement findElement(By by)
		{
			return driver.findElement(by);
			
		}
		public List<WebElement> findElements(By by)
		{
			return driver.findElements(by);
		}
		public String getCurrentUrl()
		{
			return driver.getCurrentUrl();
		}
		public void maximize()
		{
			driver.manage().window().maximize();
		}
		public void quit()
		{
			driver.quit();
		}
		
		public WebDriver getWebDriver() {
			return driver;
		}
	}


