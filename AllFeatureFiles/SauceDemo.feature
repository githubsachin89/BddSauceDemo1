Feature: Test SauceDemo Website application

  @LoginPage
  Scenario: Test SauceDemo Login Page
    Given User is on SauceDemo Login Page
    When User Enter Username and Password
    Then User click on login button

  @SwagLabsPage
  Scenario: Test SauceDemo SwagLabs Page
    Given user is on SauceDemo SwagLabs Page
    When User add 3 products in cart
    Then User click on cart button

  @YourCart
  Scenario: Test SauceDemo YourCartPage
    Given User is on SauceDemo YourCart page
    Then user remove 1 product from cart
    Then user enter on checkout button
