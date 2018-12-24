#Author: your.email@your.domain.com
Feature: Add traff plan

  Scenario Outline: Need to launch continues iteration
    Given Launh the url
    And launch the add traiff
    When Fill the field "<Monthly Rental>","<Free Local>","<Free Int>","<Free SMS>","<Local Per>","<Int Per>"and"<SMS Per>"
    And submit the form
    Then verify with assert "Congratulation you add Tariff Plan"

    Examples: 
      | Monthly Rental | Free Local | Free Int | Free SMS | Local Per | Int Per | SMS Per |
      |            500 |        600 |      700 |      800 |       900 |    1000 |    1100 |
      |            100 |        200 |      300 |      400 |       500 |     600 |     700 |
      |            200 |        300 |      400 |      500 |       900 |    1000 |    1100 |
      |              1 |          2 |        3 |        4 |         5 |       6 |       7 |
