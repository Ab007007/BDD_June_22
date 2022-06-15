@development
Feature: Validate mouse movement

Background:
  	Given user is on flipkart home page
    When user enter valid username and password
    And click on login button
    Then user should be able to see dashboard page
  

  Scenario: Verify mouse movement on home page
    When user move the mouse on more link
    Then user will print the suggestions
    And close the browser
    
  Scenario: Verify moblie page
    #Given user is on flipkart home page
    #When user enter valid username and password
    #And click on login button
    #Then user should be able to see dashboard page
    When user click on mobile tab
    Then user will be navigated to mobile page
    And user print the mobiles displayed
    And close the browser


 Scenario: Verify Kids page
    #Given user is on flipkart home page
    #When user enter valid username and password
    #And click on login button
    #Then user should be able to see dashboard page
    When user click on Kids tab
    Then user will be navigated to Kids page
    And user print the mobiles displayed
    And close the browser

    
    