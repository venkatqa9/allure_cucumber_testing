//package com.stepdefinitions;
//
//import com.applicationobjects.AutoPracticeOr;
//import com.frameworkutils.WebUtilities;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.List;
//
//public class AutomationPracticeHome extends WebUtilities {
//    public AutoPracticeOr autoPracticeOr;
//
//    @Given("launch {string} with {string}")
//    public void launchWith(String arg0, String arg1) throws Exception {
//        launchBrowser(arg0, arg1);
//
//}
//
//    @Then("click on clickSignInk link")
//    public void click_on_link() {
//        if (autoPracticeOr == null)
//            autoPracticeOr = PageFactory.initElements(WebUtilities.driver, AutoPracticeOr.class);
//        autoPracticeOr.signInLink.click();
//    }
//
//
//    @Then("enter email {string}")
//    public void setEmailText(String string) {
//        if (autoPracticeOr==null) autoPracticeOr= PageFactory.initElements(WebUtilities.driver,AutoPracticeOr.class);
//        autoPracticeOr.emailText.sendKeys(string);
//    }
//
//    @Then("click createaccount link")
//    public void setCreateAccount() {
//        if (autoPracticeOr==null) autoPracticeOr= PageFactory.initElements(WebUtilities.driver,AutoPracticeOr.class);
//        autoPracticeOr.createAccount.click();
//
//    }
//
//}