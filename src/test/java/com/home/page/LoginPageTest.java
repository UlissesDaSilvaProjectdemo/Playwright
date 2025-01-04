package com.home.page;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.constants.Appconstants;
import com.base.test.BaseTest;

 
	
public class LoginPageTest extends BaseTest {
	

	@Test
    public void navigateToLoginPage() {
		
		     loginPage =  homePage.navigateToLoginPage();
		     String ActPageTitle = homePage.getHomepPageTitle();
		     System.out.println(ActPageTitle);
		     Assert.assertEquals(ActPageTitle,Appconstants.LOGIN_PAGE_TITLE);
		    	
		    }

	}


 
