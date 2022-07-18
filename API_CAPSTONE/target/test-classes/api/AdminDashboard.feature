@Get-Admin-DashboardTC
Feature: As admin I want to get data admin dashboard

  @Getmindash01
  Scenario: As admin I want to success get admin dashboard
    Given admin succees auth using admin account
    When admin input endpoint admin dashboard
    And admin send get request admin dashboard
    Then admin see succees status 200
    And  admin validate massage Status

  @Getmindash02
  Scenario: As admin I want to get admin dashboard with user token
    Given user succees auth using exist account
    When admin input endpoint admin dashboard
    And user send get request admin dashboard
    Then user see status code 403
    And  user see message Access forbidden role

  @Getmindash03
  Scenario: As admin I want to success get admin dashboard without Api Key
    Given admin succees auth using admin account
    When admin input endpoint admin dashboard
    And admin send get request admin dashboard without Api Key
    Then admin see unsuccees status 400
    And  admin see message status missing key

  @Getmindash04
  Scenario: As admin I want to success get admin dashboard without Token
    Given admin succees auth using admin account
    When admin input endpoint admin dashboard
    And admin send get request admin dashboard without Token
    Then admin see unsuccees status 400
    And  admin see message status missing or malformed jwt

  @Getmindash05
  Scenario: As admin I want to success get admin dashboard with invalid endpoint
    Given admin succees auth using admin account
    When admin send get request admin dashboard with invalid endpoint
    Then admin see unsuccees status 404
    And  admin see message status message not found