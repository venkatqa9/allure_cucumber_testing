package com.applicationobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class CreateAccountOr {

        @FindBy(xpath = "//*[@id='id_gender1']")
        public WebElement gender;
        @FindBy(xpath = "//*[@id='customer_firstname']")
        public WebElement firstName;
        @FindBy(xpath = "//*[@id='customer_lastname']")
        public WebElement lastName;
        @FindBy(xpath = "//*[@id='passwd']")
        public WebElement password;
        @FindBy(xpath = "//*[@id='days']/option[12]")
        public WebElement day;
        @FindBy(xpath = "(//*[@id='months'])/option[2]")
        public WebElement month;
        @FindBy(xpath = "(//*[@id='years'])/option[20]")
        public WebElement year;
        @FindBy(xpath = "//div[@class='checkbox']/div[@id='uniform-newsletter']")
        public WebElement newsCheck;
        @FindBy(xpath = "//*[@id='firstname']")
        public WebElement addFirstName;
        @FindBy(xpath = "//*[@id='lastname']")
        public WebElement addLastName;
        @FindBy(xpath = "//*[@id='address1']")
        public WebElement address;
        @FindBy(xpath = "//*[@id='city']")
        public WebElement city;
        @FindBy(xpath = "//*[@id='id_state']/option[6]")
        public WebElement state;
        @FindBy(xpath = " //*[@id='postcode']")
        public WebElement postalCode;
        @FindBy(xpath = " //*[@id='id_country']/option[2]")
        public WebElement country;
        @FindBy(xpath = "//input[@id='phone_mobile']")
        public WebElement mobileNumber;
        @FindBy(xpath = "//input[@id='alias']")
        public WebElement aliasEmailAddress;
        @FindBy(xpath = "//span[text()='Register']")
        public WebElement registerButton;


    public CreateAccountOr(WebDriver driver) {
    }


        public void setGender(WebElement gender) {
        gender.click();
    }

        public void firstName(WebElement firstName) {
        firstName.clear();
        firstName.sendKeys("firstName");
    }

        public void lastName(WebElement lastName) {
        lastName.clear();
        lastName.sendKeys("lastName");
    }


        public void setPassword(WebElement password) {
        password.clear();
        password.sendKeys("password");
    }

        public void setDay(WebElement day) {
        
        day.click();
            }

        public void setMonth(WebElement month) {
        month.click();
    }

        public void setYear(WebElement year) {
        year.click();
    }

        public void setNewsCheck(WebElement newsCheck) {
        newsCheck.click();
    }

        public void addFirstName(WebElement addFirstName) {
        addFirstName.clear();
        addFirstName.sendKeys("addFirstName");
    }

        public void addLastName(WebElement addLastName) {
        addLastName.clear();
        addLastName.sendKeys("addLastName");
    }

        public void setAddAddress(WebElement address) {
        address.clear();
        address.sendKeys("address");
    }

        public void setCity(WebElement city) {
        city.clear();
        city.sendKeys("city");
    }

        public void setState(WebElement state) {
        state.clear();
        state.sendKeys("state");
    }

        public void setPostalCode(WebElement postalCode) {
        postalCode.clear();
        postalCode.sendKeys("postalCode");
    }

        public void setCountry(WebElement country) {
        country.click();
    }

        public void setMobileNumber(WebElement mobileNumber) {
        mobileNumber.clear();
        mobileNumber.sendKeys("mobileNumber");
    }

        public void aliasEmailAddress(WebElement aliasEmailAddress) {
        aliasEmailAddress.clear();
        aliasEmailAddress.sendKeys("aliasEmailAddress");
    }

        public void setRegisterButton(WebElement registerButton) {
        registerButton.click();
    }



    }

