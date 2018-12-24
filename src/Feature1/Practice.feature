#Author: your.email@your.domain.com
Feature: Practice the add customer

  Scenario Outline: validate the alert
    Given Launch guru
    And Launch add
    When Fill the add "<Back>","<Fname>","<Lname>","<Email>","<Address>"and"<Phone>"
    And submit the application
    Then verfiy the assert message "Please Note Down Your CustomerID"

    Examples: 
      | Back    | Fname    | Lname      | Email         | Address  | Phone      |
      | done    | Avinaash | Partheeban | Avi@gmail.com | Perambur | 9940147346 |
      | pending |     1234 | !@#$       | @gmail.com    | !@!#     | qwer       |
      | done    | vicky    | fun        | QWE@gmail.com | Ashok    | 9940147348 |
