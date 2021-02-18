Feature: Yahoo signup Test Version 2

  Scenario Outline: Validating yahoo sign up options with test data
    Given user is on the yahoo sign up page
    When user enters firstname "<firstname>" in the textbox
    And user enters lastname "<lastName>" in the textbox
    And user enters new email "<emailaddress>" in the textbox
    And user enters new password "<password>" in the textbox
    Then user should see the values in the text boxes
    Then user should be able to close the browser

    Examples: 
      | firstname | lastName | emailaddress    | password   |
      | robert    | dunder   | robert@test.com | dsfjhdfl++ |
      | Micahel   | scott    | scott@test.com  | dsfjhdfa   |
      | Jim       | halpert  | jim@test.com    | dsfjhdfl++ |
      | Razin     | Anik     | razin@test.com  | dsfjhdfl++ |
