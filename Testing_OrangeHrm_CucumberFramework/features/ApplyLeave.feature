Feature: Apply Leave

  Scenario: To check the functionality to apply leave
    Given user open the browser
    And search for "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And enter the username as "Admin" and password as "admin123"
    And click on Login button
    Then click on leave
    And select Apply
    And select leave type
		Then select from date and to date
		And add comments as "Book an appointment as soon as possible"
		And click on Apply button