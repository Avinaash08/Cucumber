#Author: your.email@your.domain.com
Feature: Need to validate the add customer

  Scenario: Need to verify the add customer
    Given Need to launch the telecom browser
    And Need to enter the add customer
    When Fill the customer deatils
      | Back | Firtname | Lastname   | Email         | Address    | Phone      |
      | Done | Avinaash | Partheeban | Avi@gmail.com | Perambur   | 9940147346 |
      | Done | damu     | elgo       | ASD@gmail.com | Anna Nagar | 9940147347 |
      | Done | vicky    | fun        | QWE@gmail.com | Ashok      | 9940147348 |
      | Done | Mohan    | gun        | ZXC@gmail.com | Tnagar     | 9940147349 |
    And enter the submit
    Then validate the page
