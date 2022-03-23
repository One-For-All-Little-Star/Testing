Feature: Contact With Message Feature

  Scenario: Contact success with your account
    Given user is on homepage
    And verify little star page
    When user clicks message icon
    And user clicks on the continue as your account button
    And user enters <content> at Ask a question
    And user clicks arrow icon
    And user clicks close icon
    Then success message is displayed

     
     Scenario: Contact failed with empty content
     Given user is on homepage
     And verify little star page
     When user clicks message icon
     And user clicks on the continue as your account button
     And user clicks arrow icon
     And user clicks close icon
     Then success message is displayed
     
     Scenario: Contact success with guest account by content
     Given user is on homepage
     And verify little star page
     When user clicks message icon
     And user clicks on the continue as guest account button
     And user enters <content> at Ask a question
     And user clicks arrow icon
     And user clicks close icon
     Then success message is displayed

     
    Scenario: Contact failed with empty content by guest account
     Given user is on homepage
     And verify little star page
     When user clicks message icon
     And user clicks on the continue as guest account button
     And user clicks arrow icon
     And user clicks close icon
     Then success message is displayed
   
