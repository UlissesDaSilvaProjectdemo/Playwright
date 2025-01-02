package com.browser.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
	Properties prop;
	 
	
	
	public Page initBrowser(Properties prop) {
	String browserName =prop.getProperty("browser").trim();
		
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
		page.navigate(prop.getProperty("url").trim());
		return page;
		
		
	}
	
	
	 public Properties init_prop() throws FileNotFoundException {
		 
			FileInputStream lp = new FileInputStream("./src/test/resources/config/config.properties");
			prop = new Properties();
			try {
				prop.load(lp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return prop;
      }

 
	
	 

}
