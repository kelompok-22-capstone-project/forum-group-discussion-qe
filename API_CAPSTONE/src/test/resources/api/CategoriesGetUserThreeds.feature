@Cat-Get-User-ThreadsTC
Feature: As user I want to get data categories

  @Catgetsertre01
  Scenario: As user I want to success get a categori threads
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When input endpoint categori threads
    And user send get request categori threads
    Then user see login status code 200
    And  user validate massage status

  @Catgetsertre02
  Scenario: As user I want to get a categori threads without create categories
    And user succees auth using exist account
    When input endpoint categori threads
    And user send get request categori threads
    Then user see status code 404
    And  user see message Not Found

  @Catgetsertre03
  Scenario: As user I want to get a categori threads without API Key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When input endpoint categori threads
    And user send get request categori threads without API Key
    Then user see login status code 400
    And  user see message status missing key

  @Catgetsertre04
  Scenario: As user I want to get a categori threads without Token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When input endpoint categori threads
    And user send get request categori threads without Token
    Then user see login status code 400
    And  user see message status jwt

  @Catgetsertre05
  Scenario: As user I want to get a categori threads with invalid ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When input endpoint categori threads
    And user send get request categori threads with invalid ID
    Then user see login status code 404
    And  user see message status ID not found
