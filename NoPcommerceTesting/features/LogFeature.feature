Feature: Login

  Scenario: Sucsessful Login with valid credentials
    Given user launch chrome browser
    And search for "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user is redirected to the dashboard
    When user clicks on Logout link
    Then page title should be "Your store. Login"
    And close the browser

    
    Scenario Outline: Sucsessful Login with valid credentials
    Given user launch chrome browser
    And search for "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email as "<email>" and password as "<password>"
    And click on login
    Then user is redirected to the dashboard
    When user clicks on Logout link
    Then page title should be "Your store. Login"
    And close the browser
    
    Examples:
		| email | password |
		| admin@yourstore.com | admin |
		| utkarsh@gmail.com | gupta | 	
