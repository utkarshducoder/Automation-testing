Feature: Login
Scenario: Sucsessful Login of the user
Given when user opens chrome browser
When user opens url as "https://automationexercise.com/"
And clicks on Signup/Login link
And enters email address as "iamcodeboy@gmail.com" 
And password as "Dangerutk@rsh24"
And clicks on Login button
Then user is redirect to the Home page