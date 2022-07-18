@PUT-Admin-ID-ThreadsTC
Feature: As admin I want to PUT a thread

  @PUTmintrdsID01
  Scenario: As admin I want to success PUT a thread
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send PUT request by id
    Then admin see succees status 204

  @PUTsertrdsID02
  Scenario: As admin I want to success PUT a thread by ID without tittle
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send PUT request by id without title
    Then admin see status code 400

  @PUTsertrdsID03
  Scenario: As admin I want to success PUT a thread by ID without description
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send PUT request by id without description
    Then admin see status code 400

  @PUTsertrdsID04
  Scenario: As admin I want to success PUT a thread by ID without categories ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send PUT request by id without categories ID
    Then admin see status code 400

  @PUTsertrdsID05
  Scenario: As admin I want to success PUT a thread by ID without Api Key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send PUT request by id without Api Key
    Then admin see status code 400

  @PUTsertrdsID06
  Scenario: As admin I want to success PUT a thread by ID without token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And admin send post request threads with all valid data validate ID Post
    When admin send PUT request by id without token
    Then admin see status code 400