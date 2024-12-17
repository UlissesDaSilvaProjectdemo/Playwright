package com.browser.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
  

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	
	
	Playwright playwright;
	Browser browser;
	BrowserContext browsercontext;
	Page page;
	 
	
	
	public Page initBrowser(String browserName) {
		
		System.out.println("browser name is:" + browserName);
		
		playwright = Playwright.create();
		
		switch (browserName) {
		case "chrome":
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
			break;
			
		case "firefox":
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
				break;
		case "safari":
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
				break;
		case "chromium":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
				break;
		 

		default:
			break;
		}
		
		browsercontext = browser.newContext();
		page = browsercontext.newPage();
		page.navigate( "https://www.orangehrm.com/");
		
		
		// Navigate to the specified URL
        if (browserName != null && !browserName.isEmpty()) {
            System.out.println("Navigating to URL: " + browserName);
            page.navigate(browserName);
        } else {
            System.out.println("No URL provided to navigate.");
        }
		return page;
	}
	
	
	 public void init_prop() throws FileNotFoundException {
		 
			FileInputStream lp = new FileInputStream("./src/test/resources/config/config.properties");
			 
			
;	 }
	

}
