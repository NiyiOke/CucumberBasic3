
@test
Feature: LoginFeature
  Update Profile
  As an  account holder
  I want to be able to update email, and phone numbers on my profile
  In order to share my contact information with my colleagues

  Scenario Outline: Login with correct username and password
    Given  I navigate to the login page
    And I enter the "<Username>" and "<Password>"
    And The I should be able to update my "email"
    Then I should then log out of my account

    Examples:
      |Username           |Password   |
      |Neotest2           |password   |




