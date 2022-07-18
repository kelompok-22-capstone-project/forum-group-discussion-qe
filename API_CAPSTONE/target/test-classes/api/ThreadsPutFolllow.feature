@PUT-follow-user-ID-ThreadsTC
Feature: As user I want to PUT follow a thread

  @PUTfolsertrdsID01
  Scenario: As user I want to success PUT follow a thread by ID
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send PUT follow request by id
    Then user see status code 204

  @PUTfolsertrdsID02
  Scenario: As user I want to PUT follow a thread by ID without api key
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send PUT follow request by id without api key
    Then user see status code 400
    And  user see message status missing key

  @PUTfolmintrdsID01
  Scenario: As admin I want to success PUT follow a thread by ID
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send PUT follow request by id
    Then admin see succees status 204

  @PUTfolmintrdsID02
  Scenario: As admin I want to PUT follow a thread by ID without token
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send PUT follow request by id without token
    Then admin see status code 400
    And  admin see message status missing or malformed jwt
