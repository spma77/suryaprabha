package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.RestUtil;

public class TwitterTest {
  RestUtil util;
  
  @BeforeClass
  public void beforeClass()
  {
    util = new RestUtil();
    util.postRequest("/statuses/retweet/:id.json","id:\"3353657174\",name:\"sadadasdad\"");
  }
  
  @Test
  public void testStatusCode()
  {
    
    //assertEquals(HttpStatus.SC_OK,util.validateStatusCode());
    System.out.println(util.getReponse());
    
  }
}
