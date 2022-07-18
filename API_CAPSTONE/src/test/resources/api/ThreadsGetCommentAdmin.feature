@GET-COMMENT-Admin-ID-ThreadsTC
Feature: As admin I want to GET COMMENT a thread

  @GETcommintrdsID06
  Scenario: As admin I want to success GET COMMENT a thread by ID
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send GET COMMENT request by id
    Then admin see succees status 200
    And  admin validate massage status

  @GETcommintrdsID01
  Scenario: As admin I want to GET COMMENT a thread by ID without Api
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send GET COMMENT request by id without Api
    Then admin see unsuccees status 400
    And  admin see message status missing key

  @GETcommintrdsID02
  Scenario: As admin I want to GET COMMENT a thread by ID without token
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send GET COMMENT request by id without token
    Then admin see unsuccees status 400
    And  admin see message status missing or malformed jwt

  @GETcommintrdsID03
  Scenario: As admin I want to GET COMMENT a thread by ID with invalid endpoint
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send GET COMMENT request by id with invalid endpoint
    Then admin see unsuccees status 404
    And  admin see message status message not found

  @GETcommintrdsID04
  Scenario: As admin I want to GET COMMENT a thread by ID with negative page and limit
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send GET COMMENT request by id with negative page and limit
    Then admin see succees status 200
    And  admin validate massage status

  @GETcommintrdsID05
  Scenario: As admin I want to GET COMMENT a thread by ID with symbol page and limit
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send GET COMMENT request by id with symbol page and limit
    Then admin see succees status 200
    And  admin validate massage status
