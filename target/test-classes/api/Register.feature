Feature: As user i want to register

  Scenario: as a user I want to register valid all data
    Given user set endpoint for register
    And user set headers value API-Key
    When user input valid all data in body
    Then user see status code 201
    And user see sucsess status