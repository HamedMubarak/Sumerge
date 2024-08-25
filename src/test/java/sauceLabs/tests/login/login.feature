Feature: Validate Login functionality

  Scenario Outline: Validate login functionality with valid credentials
    Given login page should be opened
    When  enter "<userName>" and "<password>" in login page
    And   click on login button in login page
    Then  logged in successfully
    When  logout from sauce labs website
    Then  logout out successfully
    Examples:
      | userName              | password  |
      | standardUser          | validPass |
      | problemUser           | validPass |
      | errorUser             | validPass |
      | visualUser            | validPass |
      | performanceGlitchUser | validPass |

  Scenario Outline: Validate login functionality with invalid credentials
    Given login page should be opened
    When  enter "<userName>" and "<password>" in login page
    And   click on login button in login page
    Then  invalid login attempts appropriate error messages "<errorMessage>" should be displayed
    When  click on error button
    Then  invalid login attempts error messages should not be displayed
    Examples:
      | userName      | password    | errorMessage                   |
      | lockedOutUser | validPass   | lockedOutUserErrorMessage      |
      | emptyUser     | validPass   | requiredUsernameErrorMessage   |
      | emptyUser     | emptyPass   | requiredUsernameErrorMessage   |
      | standardUser  | emptyPass   | requiredPasswordErrorMessage   |
      | standardUser  | invalidPass | invalidCredentialsErrorMessage |
      | invalidUser   | validPass   | invalidCredentialsErrorMessage |
