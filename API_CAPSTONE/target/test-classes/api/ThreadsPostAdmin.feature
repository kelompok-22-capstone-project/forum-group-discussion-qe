@Post-Admin-ThreadsTC
Feature: As admin I want to post a thread

  @postmintrds01
  Scenario: As admin I want to success post a thread
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send post request threads with all valid data validate ID Post
    Then admin see succees status 201
    And  admin validate massage status

  @postsertrds02
  Scenario: As admin I want to post a thread with empty title
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send post request threads without title
    Then admin see unsuccees status 400
    And  admin see message status Invalid payload

  @postsertrds03
  Scenario: As admin I want to post a thread with empty description
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send post request threads without description
    Then admin see unsuccees status 400
    And  admin see message status Invalid payload

  @postsertrds04
  Scenario: As admin I want to post a thread with empty categoryID
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send post request threads without categoryID
    Then admin see unsuccees status 400
    And  admin see message status Invalid payload

  @postsertrds06
  Scenario: As admin I want to post a thread without api key
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send post request threads without api key
    Then admin see unsuccees status 400
    And  admin see message status missing key

  @postsertrds07
  Scenario: As admin I want to post a thread without token
    Given admin succees auth using admin account
    And admin send post request and validate data ID
    When admin send post request threads without token
    Then admin see unsuccees status 400
    And  admin see message status missing or malformed jwt