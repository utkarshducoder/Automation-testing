Feature: Cart
Scenario: Add to cart
 Given user open url as "https://www.saucedemo.com/"
    And clicks on username filed and enter username as "standard_user"
    And password as "secret_sauce"
    And clicks on Login button
    Then user is redirected to the Home page and text is "Products"
    Then user clicks on Add to cart where name of product name is Sauce Labs Bolt T-Shirt
    Then click on add to cart where name of product name is Sauce Labs Fleece Jacket

