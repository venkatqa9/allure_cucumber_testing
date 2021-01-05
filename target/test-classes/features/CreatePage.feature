Feature: This feature is designed to validate the scenario outline process

  Scenario: Test the scenario with various sets of data

    Given launch "chrome" browser
      | URL                                     |
      | http://automationpractice.com/index.php |
    Then click on clickSignInk link
    Then enter email "abc09861@gmail.com"
    Then click createaccount link
    Then click male radiobutton
    Then enter firstname "vekte"
    Then enter lastname "eem"
    Then enter password "venkts3110!"
    Then select day
    Then select month
    Then select year
    Then click newsletter checkbox
    Then enter address addfname "soor"
    Then enter address addlname "power"
    Then enter company address "16 Brantwood Dr,UST Company"
    Then enter city "Edison"
    Then select state
    Then enter zipcode "90231"
    Then select country
    Then enter mobileno "6477067089"
    Then click registerbutton
    Then check for title message "Welcome to your account"















