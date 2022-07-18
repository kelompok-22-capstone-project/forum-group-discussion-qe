@Get-User-ThreadsTC
Feature: As User I want to get data threads

  @Getsertrds01
  Scenario: As user I want to success get all threads
    Given user succees auth using exist account
    When input endpoint threads
    And user send get request all threads
    Then user see succees status 200
    And  user validate massage status

  @Getsertrds02
  Scenario: As user I want to unsuccess get all threads without Api Key
    Given user succees auth using exist account
    When input endpoint threads
    And user send get request all threads without Api Key
    Then user see status code 400
    And  user see message status missing key

  @Getsertrds03
  Scenario: As user I want to unsuccess get all threads without token
    Given user succees auth using exist account
    When input endpoint threads
    And user send get request all threads without token
    Then user see status code 400
    And  user see message status jwt

  @Getsertrds04
  Scenario: As user I want to unsuccess get all threads with invalid endpoint
    Given user succees auth using exist account
    And user send get request all threads with invalid endpoint
    Then user see status code 404
    And  user see massage not found

  @Getsertrds05
  Scenario: As user I want to unsuccess get all threads with negative page and limit
    Given user succees auth using exist account
    When input endpoint threads
    And user send get request all threads with negative page and limit
    Then user see succees status 200
    And  user validate massage status

  @Getsertrds06
  Scenario: As user I want to unsuccess get all threads with symbol page and limit
    Given user succees auth using exist account
    When input endpoint threads
    And user send get request all threads with symbol page and limit
    Then user see succees status 200
    And  user validate massage status