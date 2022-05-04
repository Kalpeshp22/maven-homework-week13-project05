package com.herokuapp.testsuite;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginsuccessfullWithValidCredential() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage ="Secure Area";
        String actualErrorMessage  = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"Error message Displyed");

    }

    @Test
    public void verifyTheUsernameErrorMeassge() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "your username is invalid!" + "x";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message Displyed");
    }

    @Test
    public void verifypasswordErrorMeassge() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "your password is invalid!" + "x";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message Displyed");
    }
}

