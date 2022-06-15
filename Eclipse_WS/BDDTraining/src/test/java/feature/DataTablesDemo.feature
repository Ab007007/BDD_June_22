@google
Feature: Google options

	@regression
  Scenario: User validate Data as Maps
    Given user is on google page
    When user search different companies and print the details
      | companyName |
      | synechron   |
      | IBM         |
      | wipro       |
      | Infosys     |
    Then close the browser
	@regression
  Scenario: User validate Data as Lists
    Given user is on google page
    When user search different companies given as list and print the details
      | synechron   |
      | IBM         |
      | wipro       |
      | Infosys     |
    Then close the browser

	@regression @uat
   Scenario: User validate Data as Map
    Given user is on google page
    When user search different companies given as Map and print the details
      | companyName | synechron   |
    Then close the browser
    