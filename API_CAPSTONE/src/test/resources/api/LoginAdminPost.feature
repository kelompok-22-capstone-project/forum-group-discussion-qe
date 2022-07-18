@LoginAdminTC
Feature: As admin i want to login

  @TCLOGMIN01
  Scenario: as admin I want to login valid all data
    Given user set endpoint for login admin
    When user input valid data in body, set API-Key, and send post request login admin
    Then user see login status code 200
    And user see login sucsess status admin status

  @TCLOGMIN02
  Scenario: as admin I want to login with invalid username
    Given user set endpoint for login admin
    When user input invalid username in body, set API-Key, and send post request login admin
    Then user see login status code 404
    And user see message username not found

  @TCLOGMIN03
  Scenario: as admin I want to login with invalid password
    Given user set endpoint for login admin
    When user input valid username and invalid pass, set API-Key, and send post request login admin
    Then user see login status code 401
    And user see message password not match

  @TCLOGMIN04
  Scenario: as admin I want to login with unregistered data
    Given user set endpoint for login admin
    When user input unregisted data in body, set API-Key, and send post request login admin
    Then user see login status code 404
    And user see message username not found

  @TCLOGMIN05
  Scenario: as admin I want to login valid all data without API-Key
    Given user set endpoint for login admin
    When user input valid data in body and send post request login admin
    Then user see status code 400
    And user see message status missing key

  @TCLOGMIN06
  Scenario: as admin I want to login with empty body
    Given user set endpoint for login admin
    When user set API-Key and send post request login admin
    Then user see login status code 400
    And user see message Invalid payload

  @TCLOGMIN07
  Scenario: as admin I want to login with incorrect method
    Given user set endpoint for login admin
    When user input valid data in body, set API-Key, and send put request login admin
    Then user see login status code 404
    And user see message Not Found

  @TCLOGMIN08
  Scenario: as admin I want to login invalid endpoint
    Given user set invalid endpoint for login admin
    When user input valid data in body, set API-Key, and send post request loginn admin
    Then user see login status code 404
    And user see message Not Found