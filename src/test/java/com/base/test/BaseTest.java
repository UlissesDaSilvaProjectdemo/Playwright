package com.base.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.browser.factory.PlaywrightFactory;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.page.object.HomePage;

public class BaseTest {
	
	Playwright playwright;
	PlaywrightFactory playwrightFactory;
	Browser browser;
	BrowserContext browsercontext;
	Page page;
	HomePage homePage;
	
	
	@BeforeTest
	public void setup() {
		playwrightFactory = new  PlaywrightFactory();
		page = playwrightFactory.initBrowser("chromium");
		homePage  = new HomePage(page);
		 
	}
	
	
	@AfterTest
	public void tearDown() {
		page.context().browser().close();
		
	}

}
