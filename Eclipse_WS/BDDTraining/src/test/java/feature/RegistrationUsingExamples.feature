Feature: Successfull User Registration

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
