package com.page.object;
import com.microsoft.playwright.Page;

public class HomePage {
	
	 private Page page;
	 private String search = "//*[@id=\"search\"]/input";
	 private String serachIcon="//*[@id=\"search\"]/span/button";
	 private String searchPagehelper="//*[@id=\"content\"]/h1";
	 private String myAccountBtn="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]";
	 private String loginBtn="a:text('Login')";
	 private String registerBtn="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a";
	 
	 
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
	    
	    
	    public LoginPage navigateToLoginPage() {
	    	page.click(myAccountBtn);
	    	page.click(loginBtn);
	    	return new LoginPage(page);
	    	
	    }
	    
	    
	    
	    public RegisterPage navigateToRegisterPage() {
	    	page.click(myAccountBtn);
	    	page.click(registerBtn);
	    	return new RegisterPage(page);
	    	
	    }

	   
}
