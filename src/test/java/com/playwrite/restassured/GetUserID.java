package com.playwrite.restassured;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;

import junit.framework.Assert;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
 



public class GetUserID {
	
	
	Playwright playwright;
	APIRequest request;
    APIRequestContext requestContext;
	
	@BeforeTest
	public void setup() {
		
		playwright = Playwright.create();
		request = playwright.request();
		requestContext=  request.newContext();
			
	}
	
	@Test
	public void getUSerApiTest() {
		
		 APIResponse apiResponse =  requestContext.get("https://gorest.co.in/public/v2/users",
	     RequestOptions.create()
	     		.setQueryParam("id",7577212)
		        .setQueryParam("status", "Inactive"));
		
	}
	
	@Test
	public void getUserApiTest() throws IOException  {
		
      
     APIResponse apiResponse =  requestContext.get("https://gorest.co.in/public/v2/users");
     int statsuCode =apiResponse.status();
     System.out.println(statsuCode);
     
     String statusResText=apiResponse.statusText();
     System.out.println(statusResText);
     
     Assert.assertEquals(statsuCode, 200);
     
     //System.out.println(apiResponse.body().toString());
     
     ObjectMapper objctMapper = new ObjectMapper();
     JsonNode jsonResponse = objctMapper.readTree(apiResponse.body());
     String jsonPrettyresponse =jsonResponse.toPrettyString();
     System.out.println(jsonPrettyresponse);
   
     System.out.println("-------------Print API url ------------");
     System.out.println(apiResponse.url());
     
     
     System.out.println("----------Print API response with plan text-------");
     System.out.println(apiResponse.text());
     
     
     
     System.out.println(" -------------print headers --------------");
     Map <String, String> headersMap = apiResponse.headers();
     System.out.println(headersMap);
     
     Assert.assertEquals(headersMap.get("content-type"),"application/json; charset=utf-8");
     		 
    	
	}
	
	
	@AfterTest
	public void tearDown() {
		
		playwright.close();
	}
	
}
