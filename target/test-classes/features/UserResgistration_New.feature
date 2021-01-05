Feature:Create a new user

  @smoketest
  Scenario Outline: Create new with different data
    Given launch "<BROWSER>" with "<URL>"
    Then click on clickSignInk link
    Then enter "<EMAIL>"
    Then click createaccount link
    Then click male radiobutton
    Then Enter "<FIRSTNAME>" "<LASTNAME>" "<PASSWORD>"
    Then select date
    Then click newsletter checkbox
    Then enter "<ADDFNAME>" "<ADDLNAME>" "<COMPADDRESS>" "<CITY>" "<ZIPCODE>" "<MOBILENO>" "<ALIASEMAIL>"
    Then select state
    Then select country
    Then click registerbutton
    Then check for title message "Welcome to your account"
    Examples:
      | BROWSER | URL                                     | EMAIL               | FIRSTNAME | LASTNAME | PASSWORD      | ADDFNAME | ADDLNAME | COMPADDRESS | CITY   | ZIPCODE | MOBILENO   | ALIASEMAIL             |
      | chrome  | http://automationpractice.com/index.php | k12wetetewt@gmail.com | Sagar     | A        | eyecdi@vents3 | LIZA     | CRAZY    | 200 UST     | Edison | 90202   | 6477057989 | kingoflords1@gmail.com |
#     | chrome  | http://automationpractice.com/index.php | sjjdfjgj@gmail.com | Shyam     | B        | pyecdi@vents3 | PIZZA    | CRAVY    | 200 UST     | Edison | 90202   | 6477057989 | kingoflondon@gmail.com |
#     | chrome  | http://automationpractice.com/index.php | jgkdfjgk@gmail.com | Krishna   | C        | byecdi@vents3 | CRAZY    | ARTIST   | 200 UST     | Edison | 90202   | 6477057989 | kingsofindia@gmail.com |
@regression
  Scenario Outline: Create new with different data
    Given launch "<BROWSER>" with "<URL>"
    Then click on clickSignInk link
    Then enter "<EMAIL>"
    Then click createaccount link
    Then click male radiobutton
    Then Enter "<FIRSTNAME>" "<LASTNAME>" "<PASSWORD>"
    Then select date
    Then click newsletter checkbox
    Then enter "<ADDFNAME>" "<ADDLNAME>" "<COMPADDRESS>" "<CITY>" "<ZIPCODE>" "<MOBILENO>" "<ALIASEMAIL>"
    Then select state
    Then select country
    Then click registerbutton
    Then check for title message "Welcome to your account"
    Examples:
      | BROWSER | URL                                     | EMAIL               | FIRSTNAME | LASTNAME | PASSWORD      | ADDFNAME | ADDLNAME | COMPADDRESS | CITY   | ZIPCODE | MOBILENO   | ALIASEMAIL             |
      | chrome  | http://automationpractice.com/index.php | hsdhgsdg@gmail.com | Sagar1     | A        | eyecdi@vents3 | LIZA1     | CRAZY1    | 200 UST     | Edison | 90202   | 6477057989 | kingoflords1@gmail.com |
      | chrome  | http://automationpractice.com/index.php | fhdjffjj@gmail.com | Shyam1    | B        | pyecdi@vents3 | PIZZA1    | CRAVY1    | 200 UST     | Edison | 90202   | 6477057989 | kingoflondon@gmail.com |
      | chrome  | http://automationpractice.com/index.php | tytututi@gmail.com | Krishna1   | C        | byecdi@vents3 | CRAZY1    | ARTIST1   | 200 UST     | Edison | 90202   | 6477057989 | kingsofindia@gmail.com |


