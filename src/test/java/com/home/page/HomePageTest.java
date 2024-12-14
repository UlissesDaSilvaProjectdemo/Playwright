package com.home.page;

import org.testng.annotations.*;
import com.browser.factory.PlaywrightFactory;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.page.object.HomePage;
import junit.framework.Assert;

public class HomePageTest {
		PlaywrightFactory pf;
		Page page;
		HomePage homePage;


		@BeforeClass
		public void setup(){

		pf= new PlaywrightFactory();
		page = pf.initBrowser("chromium");
		homePage = new HomePage(page);
		   }
		
		
		
	 

		@Test
		public void homePageTittleTest(){
		String actualTitle =homePage.getHomepPageTitle();
		Assert.assertEquals(actualTitle, "Google");
		}
		
		
		@Test
		public void homePageURLTest(){
		String actualURL =homePage.getHomePageURL();
		Assert.assertEquals(actualURL,"https://www.google.co.uk/");
		}
		
		
		@DataProvider
		public  Object [] [] getProductData(String productName){
			 return new Object[][] {
				 
				 {"data1"},
				 {"data2"},
			     {"Data2"}
				 
			 };
		
		}
		
		@Test(dataProvider = "getProductData")
		public void searchTest(String productName) {
			String actualProductName = homePage.doSearch(productName);
			Assert.assertEquals(actualProductName, productName);
			
		}
			 
		
		@Test
		public void searchTest(){
		String actualSearchHeader = homePage.doSearch("NoteBook" );
		Assert.assertEquals(actualSearchHeader, "notebook - Google Search");
		}
		
		 

		@AfterClass
		public void TearDown(){
		page.context().browser().close();

		   }

	
}
