package com.home.page;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.constants.Appconstants;
import com.base.test.BaseTest;

 
	
public class LoginPageTest extends BaseTest {
	

	@Test(priority=1)
    public void navigateToLoginPage() {
		
		     loginPage =  homePage.navigateToLoginPage();
		     String ActPageTitle = homePage.getHomepPageTitle();
		     System.out.println(ActPageTitle);
		     Assert.assertEquals(ActPageTitle,Appconstants.LOGIN_PAGE_TITLE);
		    	
		    }
	
	@Test(priority=2)
	public void forgotPWDLinkExist() {
		
		Assert.assertTrue(loginPage.isForgotPWDlinkExist());
	}
	
	
	@Test(priority=3)
	  public void AppLoginTest() {
		Assert.assertTrue(loginPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim()));
	 
	  }
	  
	  
}


 
