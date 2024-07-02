#For non parameterize we go like this
#Feature: Test login functionality
#Scenario: Check login is sucsessful with valid credentials
#Given browser is open
#And user is on login page
#When user enters username and password
#And user clicks on login
#Then user is navigated to the home page 

#for parameter we use Scenario outline nstead of Scenario and we use Examples also like this
Feature: Test login functionality by passing parameters

Scenario Outline: Check login credentials by passing parameters
  Given browser is open
  And user is on login page
  When user enters <username> and <password>
  And clicks on submit button
  Then user is navigated to the home page

Examples:
  | username | password    |
  | utkarsh  | 12345       |
  | student  | Password123 |
