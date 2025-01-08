package com.page.object;
import org.testng.Assert;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class RegisterPage {
	
		 private Page page;
		 private String myAccountBtn="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]";
		 private String navigateToregisterBtn="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a";
		 private String registerPageTitle = "//*[@id='content']/h1";
		 private String firstName = "//*[@id='input-firstname']";
		 private String lastName="//*[@id='input-lastname']";
		 private String email = "//*[@id='input-email']";
		 private String telephone = "//*[@id='input-telephone'] ";
		 private String password="//*[@id='input-password'] ";
		 private String passwordConfirm="//*[@id='input-confirm'] ";
		 private String subscibeYes = "//*[@id='content']/form/fieldset[3]/div/div/label[1]/input)";
		 private String privatePolicy = "//*[@id=\"content\"]/form/div/div/input[1]";
		 private String submitFormBtn = "//*[@id='content']/form/div/div/input[2]";
		 private String clickPopUpBtn = "//*[@id=\"modal-agree\"]/div/div/div[1]/button";
		 
		 //page constructor
		 public RegisterPage(Page page){
		   this.page = page;
		   

		}
		 
		 
		 
		public RegisterPage getRegisterPageTitle() {
			
			String title =  page.title();
			System.out.println("page title:" + title);
			return getRegisterPageTitle();
		 }
		
		
		 
		 
		//PageActions
		 public  RegisterPage  NavigateToRegister() {
			 page.click(myAccountBtn);
			 page.click(navigateToregisterBtn);
			 return new RegisterPage(page);
			 
				  

	}
		 
		 public String firstName(String productName){
				page.fill(firstName,productName);
				return firstName;


		 }
		 
		 public String lastName(String productName){
			    //page.waitForTimeout(30_000);
				page.fill(lastName,productName);
				return lastName;


		 }
		 public String email(String productName){
			   // page.waitForTimeout(40_000);
				page.fill(email,productName);
				return email;


		 }
		 public String telephone(String productName){
			    //page.waitForTimeout(30_000);
				page.fill(telephone,productName);
				return telephone;


		 }
		 public String password(String productName){
			    //page.waitForTimeout(30_000);
				page.fill(password,productName);
				return password;


		 }
		 public String passwordConfirm(String productName){
			   // page.waitForTimeout(30_000);
				page.fill(passwordConfirm,productName);
				return passwordConfirm;


		 }
		 public String subscribeYes(){
			  
			    //Scroll to the bottom of the page
			    page.evaluate("window.scrollTo(0, document.body.scrollHeight)");
			    //Wait for an element to become visible
			    Locator element = page.locator("//*[@id='content']/form/div/div/a"); // Replace with your element's selector
			    element.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
			    // Perform actions once the element is visible
			    element.click();
				return subscibeYes;


				
		 }
		 
		 public String privatePolicy() {
			 page.click(privatePolicy);
			 return privatePolicy;
			 
		 }
		 
		 public String clickPopBtnn() {
			 page.click(clickPopUpBtn);
			return clickPopUpBtn;
		 }
		 
		 public String submitFormBtn() {
			 
			 page.click(submitFormBtn);
			 return submitFormBtn;
			 
			 
		 }
		 
}
		  
	


