Feature: Google Search

  Scenario: User Search for Synechron
    Given user is on google page
    When use enter "synechron" in searcbox
    And click on Search Button
    Then application should display results
    And user will print all hyperlinks contains "Synechron"
		
		
	 Scenario: User Search for IBM
    Given user is on google page
    When use enter "IBM" in searcbox
    And click on Search Button
    Then application should display results
    And user will print all hyperlinks contains "IBM"
		
		
	 Scenario: User Search for Wipro
    Given user is on google page
    When use enter "WIPRO" in searcbox
    And click on Search Button
    Then application should display results
    And user will print all hyperlinks contains "WIPRO"
		