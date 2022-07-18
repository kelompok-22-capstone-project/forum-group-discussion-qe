@PUT-like-user-admin-ID-ThreadsTC
Feature: As user and admin I want to PUT like a thread

  @PUTlikesertrdsID01
  Scenario: As user I want to success PUT like a thread by ID
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send PUT like request by id
    Then user see status code 204

  @PUTlikesertrdsID02
  Scenario: As user I want to PUT like a thread by ID without api key
    Given user succees auth using exist account
    And user send get request all threads and validate first ID
    When user send PUT like request by id without api key
    Then user see status code 400
    And  user see message status missing key

  @PUTlikemintrdsID01
  Scenario: As admin I want to success PUT like a thread by ID
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send PUT like request by id
    Then admin see succees status 204

  @PUTlikemintrdsID02
  Scenario: As admin I want to PUT like a thread by ID without token
    Given admin succees auth using admin account
    And admin send get request all threads and validate first ID
    When admin send PUT like request by id without token
    Then admin see status code 400
    And  admin see message status missing or malformed jwt