package com.stepdefinitions;

import com.frameworkutils.WebUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomePageDefinitions extends WebUtilities {
    @Given("launch application in {string} browser")
    public void launch_application(String browser,DataTable testdata) throws Exception {
        launchBrowser(browser,testdata.asList().get(1));
    }

}
