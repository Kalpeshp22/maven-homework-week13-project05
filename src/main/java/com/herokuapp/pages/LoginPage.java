package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernamefield = By.xpath("//input[@id='username']");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//body/div[2]/div[1]/div[1]/form[1]/button[1]");
    By verifyText = By.xpath("//*[@id='content']/div/h2");
    By invalidVerifyText = By.xpath("//div[@id='flash");

    public void enterUserName(String username) {
        sendTextToElement(usernamefield, username);
    }

    public void enterpassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(verifyText);
    }

    public String getErrorMessageInvalid() {
        return getTextFromElement(invalidVerifyText);
    }
}

