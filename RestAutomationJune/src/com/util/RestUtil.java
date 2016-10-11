package com.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import pojo.GitHubUser;
import pojo.MyPojo;
import pojo.User;

public class RestUtil {

	HttpUriRequest request;
	HttpResponse response;
	private GitHubUser user;
	private User twitterUser;

	public User getTwitterUser() {
		return twitterUser;
	}

	public void setTwitterUser(User twitterUser) {
		this.twitterUser = twitterUser;
	}

	public GitHubUser getUser() {
		return user;
	}

	public void setUser(GitHubUser user) {
		this.user = user;
	}

	String URI = Configuration.URI;

	public void addAuthentication() {
		OAuthConsumer consumer = new CommonsHttpOAuthConsumer(Configuration.consumer_Key,
				Configuration.consumer_Secret);
		consumer.setTokenWithSecret(Configuration.Token, Configuration.Token_Secret);
		try {
			consumer.sign(request);
		} catch (OAuthMessageSignerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OAuthExpectationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OAuthCommunicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getRequest(String resourceUrn, String screenName, int count) {
		try {
			request = new HttpGet(URI + resourceUrn + "screen_name=" + screenName + "&count=" + count);
			request.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");
			addAuthentication();
			this.response = HttpClientBuilder.create().build().execute(request);
			if (response != null) {
			  MyPojo pojo = ResourseUtil.retrieveResourse(response, MyPojo.class);
			  System.out.println(pojo);
				setTwitterUser(pojo.getUser());
			} else {
				System.out.println("something went wrong" + response);
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int validateStatusCode() {
		return response.getStatusLine().getStatusCode();

	}
	public void postRequest(String resourceURN, String json)
	{
	  HttpPost req = new HttpPost(URI+resourceURN);
	  
	  StringEntity entity;
    try {
      User user = new User();
      user.setId("3353657174");
      //ObjectMapper mapper = new ObjectMapper();
      //json = mapper.writeValueAsString(user);
      entity = new StringEntity(json);
      req.setEntity(entity);
      this.response = HttpClientBuilder.create().build().execute(req);
    } catch (UnsupportedEncodingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClientProtocolException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
	  
	}

	public String validateLogin() {
		return getUser().getLogin();
	}
	
	public HttpResponse getReponse() {
	  return response;
	}
}
