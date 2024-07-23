Feature: Search Employee

  Scenario: To test the searching of employee
    Given user open the browser
    And search for "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And enter the username as "Admin" and password as "admin123"
    And click on Login button
    And clicks on PIM
    And type employee name as "Utkarsh"
    Then clicks on Search button
		And check whether employee is found or not