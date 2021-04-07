Feature: SignUp
  @signup @smoke @regression @test
  Scenario: SignUp in Talenttek and Sign back in and Verify firstName,lastName and email from WebTable page
    Given I am at talenttek logIn page
    Then I click on Create New account button
    Then I filled out all the required field with valid information
    Then I click on agree terms to terms cookies and data use policy
    Then I click on Create My Account button
    And I verify with Newly Created Student ID
    Then I click on LogIn link
    Then I input my newly created credentials
    When I click on LogIn button
    Then I click on WebTable Option from profile page
    Then I will Verify firstName,lastName and email from WebTable page