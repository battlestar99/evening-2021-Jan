# dffakdsjfdsa
# 02/15/2021
# author: razin anik
Feature: Signup

  Scenario: validating all the webelements of the signup page
    Given user is on the signup page
    When user can interact with the firstname
     And user can select a month
    And user can interact with last name
    And user can select a day
    And user can select a year
    Then user should be able to sign up for new account
