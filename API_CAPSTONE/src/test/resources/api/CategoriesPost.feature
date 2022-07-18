@Cat-Post-AdminTC
Feature: As admin I want to create categories

  @Catpostmin01
  Scenario: As admin I want to create categories with valid all data
    Given admin succees auth using admin account
    And admin set endpoint for create categories
    When admin send post request with valid all data
    Then admin see succees status 201
    And admin validate massage status

  @Catpostmin02
  Scenario: As admin I want to create categories if unsuccees auth using admin account
    Given admin unsuccees auth using admin account
    And admin set endpoint for create categories
    When admin send post request with valid all data
    Then admin see unsuccees status 401
    And admin see massage status invalid or expired jwt

  @Catpostmin03
  Scenario: As admin I want to create categories with invalid endpoint
    Given admin succees auth using admin account
    And admin set invalid endpoint for create categories
    When admin send post request with valid all data with invalid endpoint
    Then admin see unsuccees status 404
    And admin see message status message not found

  @Catpostmin04
  Scenario: As admin I want to create categories with empty all body
    Given admin succees auth using admin account
    And admin set endpoint for create categories
    When admin send post request with empty all body
    Then admin see unsuccees status 400
    And admin see message status Invalid payload

  @Catpostmin05
  Scenario: As admin I want to create categories with empty name body
    Given admin succees auth using admin account
    And admin set endpoint for create categories
    When admin send post request with empty name body
    Then admin see unsuccees status 400
    And admin see message status Invalid payload

  @Catpostmin06
  Scenario: As admin I want to create categories with empty description body
    Given admin succees auth using admin account
    And admin set endpoint for create categories
    When admin send post request with empty description body
    Then admin see unsuccees status 400
    And admin see message status Invalid payload