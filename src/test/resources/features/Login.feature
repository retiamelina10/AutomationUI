Feature: Login
  As a user
  I want to login
  So I can access all feature

  Scenario: Login with valid username and valid password
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    Then I go to dashboard

  Scenario: Login with invalid username
    Given I am on the login page
    When I input invalid username
    And I click login button
    Then I get error message

  Scenario: Login with invalid password
    Given I am on the login page
    When I input valid username
    And I input invalid password
    And I click login button
    Then I get error message

  Scenario: Login with null username
    Given I am on the login page
    When I input valid password
    And I click login button
    Then I get red field username

  Scenario: Login with null password
    Given I am on the login page
    When I input valid username
    And I click login button
    Then I get red field password

  Scenario: Login with null username and password
    Given I am on the login page
    When I click login button
    Then I get red field username
    And I get red field password
