Feature: Validate Product Page

  Scenario Outline: Validate all products are displayed correctly
    Given login page should be opened
    When  enter "<userName>" and "<password>" in login page
    And   click on login button in login page
    Then  logged in successfully
    And   products size in home page should be equal six
    And   all products images in home page should be displayed correctly
    And   all products names in home page should be displayed correctly
    And   all products description in home page should be displayed correctly
    When  logout from sauce labs website
    Then  logout out successfully
    Examples:
      | userName     | password  |
      | standardUser | validPass |

  Scenario Outline: Validate product details ( name, price and description )
    Given login page should be opened
    When  enter "<userName>" and "<password>" in login page
    And   click on login button in login page
    Then  logged in successfully
    When  click on product with name "<productName>" in home page
    Then  products details with "<productName>" "<productDescription>" "<productPrice>" should be displayed successfully in product page
    When  click on back to products button in product page
    Then  home page should be opened
    When  logout from sauce labs website
    Then  logout out successfully
    Examples:
      | userName     | password  | productName           | productDescription           | productPrice           |
      | standardUser | validPass | bikeLightNameItem0    | bikeLightDescriptionItem0    | bikeLightPriceItem0    |
      | standardUser | validPass | boltShirtNameItem1    | boltShirtDescriptionItem1    | boltShirtPriceItem1    |
      | standardUser | validPass | oneSizeNameItem2      | oneSizeDescriptionItem2      | oneSizePriceItem2      |
      | standardUser | validPass | testNameItem3         | testDescriptionItem3         | testPriceItem3         |
      | standardUser | validPass | backpackNameItem4     | backpackDescriptionItem4     | backpackPriceItem4     |
      | standardUser | validPass | fleeceJacketNameItem5 | fleeceJacketDescriptionItem5 | fleeceJacketPriceItem5 |

  Scenario Outline: Validate sorting functionality by price
    Given login page should be opened
    When  enter "<userName>" and "<password>" in login page
    And   click on login button in login page
    Then  logged in successfully
    And   active sorting should be with "<activeSorting>"
    When  select sort products by price "<newSorting>"
    Then  active sorting should be with "<newSorting>"
    And   products should be sorted with prices "<newSorting>" successfully
    Examples:
      | userName     | password  | activeSorting  | newSorting       |
      | standardUser | validPass | sortAlphabetAZ | sortPriceLowHigh |
      | standardUser | validPass | sortAlphabetAZ | sortPriceHighLow |
