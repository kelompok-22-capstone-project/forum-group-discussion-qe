@Cat-Delete-AdminTC
Feature: As admin I want to create categories

  @Catdelmin01
  Scenario: As admin I want to success delet a categori
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send delete request categori
    Then admin see succees status 204

  @Catdelmin02
  Scenario: As admin I want to delet a categori without API Key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send delete request categori without API Key
    Then admin see unsuccees status 400

  @Catdelmin03
  Scenario: As admin I want to delet a categori without Token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send delete request categori without Token
    Then admin see unsuccees status 400

  @Catdelmin04
  Scenario: As admin I want to delet a categori with invalid endpoint
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send delete request categori with invalid endpoint
    Then admin see unsuccees status 404