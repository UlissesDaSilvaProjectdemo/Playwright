package com.page.object;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	 private Page page;
	 private String email = "//*[@id=\"input-email\"]";
	 private String password="//*[@id=\"input-password\"]";
	 private String forgotPwdLink = "//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a";
	 private String loginBtn = "//*[@id=\"content\"]/div/div[2]/div/form/input";
	 private String logouBtn="//*[@id=\"content\"]/div/div[2]/div/form/input";
	 
	 //page constructor
	 public LoginPage(Page page){
	   this.page = page;

	}
	 
	 public String getPageTitle() {
		 return getPageTitle();
	 }
	 
	 public boolean isForgotPWDlinkExist() {
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
