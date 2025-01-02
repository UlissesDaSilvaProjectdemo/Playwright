package com.base.test;

import java.io.FileNotFoundException;
import java.util.Properties;

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
	protected Page page;
	public HomePage homePage;
	Properties prop;
	
	
	
	@BeforeTest
	public void setup() throws FileNotFoundException {
		playwrightFactory = new  PlaywrightFactory();
		prop = playwrightFactory.init_prop();
		page = playwrightFactory.initBrowser(prop);
		homePage  = new HomePage(page);
		 
	}
	
	
	@AfterTest
	public void tearDown() {
		page.context().browser().close();
		
	}

}
