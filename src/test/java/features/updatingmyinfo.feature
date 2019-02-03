

Feature: Updating my user profile
  I should be able to log into my account and update my user information,
  about section, Showdead, noprocrast, maxvisit ,minaway and delay section.
  (Spelling Error on update section page)

  Scenario: update my user profile
    Given  I navigate to the login page
    And I enter the "<Username>" and "<Password>"
    Then should be able to update the about section
    And select from the drop list of showdead and noprocrast list
    And able to select my maxvisit
    And change my minaway
    Then select my delay
    And The I should be able to update my "email"
    Then I should then log out of my account




