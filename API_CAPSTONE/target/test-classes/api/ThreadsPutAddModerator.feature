@PUT-add-moderator-user-ThreadsTC
Feature: As user I want to PUT add moderator a thread

  @PUTaddsertrdsID01
  Scenario: As user I want to success PUT add moderator a thread
    Given user succees auth using exist account
    When user send PUT add moderator request a thread
    Then user see status code 204
    And user remove moderator thread