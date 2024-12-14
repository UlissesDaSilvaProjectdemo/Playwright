 package com.playwrite.restassured;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.api.data.UserPojo;
import com.api.data.UserPojoLombok;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;

import junit.framework.Assert;
 
public class GetDataPojoUUser {
	
	Playwright playwright;
	APIRequest request;
    APIRequestContext requestContext;
	UserPojoLombok UserPojoLombok;
	
	UserPojo UserPojo;
 
    
	
	@BeforeTest
	public void setup() {
		
		playwright = Playwright.create();
		request = playwright.request();
		requestContext=  request.newContext();
			
	}
	
	@AfterTest
	public void tearDown() {
		
		playwright.close();
	}
	
	
	
	@Test
	public static String getRandomEmail() {

		String emailId = "ulisses@gmail" + System.currentTimeMillis()+ "@gmail.com"; 
		return emailId;
		
	}
	
	@Test
	public void createUsertest() throws IOException {
		
		 

		APIResponse APIresponse = requestContext.post("https://gorest.co.in/public/v2/users",
		RequestOptions.create()
			.setHeader("Content-Type","application/json")
			.setHeader("Authorization","Bearer d790a5be17d32be1b6648aa65df1194defd430746a62253fa9302efff143673d")
			.setData(UserPojo));
		
		System.out.println(APIresponse.status());
		Assert.assertEquals(APIresponse.status(),201);

		ObjectMapper objctMapper = new ObjectMapper();
		JsonNode postJsonNode =	objctMapper.readTree(APIresponse.body());
		System.out.println(postJsonNode.toPrettyString());
		
		System.out.println("user id: "+ postJsonNode.get("id").asText());
	
	}
	
	 
	
}
