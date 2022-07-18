@POST-COMMENT-User-ID-ThreadsTC
Feature: As User I want to POST COMMENT a thread

  @POSTcommintrdsID01
  Scenario: As user I want to success POST COMMENT a thread by ID
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send POST COMMENT request by id
    Then user see status code 201
    And  user validate massage status

  @POSTcommintrdsID02
  Scenario: As user I want to POST COMMENT a thread by ID with empty comment
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send POST COMMENT request by id with empty comment
    Then user see status code 400
    And  user see message Invalid payload