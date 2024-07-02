Feature: feature to login page

Scenario: Check login is sucsessful with valid credentials
Given User is on login page
When User enters the credentials 
And clicks on submit button
Then user is navigated to the home page


#If we want to pass any paramter then we use Scenario Outline like given below

#Scenario Outline: Check login is sucsessful with valid credentials
#Given user is on login page
#When user enters <username> and <password>
#Then user is navigated to the home page
#
#Examples:
 #| username | password |
 #| user1 | pass1 |
 #| user2 | pass2 |

 