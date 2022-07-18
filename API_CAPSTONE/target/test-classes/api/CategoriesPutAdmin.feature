@Cat-Put-AdminTC
Feature: As admin I want to create categories

  @Catputmin01
  Scenario: As admin I want to edit categories with valid all data
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send put request with valid all data
    Then admin see succees status 204

  @Catputmin02
  Scenario: As admin I want to edit categories with empty description
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send put request with empty description
    Then admin see unsuccees status 400

  @Catputmin03
  Scenario: As admin I want to edit categories with empty name
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send put request with empty name
    Then admin see unsuccees status 400

  @Catputmin04
  Scenario: As admin I want to edit categories with empty data
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send put request with empty data
    Then admin see unsuccees status 400

  @Catputmin04
  Scenario: As admin I want to edit categories without API-Key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send put request with valid all data without API Key
    Then admin see unsuccees status 400

  @Catputmin05
  Scenario: As admin I want to edit categories without Token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send put request with valid all data without Token
    Then admin see unsuccees status 400