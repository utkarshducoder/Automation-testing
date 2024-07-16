Feature: Login Credentials

  Scenario: Login with valid credentials
    Given user should open the browser
    And search for "https://automationexercise.com/login"
    And user enters email address as "guptautkarsh53@gmail.com" and password as "Dangerutk@rsh24"
    Then clicks on Login button
    And user is redirected to the Home page
    Then user clicks on logout button
