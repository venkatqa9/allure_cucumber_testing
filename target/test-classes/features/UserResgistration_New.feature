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
    Then check for title message "My account - My Store"
    Examples:
      | BROWSER | URL                                     | EMAIL               | FIRSTNAME | LASTNAME | PASSWORD      | ADDFNAME | ADDLNAME | COMPADDRESS | CITY   | ZIPCODE | MOBILENO   | ALIASEMAIL             |
      | chrome  | http://automationpractice.com/index.php |serioneewing@gmail.com | Sagarran     | Arnabigo       | eyioecdgsdgi@ventsj3 | LIZ     | CRAZ    | 200 UST     | Edison | 90202   | 6477057989 | kingoflords156@gmail.com |
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
      | chrome  | http://automationpractice.com/index.php | narkwewfig@gmail.com | Poete     | Oieit        | eeyecdi@vents3 | LIZA11     | CRAZY11    | 200 UST     | Edison | 90202   | 6477057989 | kingoflords2@gmail.com |
      | chrome  | http://automationpractice.com/index.php | jisgsgsgg@gmail.com |  Secc    | Baa        | pyyecdi@vents3 | PIZZA11    | CRAVY11    | 200 UST     | Edison | 90202   | 6477057989 | kingoflondon2@gmail.com |
      | chrome  | http://automationpractice.com/index.php | seerpyrty234@gmail.com | Neee   | Cjfj        | byiiecdi@vents3 | CRAZY11    | ARTIST11   | 200 UST     | Edison | 90202   | 6477057989 | kingsofindia5@gmail.com |


