Feature: User able to login with valid credentials

  Scenario: User Login with valid credentials and verify login success
    Given User able to open browser
    And User able to go to URL
    When User able to click Signin Button
    And User able to Enter UserName and Password
    And User able to Click Login Button
    Then User able to Login successfully and Verify Login Success
