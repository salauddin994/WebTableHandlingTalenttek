Feature: Login

  @login @regression @smoke
  Scenario: Login with valid email and password
    Given I am at talenttek logIn page
    Then I input valid email address
    Then I input valid password
    And I click on LogIn button
    Then I will verify i loggedIn successfully in my existing account