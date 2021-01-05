Feature: This feature is designed to validate the behaviour of regsitartion module
  Scenario: This scenario will test user creation process on the application
    Given launch application in "chrome" browser
    |URL|
    |https://demo.nopcommerce.com/|
    Then verify home page is displayed

    Then click on new user link
    And  verify user is navigated to registration page
    Then fill the registration form
