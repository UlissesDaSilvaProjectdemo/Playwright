package com.home.page;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.test.BaseTest;
import com.page.object.RegisterPage;

public class RegisterPageTest extends BaseTest {

    private RegisterPage registerPage;

    // Navigate to the registration page before each test
    @Test(priority=1)
    public void setupRegisterPage() {
        registerPage = homePage.navigateToRegisterPage();
    }

    // Verify the title of the registration page
    @Test(priority=2)
    public void validateRegisterPageTitle() {
        String actualRegistgerPageTitle = registerPage.getRegisterPageTitle();
        System.out.println("Register Page Title: " + actualRegistgerPageTitle);
         
    }

    // DataProvider for parameterised testing
    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        return new Object[][]{
            {"Ulisses", "DaSilva", "Uli@gmail.com", "02092928383", "PWDtest@app"}
        };
    }

    // Fill the registration form
    @Test(dataProvider = "userData", priority = 3)
    public void fillRegistrationForm(String firstName, String lastName, String email, String telephone, String password) {
        registerPage.firstName(firstName);
        registerPage.lastName(lastName);
        registerPage.email(email);
        registerPage.telephone(telephone);
        registerPage.password(password);
        registerPage.passwordConfirm(password); // Confirm password
        registerPage.subscribeYes();
        registerPage.privatePolicy();
        
         
    }
    

    // Submit the form
    @Test(priority = 4, dependsOnMethods = "fillRegistrationForm")
    public void submitRegistrationForm() {
        //registerPage.submitFormBtn();
        // Add validation to verify successful submission, if applicable
    }
    
}

