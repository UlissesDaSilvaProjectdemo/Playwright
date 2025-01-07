package com.home.page;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.constants.Appconstants;
import com.base.test.BaseTest;

public class RegisterPageTest extends BaseTest{
	
	 
	
	@Test(priority=1)
    public void navigateToRegisterPage() {
		    
		     registePage = registePage.NavigateToRegister();
		     String ActPageTitle1 = registePage.getRegisterPageTitle();
		     System.out.println(ActPageTitle1);
		     Assert.assertEquals(ActPageTitle1,Appconstants.REGISTER_PAGE_TITLE);
		    	
		    }
	
	@Test(priority=2)
	public void firstName(String productName) {
	 
		registePage.firstName("ulisses").trim();
		 
	}
	
	@Test(priority=3)
	 public void lastName(String productName){
		registePage.lastName("DaSilva").trim();
		 

	 }
	
	@Test(priority=4)
	 public void email(String productName){
		registePage.email("Uli@gmaill.com").trim();
		 

	 }
	
	@Test(priority=5)
	 public void telephone(String productName){
		registePage.telephone("02092928383").trim();
		 


	 }
	
	@Test(priority=6)
	 public void password(String productName){
		registePage.firstName("ulisses").trim();
		 


	 }
	
	@Test(priority=7)
	 public void passwordConfirm(String productName){
		registePage.password("PWDtest@app").trim();
		 


	 }
	
	@Test(priority=8)
	 public void suscibeYes(){
		registePage.subscibeYes();
		 


	 }
	
	@Test(priority=9)
	 public void privatePolicy(String productName){
		registePage.firstName("ulisses").trim();
		 
	 }
	
	@Test(priority=10)
	 public void submitFormBtn( ){
			 
		registePage.submitFormBtn();
		 
	 }


}
