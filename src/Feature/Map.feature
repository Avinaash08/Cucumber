#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Need to add customer details by automation

  @tag1
  Scenario: Need to validate the given details
    Given First enter into telecom site
    And Click the add customer link
    When Fill the details
      | Firstname | Avinaash      |
      | Lastname  | Partheeban    |
      | Email     | avi@gmail.com |
      | Address   | Perambur      |
      | Phoneno   |    9940147346 |
    And click submit
    Then validate the out put result.
