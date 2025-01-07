package com.page.object;
import org.testng.Assert;

import com.microsoft.playwright.Page;

public class RegisterPage {
	
		 private Page page;
		 private String navigateToregisterBtn="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a";
		 private String registerPageTitle = "//*[@id=\"content\"]/h1";
		 private String firstName = "//*[@id=\"input-firstname\"]";
		 private String lastName=" //*[@id=\"input-firstname\"]";
		 private String email = " //*[@id=\"input-email\"]";
		 private String telephone = "//*[@id=\"input-telephone\"] ";
		 private String password="//*[@id=\"input-password\"] ";
		 private String passwordConfirm="//*[@id=\"input-confirm\"] ";
		 private String subscibeYes = "input:text('yes')";
		 private String privatePolicy = "//*[@id=\"content\"]/form/div/div/a";
		 private String submitFormBtn = "//*[@id=\"content\"]/form/div/div/input[2]";
		private String clickRegisterlink = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a";
		 
		 //page constructor
		 public RegisterPage(Page page){
		   this.page = page;

		}
		 
		public String getRegisterPageTitle() {
			
			String title =  page.title();
			System.out.println("page title:" + title);
			return getRegisterPageTitle();
		 }
		
		 
		 
		 
		//PageActions
		 public  RegisterPage  NavigateToRegister() {
			 page.click(navigateToregisterBtn);
			 page.click(clickRegisterlink);
			 Assert.assertEquals(registerPageTitle, true);
			 return NavigateToRegister();
			  

	}
		 
		 public String firstName(String productName){
				page.fill(firstName,productName);
				return firstName;


		 }
		 
		 public String lastName(String productName){
				page.fill(lastName,productName);
				return lastName;


		 }
		 public String email(String productName){
				page.fill(email,productName);
				return email;


		 }
		 public String telephone(String productName){
				page.fill(telephone,productName);
				return telephone;


		 }
		 public String password(String productName){
				page.fill(password,productName);
				return password;


		 }
		 public String passwordConfirm(String productName){
				page.fill(passwordConfirm,productName);
				return passwordConfirm;


		 }
		 public String subscibeYes(){
				page.click(subscibeYes);
				return subscibeYes;


		 }
		 public String privatePolicy(String productName){
				page.fill(firstName,productName);
				return firstName;


		 }
		 public String submitFormBtn( ){
				page.click(submitFormBtn);
				return submitFormBtn;


		 }

}
	


