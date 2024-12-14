package com.playwrite.restassured;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;
import junit.framework.Assert;
import com.api.data.UserPojoLombok;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
 
public class GetAllUsers {
	
	Playwright playwright;
	APIRequest request;
    APIRequestContext requestContext;
	UserPojoLombok UserPojoLombok;
   
    
	
	@BeforeTest
	public void setup() {
		
		playwright = Playwright.create();
		request = playwright.request();
		requestContext=  request.newContext();
			
	}
	
	 
	
	@Test()
	public void GetResponse() throws IOException {
		
		APIResponse APIresponse = requestContext.get("https://gorest.co.in/public/v2/users",
		RequestOptions.create()
			.setHeader("Content-Type","application/json")
			.setHeader("Authorization","Bearer d790a5be17d32be1b6648aa65df1194defd430746a62253fa9302efff143673d"));
		 
		
		System.out.println(APIresponse.status());
		Assert.assertEquals(APIresponse.status(),200);
		
	 
		ObjectMapper objctMapper = new ObjectMapper();
		JsonNode postJsonNode =	objctMapper.readTree(APIresponse.body());
		System.out.println(postJsonNode.toPrettyString());
		
		System.out.println("user id: "+ postJsonNode.get("id").asText());
	
	}
	
	@AfterTest
	public void tearDown() {
		
		playwright.close();
	}
	
}
