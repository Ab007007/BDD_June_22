Feature: Google options

	@google
  Scenario: User validate Images
 		Given user is on google page
    When use enters "synechron" in searcbox
    And click on Search Button
    Then application should display results
    And user will print all results contains "Synechron"
    
    
	@pom
  Scenario: User validate Images
 		Given pomuser is on google page
    When pomuser enters "synechron" in searcbox
    And pomuser click on Search Button
    Then pomuser application should display results
    And pomuser will print all results contains "Synechron"
