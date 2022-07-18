@GET-User-ID-ThreadsTC
Feature: As User I want to get a thread by ID

  @getsertrdsID01
  Scenario: As user I want to success get a thread by ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send get request by id
    Then user see succees status 200
    And  user validate massage status

  @getsertrdsID02
  Scenario: As user I want to success get a thread by ID without apikey
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send get request by id without apikey
    Then user see status code 400
    And  user see massage missing key in request header

  @getsertrdsID03
  Scenario: As user I want to success get a thread by ID without token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send get request by id without token
    Then user see status code 400
    And  user see message status jwt

  @getsertrdsID04
  Scenario: As user I want to success get a thread by ID with invalid ID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    And user send post request threads with all valid data validate ID Post
    When user send get request by id with invalid ID
    Then user see status code 404
    And  user see message status ID not found