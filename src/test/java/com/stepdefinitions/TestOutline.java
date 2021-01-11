package com.stepdefinitions;
import org.testng.asserts.Assertion;
import com.applicationobjects.AutoPracticeOr;
import com.applicationobjects.CreateAccountOr;
import com.frameworkutils.FakerData;
import com.frameworkutils.WebUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class TestOutline extends WebUtilities {

    public AutoPracticeOr autoPracticeOr;
    public CreateAccountOr createAccountOr;
    public FakerData fakerData;

    @Given("launch {string} with {string}")
    public void launchWith(String browser, String url) throws Exception {
        launchBrowser(browser, url);


    }

    @Then("click on clickSignInk link")
    public void click_on_link() throws InterruptedException {
        if (autoPracticeOr == null)
            autoPracticeOr = PageFactory.initElements(WebUtilities.driver, AutoPracticeOr.class);
        autoPracticeOr.signInLink.click();
        Thread.sleep(3000);
    }

    @Then("enter {string}")
    public void setEmailText(String email) throws InterruptedException {
        if (autoPracticeOr == null) autoPracticeOr = PageFactory.initElements(WebUtilities.driver, AutoPracticeOr.class);
        Thread.sleep(3000);
        autoPracticeOr.emailText.sendKeys(email);
        Thread.sleep(2000);
    }



    @Then("click createaccount link")
    public void setCreateAccount() throws InterruptedException {
        if (autoPracticeOr == null) autoPracticeOr = PageFactory.initElements(WebUtilities.driver, AutoPracticeOr.class);
        autoPracticeOr.createAccount.click();
        Thread.sleep(10000);
    }


    @Then("click male radiobutton")
    public void clickMaleRadiobutton() throws InterruptedException {
        if (createAccountOr == null) createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
        createAccountOr.gender.click();
        Thread.sleep(10000);
    }
    @Then("Enter {string} {string} {string}")
    public void enterDetails(String firstName, String lastName, String password) throws InterruptedException {
        if (createAccountOr == null) createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
        createAccountOr.firstName.sendKeys(firstName);
        Thread.sleep(3000);
        createAccountOr.lastName.sendKeys(lastName);
        Thread.sleep(3000);
        createAccountOr.password.sendKeys(password);
        Thread.sleep(3000);
    }

    @Then("select date")
    public void selectDd_mm_yyyy() throws InterruptedException {
        if (createAccountOr == null) createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
        createAccountOr.day.click();
        Thread.sleep(3000);
        createAccountOr.month.click();
        Thread.sleep(3000);
        createAccountOr.year.click();
        Thread.sleep(3000);
    }


    @Then("click newsletter checkbox")
    public void clickNewsletterCheckbox() throws InterruptedException {
        if (createAccountOr == null) createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
        createAccountOr.newsCheck.click();
        Thread.sleep(1000);
    }



    @Then("enter {string} {string} {string} {string} {string} {string} {string}")
    public void enterCompanyDetails(String addFirstName, String addLastName, String address, String city, String postalCode, String mobileNumber, String aliasEmailAddress) throws InterruptedException {
        if (createAccountOr == null) createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
        createAccountOr.addFirstName.clear();
        Thread.sleep(1000);
        createAccountOr.addFirstName.sendKeys(addFirstName);
        Thread.sleep(3000);
        createAccountOr.addLastName.clear();
        Thread.sleep(1000);
        createAccountOr.addLastName.sendKeys(addLastName);
        Thread.sleep(3000);
        createAccountOr.address.sendKeys(address);
        Thread.sleep(3000);
        createAccountOr.city.sendKeys(city);
        Thread.sleep(3000);
        createAccountOr.postalCode.sendKeys(postalCode);
        Thread.sleep(3000);
        createAccountOr.mobileNumber.sendKeys(mobileNumber);
        Thread.sleep(3000);
        createAccountOr.aliasEmailAddress.clear();
        //createAccountOr.aliasEmailAddress.fa
        createAccountOr.aliasEmailAddress.sendKeys(aliasEmailAddress);
        Thread.sleep(3000);
    }


    @Then("select state")
    public void selectState() throws InterruptedException {
        if (createAccountOr == null)
            createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
        createAccountOr.state.click();
        Thread.sleep(1000);
    }



    @Then("select country")
    public void selectCountry() throws InterruptedException {
        if (createAccountOr == null)
            createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
        createAccountOr.country.click();
        Thread.sleep(1000);
    }



    @Then("click registerbutton")
    public void clickRegisterbutton() throws InterruptedException {
        if (createAccountOr == null)
            createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
        createAccountOr.registerButton.click();
        Thread.sleep(10000);
    }

    @Then("check for title message {string}")
    public void checkForMessage(String title) throws InterruptedException {

        Thread.sleep(1000);
        String actual=driver.getTitle();
       // if (driver.getPageSource().contains(title)) {
        Assert.assertEquals(actual,title);
        //Assert.assertEquals(actual,title.contains(actual));
        System.out.println("Test is Pass !!!");
//        Assert.assertNotEquals(driver.getPageSource(),title);
//        System.out.println("Test is Fail !!!");
//            //Assert.
//            //  Assert.assertEquals(title,driver.getPageSource());
//            Thread.sleep(10000);
//            System.out.println("Test is Pass !!!");
//        } else {
//            System.out.println("Test is fail !!!");
//        }
    }


}



