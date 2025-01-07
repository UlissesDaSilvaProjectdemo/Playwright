package com.home.page;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.constants.Appconstants;
import com.base.test.BaseTest;

public class RegisterPageTest extends BaseTest{
	
	//private RegisterPage RegisterPageObj;
	
	@Test
    public void navigateToRegisterPage() {
		
		     registePage = registePage.NavigateToRegister();
		     String ActPageTitle1 = registePage.getRegisterPageTitle();
		     System.out.println(ActPageTitle1);
		     Assert.assertEquals(ActPageTitle1,Appconstants.REGISTER_PAGE_TITLE);
		    	
		    }
	
	@Test
	public void firstName() {
	 
		registePage.firstName("ulisses");
		 
	}
	
	@Test
	 public void lastName(String productName){
		registePage.lastName("DaSilva");
		 

	 }
	
	@Test
	 public void email(String productName){
		registePage.email("Uli@gmaill.com");
		 

	 }
	
	@Test
	 public void telephone(String productName){
		registePage.telephone("02092928383");
		 


	 }
	
	@Test
	 public void password(String productName){
		registePage.firstName("ulisses");
		 


	 }
	
	@Test
	 public void passwordConfirm(String productName){
		registePage.password("PWDtest@app");
		 


	 }
	
	@Test
	 public void subscibeYes(){
		registePage.subscibeYes();
		 


	 }
	
	@Test
	 public void privatePolicy(String productName){
		registePage.firstName("ulisses");
		 
	 }
	
	@Test
	 public void submitFormBtn( ){
			 
		registePage.submitFormBtn();
		 
	 }


}
