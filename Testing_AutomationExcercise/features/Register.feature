Feature: Signup/Register

  Scenario: To check the registeration functionality
    Given user should open the browser
    And search for "https://automationexercise.com/login"
    And user enters the name as "utkarsh" and email address as "utkarsh54@gmail.comm"
    Then click on sign up button
    And user fills the account information
    And click on Create Account button
    And get message as "ACCOUNT CREATED!"
