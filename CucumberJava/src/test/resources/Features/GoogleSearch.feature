Feature: feature is to google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters text in the searhc box
    And hits enter key
    Then user is navigated to search reults
