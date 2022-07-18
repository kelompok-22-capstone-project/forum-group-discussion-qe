@Post-User-ThreadsTC
Feature: As User I want to post a thread

  @postsertrds01
  Scenario: As user I want to success post a thread
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When user send post request threads with all valid data validate ID Post
    Then user see status code 201
    And  user validate massage status

  @postsertrds02
  Scenario: As user I want to post a thread with empty title
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When user send post request threads without title
    Then user see status code 400
    And  user see message Invalid payload

  @postsertrds03
  Scenario: As user I want to post a thread with empty description
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When user send post request threads without description
    Then user see status code 400
    And  user see message Invalid payload

  @postsertrds04
  Scenario: As user I want to post a thread with empty categoryID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When user send post request threads without categoryID
    Then user see status code 400
    And  user see message Invalid payload

  @postsertrds06
  Scenario: As user I want to post a thread without api key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When user send post request threads without api key
    Then user see status code 400
    And  user see massage missing key in request header

  @postsertrds07
  Scenario: As user I want to post a thread without token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    And user succees auth using exist account
    When user send post request threads without token
    Then user see status code 400
    And  user see message status jwt

