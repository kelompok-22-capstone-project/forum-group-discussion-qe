@Cat-Get-UserTC
Feature: As user I want to get all data categories

  @Catgetusr01
  Scenario: As user I want to get all categories
    Given user set endpoint for categories
    When user send get request with valid all data
    Then user see succees status 200
    And user validate massage status

  @Catgetusr02
  Scenario: As user I want to get categories
    Given user set endpoint for categories
    When user send get request with valid data without Api Key
    Then user see status code 400
    And user see message status missing key

  @Catgetusr03
  Scenario: As user I want to get categories with invalid endpoint
    Given user set invalid endpoint for categories
    When user send get request with valid all data with invalid endpoint
    Then user see unsuccees status 404
    And user see message status message not found