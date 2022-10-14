Feature: Nopcommerce Login

  Background:
    Given User able to open browser
    And Enter Url

  Scenario: Nopcommerce Valid Registration Test
    Then User click on register Link
    And  User on register page and  verify register page title
    Then Select Gender
    Then Enter First name and Last name
    Then Enter Date of Birth
    Then Email id
    Then Company Name
    And  select mark on Newsletter
    Then Enter Password
    Then Confirm Password
    Then Click on Register button
    Then User able to register successfuly
    Then User close the browser

