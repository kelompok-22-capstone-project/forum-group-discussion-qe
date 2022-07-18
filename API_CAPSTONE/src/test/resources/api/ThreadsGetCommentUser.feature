@GET-COMMENT-User-ID-ThreadsTC
Feature: As User I want to GET COMMENT a thread by ID

  @GETcomsertrdsID01
  Scenario: As user I want to success GET COMMENT a thread by ID
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send GET COMMENT request by id
    Then user see succees status 200
    And  user validate massage status

  @GETcomsertrdsID02
  Scenario: As user I want to GET COMMENT a thread by ID without api key
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send GET COMMENT request by id without api key
    Then user see status code 400
    And  user see message status missing key

  @GETcomsertrdsID03
  Scenario: As user I want to GET COMMENT a thread by ID without token
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send GET COMMENT request by id without token
    Then user see status code 400
    And  user see message status jwt

  @GETcomsertrdsID03
  Scenario: As user I want to GET COMMENT a thread by ID with invalid endpoint
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send GET COMMENT request by id with invalid endpoint
    Then user see status code 404
    And  user see massage not found

  @GETcomsertrdsID04
  Scenario: As user I want to success GET COMMENT a thread by ID with negative page and limit
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send GET COMMENT request by id with with negative page and limit
    Then user see succees status 200
    And  user validate massage status

  @GETcomsertrdsID04
  Scenario: As user I want to success GET COMMENT a thread by ID with symbol page and limit
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send GET COMMENT request by id with with symbol page and limit
    Then user see succees status 200
    And  user validate massage status
