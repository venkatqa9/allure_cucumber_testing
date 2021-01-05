Feature: This feature is designed to validate the scenario outline process




  Scenario Outline: Test the scenario with various sets of data
    Given launch "<browser>" with "<URL>"
    Then click on clickSignInk link
    Then enter email "<email>"
    Then click createaccount link

    Examples:
      | browser | URL                                     | email             |
      | chrome  | http://automationpractice.com/index.php | abc789@gmail.com  |
      | ff      | http://automationpractice.com/index.php | abc7891@gmail.com |
      | chrome  | http://automationpractice.com/index.php | abc7893@gmail.com |


















