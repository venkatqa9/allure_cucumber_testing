package com.applicationobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class AutoPracticeOr {
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement signInLink;
    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailText;
    @FindBy(xpath = "//*[@id='SubmitCreate']")
    public WebElement createAccount;



    public AutoPracticeOr(WebDriver driver) {
    }

    public void clickSignInk(WebElement signInLink) {
        signInLink.click();
    }

    public void setEmailText(WebElement emailText) {
        emailText.clear();
        emailText.sendKeys("emailText");
    }

    public void setCreateAccount(WebElement createAccount) {
        createAccount.click();
    }


}
