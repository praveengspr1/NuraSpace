Feature: Login functionality

  @Smoketesting
  Scenario: User login with valid credentials
    Given User lanuch the login url
    When User enters the valid email address "tester.nura@nuraspace.com" in Email field
    And clicks on Next button
    And User enters the valid password in Password field
    And User clicks on Login button
    Then User should get navigate to Floor plan page

