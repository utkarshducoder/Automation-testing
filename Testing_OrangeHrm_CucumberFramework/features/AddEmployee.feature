Feature: Add Employee

  Scenario: To check the add employee functionality
    Given user open the browser
    And search for "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And enter the username as "Admin" and password as "admin123"
    And click on Login button
    And clicks on PIM 
    Then click on AddEmployee button
    And fill the details 
    And click on Save button
