package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.resources.DemoSelector;
import com.util.ScreenShotUtil;

public class DemoSelectorTest extends BaseTest {
	DemoSelector dS = null;

	@BeforeClass
	public void beforeClass() {
		dS = new DemoSelector(driver);
	}
	
	@Test
	public void testDemoClickWithExplicitWait() {
		dS.demoAction();
		driver.getWindowHandles();
		ScreenShotUtil.takeScreenshot(driver.getWebDriver(), "C:\\Users\\suryaprabha\\DemoPage.png");
		assertEquals("http://whiteboxqa.com/demos.php", 
				driver.getWebDriver().getCurrentUrl());
	}
}
