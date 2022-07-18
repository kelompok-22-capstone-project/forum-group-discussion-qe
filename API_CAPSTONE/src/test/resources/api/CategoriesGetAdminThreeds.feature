@Cat-Get-Admin-ThreadsTC
Feature: As admin I want to get data categories

  @Catgetmintre01
  Scenario: As admin I want to success get a categori threads
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When input endpoint categori threads
    And admin send get request categori threads
    Then admin see succees status 200
    And  admin validate massage status

  @Catgetmintre02
  Scenario: As admin I want to get a categori threads without API Key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When input endpoint categori threads
    And admin send get request categori threads without API Key
    Then admin see unsuccees status 400
    And  admin see message status missing key

  @Catgetmintre03
  Scenario: As admin I want to get a categori threads without Token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When input endpoint categori threads
    And admin send get request categori threads without Token
    Then admin see unsuccees status 400
    And  admin see message status missing or malformed jwt

  @Catgetmintre04
  Scenario: As admin I want to get a categori threads with invalid ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When input endpoint categori threads
    And admin send get request categori threads with invalid ID
    Then admin see unsuccees status 404
    And  admin see message status ID not found