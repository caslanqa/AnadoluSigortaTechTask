Feature: Anadolu Sigorta Technical Assessment

  @wip
  Scenario: Add a product to shopping list

    Given user on the home page
    When user click the sign-in button
    Then user verifies the login page title "AUTHENTICATION"
    And user signs in with valid credentials
    Then user verifies the successfully login
    When user clicks the WOMEN tab
    Then user verifies Subcategories has following options
      | TOPS    |
      | DRESSES |
    When user click the 5nth product
    Then user verifies the product detail page opened
    And user sets the product count "3"
    And user adds the product to shopping cart
    When user click the shopping cart button
    Then user verifies the Product added to cart
    And user verifies the following options is true Total, Total Price, Qty
