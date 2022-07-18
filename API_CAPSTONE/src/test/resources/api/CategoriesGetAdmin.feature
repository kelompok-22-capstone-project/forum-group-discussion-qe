@Cat-Get-AdminTC
Feature: As admin I want to get all data categories

  @Catgetmin01
  Scenario: As admin I want to get all categories
    Given admin succees auth using admin account
    And admin set endpoint for categories
    When admin send get request with valid all data
    Then admin see succees status 200
    And admin validate massage status

  @Catgetmin02
  Scenario: As admin I want to get categories
    Given admin succees auth using admin account
    And admin set endpoint for categories
    When admin send get request with valid data without Api Key
    Then admin see status code 400
    And admin see message status missing key

  @Catgetmin03
  Scenario: As admin I want to get categories with invalid endpoint
    Given admin succees auth using admin account
    And admin set invalid endpoint for categories
    When admin send get request with valid all data with invalid endpoint
    Then admin see unsuccees status 404
    And admin see message status message not found