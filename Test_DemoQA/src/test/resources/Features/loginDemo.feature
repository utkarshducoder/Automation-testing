Feature: Login

  Scenario: Sucsessful login of the user
    Given user open url as "https://www.saucedemo.com/"
    And clicks on username filed and enter username as "standard_user"
    And password as "secret_sauce"
    And clicks on Login button
    Then user is redirected to the Home page and text is "Products"
