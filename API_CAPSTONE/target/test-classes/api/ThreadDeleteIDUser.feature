@DELETE-ID-ThreadsTC
Feature: As User I want to DELETE a thread by ID

  @DELETEsertrdsID01
  Scenario: As user I want to success DELETE a thread by ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send DELETE request by id
    Then user see status code 204

  @DELETEsertrdsID02
  Scenario: As user I want to success DELETE a thread by ID without api key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send DELETE request by id without api key
    Then user see status code 400

  @DELETEsertrdsID03
  Scenario: As user I want to success DELETE a thread by ID without token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send DELETE request by id without token
    Then user see status code 400

  @DELETEsertrdsID04
  Scenario: As user I want to success DELETE a thread by ID with invalid id treads
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send DELETE request by id with invalid id treads
    Then user see status code 404