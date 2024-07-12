Feature: Customer

  Scenario: To add new customer
    Given user launch chrome browser
    And search for "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view dashboard
    Then click on customer menu
    Then click on customers menu item
    And click on Add new button
    Then user is redirected to the add new customer page
    And user fill all customer details
    Then click on Save button
    And close the browser

  Scenario: To search customer by email
    Given user launch chrome browser
    And search for "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view dashboard
    Then click on customer menu
    Then click on customers menu item
    And enter customer email 
		And click on Search button
		Then user should find thet customer in the list of customer table
		And close the browser