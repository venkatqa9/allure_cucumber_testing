package com.applicationpages;

import com.applicationobjects.AutoPracticeOr;
import com.applicationobjects.CreateAccountOr;
import com.frameworkutils.WebUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends WebUtilities {

    CreateAccountOr createAccountOr;

    public CreateAccount(WebDriver driver) {
        createAccountOr = PageFactory.initElements(driver, CreateAccountOr.class);
    }



}