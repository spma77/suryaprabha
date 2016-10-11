package com.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {

  public static String URI;
  public static String Token;
  public static String Token_Secret;
  public static String consumer_Key;
  public static String consumer_Secret;

  public Configuration() {
    loadProperties();
  }

  public void loadProperties() {
    Properties prop = new Properties();
    try {
      FileReader reader = new FileReader(new File(
          String.format("%s/src/com/resources/config.properties", System.getProperty("user.dir"))));
      prop.load(reader);

      URI = prop.getProperty("uri");
      Token = prop.getProperty("token");
      Token_Secret = prop.getProperty("tokenSecret");
      consumer_Key = prop.getProperty("consumerKey");
      consumer_Secret = prop.getProperty("consumerSecret");
    } catch (Exception ex) {

      System.out.println(ex);

    }
  }
}