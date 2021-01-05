Feature: This feature is designed to validate the scenario outline process

  Scenario Outline: Test the scenario with various sets of data
    Given launch the <Browser> and use the <URL>
    Then enter the <UserName> and <Password>
    Then navigate to register page
    And Enter <FirstName> <LastName> <Password> <Email>

    Examples:
      | Browser | URL                   | UserName | Password | FirstName | LastName | Password | Email         |
      | CHROME  | https://www.gmail.com | user01   | pass1234 | Raja      | MOP      | Pass123  | abc@gmail.com |
      | ff      | https://www.gmail.com | user01   | pass1234 | Ravi      | MOP      | Pass123  | abc@gmail.com |
      | CHROME  | https://www.gmail.com | user01   | pass1234 | Mohan     | MOP      | Pass123  | abc@gmail.com |

