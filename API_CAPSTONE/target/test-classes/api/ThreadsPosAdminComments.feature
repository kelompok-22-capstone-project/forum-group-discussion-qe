
Feature: As admin I want to POST COMMENT a thread

  @POSTcommintrdsID01
  Scenario: As admin I want to success POST COMMENT a thread by ID
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send POST COMMENT request by id
    Then admin see succees status 201
    And  admin validate massage status

  @POSTcommintrdsID02
  Scenario: As admin I want to POST COMMENT a thread by ID with empty comment
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send POST COMMENT request by id with empty comment
    Then admin see status code 400
    And  admin see message status Invalid payload