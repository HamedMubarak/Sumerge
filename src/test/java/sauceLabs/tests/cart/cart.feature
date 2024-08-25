Feature: Validate Shopping Cart

  Scenario Outline: Validate shopping cart functionality with adding a product to the shopping cart then removing it
    Given login page should be opened
    When  enter "<userName>" and "<password>" in login page
    And   click on login button in login page
    And   click on product with name "<productName>" in home page
    Then  add to cart button in product page should be displayed
    When  click on add to cart button in product page
    Then  remove button in product page should be displayed
    When  click on cart icon
    Then  cart page should be opened
    And   products with "<productName>" in cart page should be displayed
    When  click on remove button of product with "<productName>" in cart page
    Then  cart should be empty
    When  logout from sauce labs website
    Then  logout out successfully
    Examples:
      | userName     | password  | productName           |
      | standardUser | validPass | bikeLightNameItem0    |
      | standardUser | validPass | boltShirtNameItem1    |
      | standardUser | validPass | oneSizeNameItem2      |
      | standardUser | validPass | testNameItem3         |
      | standardUser | validPass | backpackNameItem4     |
      | standardUser | validPass | fleeceJacketNameItem5 |

  Scenario Outline: Validate shopping cart badge count functionality with adding or removing products
    Given login page should be opened
    When  enter "<userName>" and "<password>" in login page
    And   click on login button in login page
    Then  cart should be empty
    And   cart badge count should be increased for each click on add to cart button of any product in product page
    And   remove button of all added to cart products should be displayed in product page
    And   cart badge count should be decreased for each click on remove button of any product in product page
    And   cart should be empty
    When  logout from sauce labs website
    Then  logout out successfully
    Examples:
      | userName     | password  |
      | standardUser | validPass |