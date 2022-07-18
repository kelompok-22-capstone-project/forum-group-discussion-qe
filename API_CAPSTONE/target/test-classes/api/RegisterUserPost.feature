@RegisterTC
Feature: As user i want to register

  @SC1
  Scenario: as a user I want to register valid all data
    Given user set endpoint for register
    When user input valid data in body, set API-Key, and send post request
    Then user see status code 201
    And user see sucsess status

  @SC2
  Scenario: as a user I want to register with already exists data
    Given user set endpoint for register
    When user input already exists data in body, set API-Key, and send post request
    Then user see status code 400
    And user see massage Invalid payload

  @SC3
  Scenario: as a user I want to register valid data with invalid endpoint
    Given user set invalid endpoint
    When user input valid data in body, set API-Key, and send post requesto
    Then user see status code 404
    And user see massage not found

  @SC4
  Scenario: as a user I want to register valid data with invalid method
    Given user set endpoint for register
    When user input valid data in body, set API-Key, and send get request
    Then user see status code 404
    And user see massage not found

  @SC5
  Scenario: as a user I want to register valid data without set value API-Key
    Given user set endpoint for register
    When user input valid data in body and send post request
    Then user see status code 400
    And user see massage missing key in request header

  @SC6
  Scenario: as a user I want to register valid data with one empty data
    Given user set endpoint for register
    When user input username,email, and password data in body, set API-Key, and send post request
    Then user see status code 400
    And user see massage Invalid payload

  @SC7
  Scenario: as a user I want to register valid data with data username and email already exists
    Given user set endpoint for register
    When user input username and email data in body, set API-Key, and send post request
    Then user see status code 400
    And user see massage data already exists

  @SC8
  Scenario: as a user I want to register invalid email (without @)
    Given user set endpoint for register
    When user input valid all data and invalid email without @ in body, set API-Key, and send post request
    Then user see status code 400
    And user see massage Invalid payload

  @SC9
  Scenario: as a user I want to register invalid username with spacebar
    Given user set endpoint for register
    When user input valid all data and invalid username with spacebar in body, set API-Key, and send post request
    Then user see status code 400
    And user see massage Invalid payload

  @SC10
  Scenario: as a user I want to register invalid username with capital letters
    Given user set endpoint for register
    When user input valid all data and invalid username with capital letters in body, set API-Key, and send post request
    Then user see status code 400
    And user see massage Invalid payload