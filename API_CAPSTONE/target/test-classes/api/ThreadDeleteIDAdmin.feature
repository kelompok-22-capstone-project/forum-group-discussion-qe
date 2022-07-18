@DELETE-ID-ThreadsTC
Feature: As admin I want to Delete a thread

  @DELETEmintrdsID01
  Scenario: As admin I want to success delete a thread by id
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send DELETE request by id admin
    Then admin see succees status 204

  @DELETEmintrdsID02
  Scenario: As admin I want to success delete a thread by user id
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When admin send DELETE request by id user
    Then admin see succees status 204

  @DELETEmintrdsID03
  Scenario: As admin I want to success delete a thread by id without Api key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send DELETE request by id admin without Api key
    Then admin see unsuccees status 400

  @DELETEmintrdsID04
  Scenario: As admin I want to success delete a thread by id without token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send DELETE request by id admin without token
    Then admin see unsuccees status 400

  @DELETEmintrdsID05
  Scenario: As admin I want to success delete a thread by id with invalid id treads
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send DELETE request by id admin with invalid id treads
    Then admin see unsuccees status 404