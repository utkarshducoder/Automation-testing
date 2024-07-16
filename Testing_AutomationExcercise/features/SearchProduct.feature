Feature: Search Product

  Scenario: To check the search product functionlaity is working fine
    Given user should open the browser
    Then search for url "http://automationexercise.com"
    And click on Products link
    Then user is redirected to the all products page
    And search for product "Regular Fit Straight Jeans"
    Then clicks on search button
    And "SEARCHED PRODUCTS" is visible    
