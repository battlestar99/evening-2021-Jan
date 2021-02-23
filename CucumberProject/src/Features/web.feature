Feature: Web accessibility testing

 
 
 @smoke @uat
  Scenario: validating if the web is accessible from mozila
    Given the mozila browser is open
    When user navigate to the application
    Then user should be able to see application home page

  Scenario: validating if the web is acceissble from chrome
    Given the chrome browser is open
    When user navigate to the application
    Then user should be able to see application home page


    