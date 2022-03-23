Feature: Contact Feature

 Scenario: Contact success with by valid email and username and feedback
    Given user is on homepage
    And verify little star page
    When user navigates to contact page
    And user enters <username> and <email> and <feedback>
    And user click on the <submit> button
    Then success message is displayed
   
 Scenario: Contact failed with blank email field
    Given user is on homepage
    And verify little star page
    When user navigates to contact page
    And user enters <username> and <feedback>
    And user click on the <submit> button
    Then success message is displayed
    
  Scenario: Contact failed with blank feedback field
    Given user is on homepage
    And verify little star page
    When user navigates to contact page
    And user enters <username> and <email>
    And user click on the <submit> button
    Then success message is displayed
   
  Scenario: Contact failed with blank name field
    Given user is on homepage
    And verify little star page
    When user navigates to contact page
    And user enters <email> and <feedback>
    And user click on the <submit> button
    Then success message is displayed

  Scenario: Contact failed with blank email and feedback fields
    Given user is on homepage
    And verify little star page
    When user navigates to contact page
    And user enters <username>
    And user click on the <submit> button
   Then success message is displayed

  Scenario: Contact failed with blank name and feedback fields
    Given user is on homepage
    And verify little star page
    When user navigates to contact page
    And user enters <email>
    And user click on the <submit> button
   Then success message is displayed

  Scenario: Contact failed with blank name and email fields
    Given user is on homepage
    And verify little star page
    When user navigates to contact page
    And user enters <feedback>
    And user click on the <submit> button
    Then success message is displayed


  Scenario: Contact failed with invalid email
    Given user is on homepage
    And verify little star page
    When user navigates to contact page
    And user enters invalid <email>
    And user click on the <submit> button
    Then success message is displayed
