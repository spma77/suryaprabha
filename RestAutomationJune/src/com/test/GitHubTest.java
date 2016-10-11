package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.RestUtil;

import pojo.User;


public class GitHubTest extends BaseTest{
	
	RestUtil util;
	
	@BeforeClass
	public void beforeClass()
	{
		util = new RestUtil();
		util.getRequest("statuses/user_timeline.json?","bhartisinha06",2);
	}
	@Test
	public void testHeaders()
	{
		
	}
	@Test
	public void testStatusCode()
	{
		
		assertEquals(HttpStatus.SC_OK,util.validateStatusCode());
		
	}

	public void testLogin()
	{
		
		assertEquals("WhiteboxHub",util.getUser().getLogin());
		
	}
	
	@Test
	public void testId()
	{
	  
	  User user = util.getTwitterUser();
	  System.out.println("User is: " + user);
	
		assertEquals("3353657174",user.getId());
		
	}
}
