@GET-Admin-ID-ThreadsTC
Feature: As admin I want to post a thread

  @getmintrdsID01
  Scenario: As admin I want to success post a thread
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send get request by id
    Then admin see succees status 200
    And  admin validate massage status

  @getmintrdsID02
  Scenario: As admin I want to success get a thread by ID without apikey
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send get request by id without apikey
    Then admin see status code 400
    And  admin see message status missing key

  @getmintrdsID03
  Scenario: As admin I want to success get a thread by ID without token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send get request by id without token
    Then admin see status code 400
    And  admin see message status missing or malformed jwt

  @getmintrdsID04
  Scenario: As admin I want to success get a thread by ID with invalid ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send get request by id with invalid ID
    Then admin see unsuccees status 404
    And  admin see message status ID not found