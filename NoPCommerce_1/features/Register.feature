Feature: User Registration

  Scenario Outline: Successful User Registration
    Given The user is on the registration page
    When The user enters valid data in all mandatory fields
      | field            | value             |
      | first name       | <firstName>       |
      | last name        | <lastName>        |
      | email            | <email>           |
      | password         | <password>        |
      | confirm password | <confirmPassword> |
    And The user selects the "<gender>" gender option
    And The user subscribes to the newsletter
    And The user clicks the "Register" button
    Then The user is successfully registered
    And The user is redirected to their account dashboard

    Examples: 
      | firstName | lastName | email                     | password  | confirmPassword | gender |
      | John      | Doe      | john.doe@example.com      | Test@1234 | Test@1234       | Male   |
      | Jane      | Smith    | jane.smith@example.com    | Password1 | Password1       | Female |
      | Alice     | Johnson  | alice.johnson@example.com | Secret123 | Secret123       | Female |
      | Bob       | Brown    | bob.brown@example.com     | Passw0rd  | Passw0rd        | Male   |
