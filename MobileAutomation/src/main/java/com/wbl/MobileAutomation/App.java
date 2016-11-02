package com.wbl.MobileAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class App 
{
	private static AndroidDriver driver;
    public static void main( String[] args )
    { 
    	try {
    	File xoomApp = new File(System.getProperty("user.dir")+"\\resources\\xoom.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"22");
        capabilities.setCapability(MobileCapabilityType.VERSION,"5.1.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus");
        capabilities.setCapability(MobileCapabilityType.APP,xoomApp.getAbsolutePath());
        
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.xoom.android.app");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.xoom.android.app.MainActivity_");
			
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			
			Thread.sleep(10000);
			
			//driver.findElement(By.id("sign_up_button"))     //another way
			driver.findElementById("sign_up_button").click();
			
			//driver.findElementById("edit_text").sendKeys("Prabha");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement>elements = driver.findElementsByXPath("//android.widget.ScrollView[@id= 'sign_up_screen']/android.widget.RelativeLayout");
			
			for(WebElement element:elements){
				element.findElement(By.id("edit_text")).sendKeys("Test");
				Thread.sleep(5000);
			}
			driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
