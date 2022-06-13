Feature: Google Search

  Scenario: User Search for Synechron
    Given user is on google page
    When use enter synechron in searcbox
    And click on Search Button
    Then application should display results
    And user will print all hyperlinks contains Synechron
		