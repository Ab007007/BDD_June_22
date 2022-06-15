@formy
Feature: Successfull User Registration

	@regression
  Scenario Outline: User Register to Formy Application
    Given User is on Form Page
    When User enter fn <Fistname>
    And user enter ln <LastName>
    And user enter jt <job-title>
    And click on submit
    Then user validate success message

    Examples: 
      | Fistname | LastName | job-title   |
      | aravind  | H        | Trainer     |
      | harish   | KL       | Businessman |
      | Girish   | K        | Teacher     |

	 @uat
   Scenario Outline: Mulitple User Register to Formy Application
   Given User is on Form Page
   When user enter all required fileds and validate success msg
   | aravind  | H        | Trainer     |
   | harish   | KL       | Businessman |
   | Girish   | K        | Teacher     |
   And close the brower  