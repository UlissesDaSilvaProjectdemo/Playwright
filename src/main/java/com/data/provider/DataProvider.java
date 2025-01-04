package com.data.provider;
import org.testng.annotations.*;
import com.app.constants.Appconstants;

public class DataProvider  {
	
	/*
	 * Applying Data provider to search a product in the page
	 *
	 

	 
	@DataProvider
	public Object[][] getProductData(String productName){
		 return new Object[][] {
			 
			 {"iPhone"},
			 {"Samsung"},
		     {"MackBook"}
			 
		 };
	}
	
	@Test(dataProvider = "getProductData")
	public void searchTestData(String productName) {
	 
		String actualProductName = homePage.doSearch(productName);
		Assert.assertEquals(actualProductName, "Search -" + productName);
		
	}
	
	 
		 

	/*
	 * Search one product method
	 *  */
 

}
