@Get-Admin-ThreadsTC
Feature: As admin I want to get data all threads

  @Getmintrds01
  Scenario: As admin I want to success get all threads
    Given admin succees auth using admin account
    When input endpoint threads
    And admin send get request all threads
    Then admin see succees status 200
    And  admin validate massage status

  @Getmintrds02
  Scenario: As admin I want to unsuccess get all threads without Api Key
    Given admin succees auth using admin account
    When input endpoint threads
    And admin send get request all threads without Api Key
    Then admin see unsuccees status 400
    And  admin see message status missing key

  @Getmintrds03
  Scenario: As admin I want to unsuccess get all threads without token
    Given admin succees auth using admin account
    When input endpoint threads
    And admin send get request all threads without token
    Then admin see unsuccees status 400
    And  admin see message status missing or malformed jwt

  @Getmintrds04
  Scenario: As admin I want to unsuccess get all threads with invalid endpoint
    Given admin succees auth using admin account
    And admin send get request all threads with invalid endpoint
    Then admin see unsuccees status 404
    And  admin see message status message not found

  @Getmintrds05
  Scenario: As admin I want to unsuccess get all threads with negative page and limit
    Given admin succees auth using admin account
    When input endpoint threads
    And admin send get request all threads with negative page and limit
    Then admin see succees status 200
    And  admin validate massage status

  @Getmintrds06
  Scenario: As admin I want to unsuccess get all threads with symbol page and limit
    Given admin succees auth using admin account
    When input endpoint threads
    And admin send get request all threads with symbol page and limit
    Then admin see succees status 200
    And  admin validate massage status