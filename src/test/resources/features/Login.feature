Feature: Login Functionality

  Scenario: Verify Login

    Given I launch browser

    And I open application as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

    When I enter on "Login##username" as "Admin"

    And I enter on "Login##password" as "admin11"

    And I click on "Login##loginButton"

    Then I waitForElementPresent on "Login##dashboard"