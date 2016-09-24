package com.base;

import org.testng.annotations.BeforeClass;

import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;

public abstract class BaseTest {
	
	public static final Configuration _config;
	
	static
	{
		_config = new Configuration();
	}
		
	
	public PageDriver driver;
	
	
	
	@BeforeClass
	public void setup()
	{
		driver = new PageDriver(_config);
		Locators.getElements();
	}
	
}
