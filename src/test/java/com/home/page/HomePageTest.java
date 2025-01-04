package com.home.page;

import org.testng.annotations.*;
import com.app.constants.Appconstants;
import com.base.test.BaseTest;
import junit.framework.Assert;

public class HomePageTest extends BaseTest {
	 
		@Test
		public void homePageTittleTest(){
		String actualTitle =homePage.getHomepPageTitle();
		Assert.assertEquals(actualTitle, Appconstants.HOME_PAGE_TITLE);
		}
		
		
		@Test
		public void homePageURLTest(){
		String actualURL =homePage.getHomePageURL();
		Assert.assertEquals(actualURL,"https://awesomeqa.com/ui/index.php?route=common/home");
		}
		
		
		 
		@Test
		public void searchTest(){
		String actualSearchHeader = homePage.doSearch("iMack" );
		Assert.assertEquals(actualSearchHeader, "Search - iMack");
		 
		}
		 
		 
		@AfterClass
		public void TearDown(){
		page.context().browser().close();

		   }
}
