$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserResgistration_New.feature");
formatter.feature({
  "name": "Create a new user",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create new with different data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "name": "launch \"\u003cBROWSER\u003e\" with \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "click on clickSignInk link",
  "keyword": "Then "
});
formatter.step({
  "name": "enter \"\u003cEMAIL\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click createaccount link",
  "keyword": "Then "
});
formatter.step({
  "name": "click male radiobutton",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cFIRSTNAME\u003e\" \"\u003cLASTNAME\u003e\" \"\u003cPASSWORD\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "select date",
  "keyword": "Then "
});
formatter.step({
  "name": "click newsletter checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "enter \"\u003cADDFNAME\u003e\" \"\u003cADDLNAME\u003e\" \"\u003cCOMPADDRESS\u003e\" \"\u003cCITY\u003e\" \"\u003cZIPCODE\u003e\" \"\u003cMOBILENO\u003e\" \"\u003cALIASEMAIL\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "select state",
  "keyword": "Then "
});
formatter.step({
  "name": "select country",
  "keyword": "Then "
});
formatter.step({
  "name": "click registerbutton",
  "keyword": "Then "
});
formatter.step({
  "name": "check for title message \"My account - My Store\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "BROWSER",
        "URL",
        "EMAIL",
        "FIRSTNAME",
        "LASTNAME",
        "PASSWORD",
        "ADDFNAME",
        "ADDLNAME",
        "COMPADDRESS",
        "CITY",
        "ZIPCODE",
        "MOBILENO",
        "ALIASEMAIL"
      ]
    },
    {
      "cells": [
        "chrome",
        "http://automationpractice.com/index.php",
        "serioneewing@gmail.com",
        "Sagarran",
        "Arnabigo",
        "eyioecdgsdgi@ventsj3",
        "LIZ",
        "CRAZ",
        "200 UST",
        "Edison",
        "90202",
        "6477057989",
        "kingoflords156@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create new with different data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "name": "launch \"chrome\" with \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.launchWith(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on clickSignInk link",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.click_on_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"serioneewing@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.setEmailText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click createaccount link",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.setCreateAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click male radiobutton",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.clickMaleRadiobutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Sagarran\" \"Arnabigo\" \"eyioecdgsdgi@ventsj3\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.enterDetails(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.selectDd_mm_yyyy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click newsletter checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.clickNewsletterCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"LIZ\" \"CRAZ\" \"200 UST\" \"Edison\" \"90202\" \"6477057989\" \"kingoflords156@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.enterCompanyDetails(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select state",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.selectState()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select country",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.selectCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click registerbutton",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.clickRegisterbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check for title message \"My account - My Store\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.TestOutline.checkForMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});