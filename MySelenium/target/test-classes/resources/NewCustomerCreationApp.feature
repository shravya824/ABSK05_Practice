@sanity

Feature: To Create a new Customer with all details

  Background: 
    Given User opens the url of the application
    And User will enter the username with "mngr583606"
    And User will enter thepassword with "aragyvu"
    When User clicks on Login button
    Then User will be able to login to the application

  Scenario Outline: Creation of New Customer with all the credentials
    And User will click on the  add new customer link in the app
    And User will enter the customer name in app as "<Customer_Name>"
    And User will enter the gender in app
    And User will enter the DOB in app as "<DOB>"
    And User enter the address in app as "<Address>"

    Examples: 
      | Customer_Name | DOB        | Address   |
      | Vishu         | 29-01-2022 | Hyderabad |
 