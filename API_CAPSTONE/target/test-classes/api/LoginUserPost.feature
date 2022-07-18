@LoginUserTC
Feature: As user i want to login

  @TCLOGUS01
  Scenario: as a user I want to login valid all data
    Given user set endpoint for login
    When user input valid data in body, set API-Key, and send post request login
    Then user see login status code 200
    And user see login sucsess status

  @TCLOGUS02
  Scenario: as a user I want to login with invalid username
    Given user set endpoint for login
    When user input invalid username in body, set API-Key, and send post request login
    Then user see login status code 404
    And user see message username not found

  @TCLOGUS03
  Scenario: as a user I want to login with invalid password
    Given user set endpoint for login
    When user input valid username and invalid pass, set API-Key, and send post request login
    Then user see login status code 401
    And user see message password not match

  @TCLOGUS04
  Scenario: as a user I want to login with unregistered data
    Given user set endpoint for login
    When user input unregisted data in body, set API-Key, and send post request login
    Then user see login status code 404
    And user see message username not found

  @TCLOGUS05
  Scenario: as a user I want to login valid all data without API-Key
    Given user set endpoint for login
    When user input valid data in body and send post request login
    Then user see status code 400
    And user see message status missing key

  @TCLOGUS06
  Scenario: as a user I want to login with empty body
    Given user set endpoint for login
    When user set API-Key and send post request login
    Then user see login status code 400
    And user see message Invalid payload

  @TCLOGUS07
  Scenario: as a user I want to login with incorrect method
    Given user set endpoint for login
    When user input valid data in body, set API-Key, and send put request login
    Then user see login status code 404
    And user see message Not Found

  @TCLOGUS08
  Scenario: as a user I want to login invalid endpoint
    Given user set invalid endpoint for login
    When user input valid data in body, set API-Key, and send post request loginn
    Then user see login status code 404
    And user see message Not Found