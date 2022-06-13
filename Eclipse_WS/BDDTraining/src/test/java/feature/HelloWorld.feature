Feature: Validate Addition of two numbers

Scenario: Addition successful
Given user has two numbers
When user add two numbers
Then sum should be valid
And user validates successful addition 

Scenario: Addition un-successful
Given user has two numbers
When user add two numbers
Then sum should be invalid
And user validates un-successful addition 
