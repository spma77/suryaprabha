package com.test;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.resources.ResourceSelector;
import com.util.ScreenShotUtil;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.BeforeClass;

public class ResourceSelectorTest extends BaseTest {

	ResourceSelector rS = null;

	@BeforeClass
	public void beforeClass() {
		rS = new ResourceSelector(driver);
	}

	@Test
	public void testPresentationSelection() {
		rS.presentationAction();
		driver.getWindowHandles();
		ScreenShotUtil.takeScreenshot(driver.getWebDriver(), "C:\\Users\\suryaprabha\\PresentationsPage.png");
		assertEquals("http://whiteboxqa.com/login.php?returnurl=/presentations.php", 
				driver.getWebDriver().getCurrentUrl());
	}

}
