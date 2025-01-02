package com.page.object;

import org.testng.annotations.*;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {
	
	 private Page page;
	 private String search = "//*[@id=\"search\"]/input";
	 private String serachIcon="//*[@id=\"search\"]/span/button";
	 private String  searchPagehelper="//*[@id=\"content\"]/h1";
	 
	 

	 //page constructor
	 public HomePage(Page page){
	   this.page = page;

	}
	 
	
	// page action methods
	public String getHomepPageTitle(){
		String title =  page.title();
		System.out.println("page title:" + title);
		return title;
	}
	
	
	 

	    public String getHomePageURL(){
	    	String url =  page.url();
			System.out.println("page title:" + url);
			return url; 

	}

	    public String doSearch(String productName){
		page.fill(search,productName);
		page.click(serachIcon);
		String header = page.textContent(searchPagehelper);
		return header;

	    }

}
