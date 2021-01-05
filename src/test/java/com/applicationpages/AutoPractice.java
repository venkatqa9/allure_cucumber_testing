package com.applicationpages;

import com.applicationobjects.AutoPracticeOr;
import com.frameworkutils.WebUtilities;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoPractice extends WebUtilities {

    AutoPracticeOr autoPracticeOr;

    public AutoPractice(WebDriver driver) {
        autoPracticeOr = PageFactory.initElements(driver, AutoPracticeOr.class);
    }



}


