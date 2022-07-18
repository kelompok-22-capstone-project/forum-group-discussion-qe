@PUT-User-ID-ThreadsTC
Feature: As User I want to PUT a thread by ID

  @PUTsertrdsID01
  Scenario: As user I want to success PUT a thread by ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send PUT request by id
    Then user see status code 204

  @PUTsertrdsID02
  Scenario: As user I want to success PUT a thread by ID without tittle
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send PUT request by id without title
    Then user see status code 400

  @PUTsertrdsID03
  Scenario: As user I want to success PUT a thread by ID without description
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send PUT request by id without description
    Then user see status code 400

  @PUTsertrdsID04
  Scenario: As user I want to success PUT a thread by ID without categories ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send PUT request by id without categories ID
    Then user see status code 400

  @PUTsertrdsID05
  Scenario: As user I want to success PUT a thread by ID without Api Key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send PUT request by id without Api Key
    Then user see status code 400

  @PUTsertrdsID06
  Scenario: As user I want to success PUT a thread by ID without token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send PUT request by id without token
    Then user see status code 400