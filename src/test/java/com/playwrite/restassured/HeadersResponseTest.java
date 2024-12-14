package com.playwrite.restassured;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.*;
 
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.HttpHeader;

import junit.framework.Assert;

public class HeadersResponseTest {
	
	 
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
		public void  getHeaderTest() throws IOException  {
		
	   
	    APIResponse apiResponse =  requestContext.get("https://gorest.co.in/public/v2/users");
	    int statsuCode =apiResponse.status();
	    System.out.println(statsuCode);
	    
	    Assert.assertEquals(statsuCode,200);
	    
	    Map<String, String> HeadersMap = apiResponse.headers();

	 // Using a for-each loop to iterate through the map
	 for (Map.Entry<String, String> entry : HeadersMap.entrySet()) {
	     System.out.println(entry.getKey() + ": " + entry.getValue());
	 }
	 
	 System.out.println("---------------LIst loop -------------------");
	 List<HttpHeader >HeaderesList =  apiResponse.headersArray();
	 for(HttpHeader e :HeaderesList) {
		 System.out.println(e.name +","+ e.value);
		 
	 }	 
	 
        System.out.println("Total Response Heaser" +HeadersMap.size() );
	    Assert.assertEquals(HeadersMap.get("content-type"),"application/json; charset=utf-8");
	}
		
		  

			@AfterTest
			public void tearDown() {
				
				playwright.close();
			}

	}


