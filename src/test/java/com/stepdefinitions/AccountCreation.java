//package com.stepdefinitions;
//
//import com.applicationobjects.AutoPracticeOr;
//import com.applicationobjects.CreateAccountOr;
//import com.frameworkutils.WebUtilities;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//
//public class AccountCreation extends WebUtilities {
//
//    public AutoPracticeOr autoPracticeOr;
//    public CreateAccountOr createAccountOr;
//
//
//    @Given("launch {string} browser")
//    public void launch_browser(String browser, DataTable testdata) throws Exception {
//        launchBrowser(browser,testdata.asList().get(1));
//
//
//    }
//
//
//    @When("opens URL {string}")
//    public void opens_URL(String url) {
//
//        driver.get(url);
//    }
//
//    @Then("click on clickSignInk link")
//    public void click_on_link() {
//        if (autoPracticeOr==null) autoPracticeOr= PageFactory.initElements(WebUtilities.driver,AutoPracticeOr.class);
//        autoPracticeOr.signInLink.click();
//    }
//
//    @Then("enter email {string}")
//    public void setEmailText(String email) {
//        if (autoPracticeOr==null) autoPracticeOr= PageFactory.initElements(WebUtilities.driver,AutoPracticeOr.class);
//        autoPracticeOr.emailText.sendKeys(email);
//    }
//
//
//    @Then("click createaccount link")
//    public void setCreateAccount() throws InterruptedException {
//        if (autoPracticeOr==null) autoPracticeOr= PageFactory.initElements(WebUtilities.driver,AutoPracticeOr.class);
//    autoPracticeOr.createAccount.click();
//        Thread.sleep(10000);
//    }
//
//
//    @Then("click male radiobutton")
//    public void clickMaleRadiobutton() throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.gender.click();
//        Thread.sleep(10000);
//    }
//
//    @Then("enter firstname {string}")
//    public void enterFirstName(String firstname) throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.firstName.sendKeys(firstname);
//        Thread.sleep(1000);
//    }
//
//    @Then("enter lastname {string}")
//    public void enterLastName(String lastname) throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.lastName.sendKeys(lastname);
//        Thread.sleep(1000);;
//    }
//
//    @Then("enter password {string}")
//    public void enterPassword(String password) throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.password.sendKeys(password);
//        Thread.sleep(10000);
//    }
//
//
//    @Then("select day")
//    public void selectDay() {
//        if (createAccountOr == null) createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.day.click();
//    }
//    @Then("select month")
//    public void selectMonth() {
//        if (createAccountOr == null) createAccountOr = PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.month.click();
//    }
//
//    @Then("select year")
//    public void selectYear() {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.year.click();
//    }
//
//
//    @Then("click newsletter checkbox")
//    public void clickNewsletterCheckbox() throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.newsCheck.click();
//        Thread.sleep(1000);
//    }
//
//
//   @Then("enter address addfname {string}")
//    public void enterAddressAddfname(String addfname) throws InterruptedException {
//      if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//       createAccountOr.addFirstName.sendKeys(addfname);
//     Thread.sleep(1000);
//   }
//
//
//    @Then("enter address addlname {string}")
//    public void enterAddressAddlname(String addlname) throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.addLastName.sendKeys(addlname);
//        Thread.sleep(1000);
//    }
//
//    @Then("enter company address {string}")
//    public void enterCompanyAddress(String address) throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.address.sendKeys(address);
//        Thread.sleep(1000);
//    }
//
//    @Then("enter city {string}")
//    public void enterCity(String city) throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.city.sendKeys(city);
//        Thread.sleep(1000);
//    }
//
//    @Then("select state")
//    public void selectState() throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.state.click();
//        Thread.sleep(1000);
//    }
//
//
//    @Then("enter zipcode {string}")
//    public void enterZipcode(String zipcode) throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.postalCode.sendKeys(zipcode);
//        Thread.sleep(1000);
//    }
//
//    @Then("select country")
//    public void selectCountry() throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.country.click();
//        Thread.sleep(1000);
//    }
//
//
//    @Then("enter mobileno {string}")
//    public void enterMobileno(String mobileno) throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.mobileNumber.sendKeys(mobileno);
//        Thread.sleep(10000);
//    }
//
//    @Then("click registerbutton")
//    public void clickRegisterbutton() throws InterruptedException {
//        if (createAccountOr==null) createAccountOr= PageFactory.initElements(WebUtilities.driver, CreateAccountOr.class);
//        createAccountOr.registerButton.click();
//        Thread.sleep(10000);
//    }
//
//    @Then("check for title message {string}")
//    public void checkForMessage(String title) throws InterruptedException {
//        if(driver.getPageSource().contains(title)){
//          //  Assert.assertEquals(title,driver.getPageSource());
//            Thread.sleep(10000);
//            System.out.println("Test is Pass !!!");
//        }
//        else {
//            System.out.println("Test is fail !!!");
//        }
//    }
//
//}
//
