Feature: Login

  Scenario: To cehck the login functionality
    Given user open the browser
    And search for "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And enter the username as "Admin" and password as "admin123"
    And click on Login button
