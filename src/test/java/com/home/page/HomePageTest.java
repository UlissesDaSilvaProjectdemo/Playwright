package com.home.page;

import org.testng.annotations.*;

import com.app.constants.Appconstants;
import com.base.test.BaseTest;
import junit.framework.Assert;

public class HomePageTest extends BaseTest {
	 
		@Test
		public void homePageTittleTest(){
		String actualTitle =homePage.getHomepPageTitle();
		Assert.assertEquals(actualTitle, Appconstants.LOGIN_PAGE_TITLE);
		}
		
		
		@Test
		public void homePageURLTest(){
		String actualURL =homePage.getHomePageURL();
		Assert.assertEquals(actualURL,"https://awesomeqa.com/ui/index.php?route=common/home");
		}
		
		
		//@DataProvider
		public  Object [] [] getProductData(String productName){
			 return new Object[][] {
				 
				 {"data1"},
				 {"data2"},
			     {"Data2"}
				 
			 };
		
		}
		
		//@Test(dataProvider = "getProductData")
		public void searchTest(String productName) {
			String actualProductName = homePage.doSearch(productName);
			Assert.assertEquals(actualProductName, productName);
			
		}
			 
		
		@Test
		public void searchTest(){
		String actualSearchHeader = homePage.doSearch("Iphone" );
		Assert.assertEquals(actualSearchHeader, "Search - iphone");
		 
		}
		
		 
		
		 

		@AfterClass
		public void TearDown(){
		page.context().browser().close();

		   }

	
}
