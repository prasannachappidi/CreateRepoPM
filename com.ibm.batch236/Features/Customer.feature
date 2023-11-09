Feature: Customer

  Scenario: Add new Customer
    Given User Launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then user can view Dashboard
    When user clicks on Customer Menu
    And click on Customers menu item
    And click on Add New button
    Then user can view Add New customer page
    When user enters customer Info
    And Click on Save button
    Then user can view confirmation message "The new customer has been added successfully"
    And close browser