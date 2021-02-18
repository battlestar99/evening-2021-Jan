

Feature: Yahoo signup Test 

@smoke
Scenario: Validating yahoo sign up options 

Given user is on the yahoo sign up page 
When user enters firstname
And user enters last name
And user enters new email address
And user enters new password 
Then user should see the values in the text boxes 
Then user should be able to close the browser
