package com.page.object;

import com.microsoft.playwright.Page;

public class navigateToLoginPage {
	
	 private Page page;
	 private String email = "//*[@id=\"input-email\"]";
	 private String password="//*[@id=\"search\"]/span/button";
	 private String forgotPwdLink = "//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a";
	 private String loginBtn = "//*[@id=\"content\"]/div/div[2]/div/form/input";
	 private String logouBtn="locator";
	 
	 //page constructor
	 public navigateToLoginPage(Page page){
	   this.page = page;

	}
	 
	 public String getPAgeTitle() {
		 return getPAgeTitle();
	 }
	 
	 public boolean forgotPwdlink() {
		 return page.isVisible(forgotPwdLink);
	 }
	 
	 
	 public boolean doLogin(String appUserEmail, String appUserPwd) {
		 page.fill(email,appUserEmail);
		 page.fill(password,appUserPwd);
		 page.click(loginBtn);
		 if(page.isVisible(logouBtn)) {
			 System.out.println("user succefull login ");
			 return true;
		 }else
			 System.out.println("user login has failed");
		 	return false;
	 }
	 
	 

}
