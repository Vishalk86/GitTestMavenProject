Feature: Login Functionality

  Scenario: Verify Login

    Given I launch browser

    And I open application as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

    When I enter on "Login##username" as "Admin"

    And I enter on "Login##password" as "admin123"

    And I click on "Login##loginButton"

    Then I waitForElementPresent on "Login##dashboard"
    
    And I click on "PIM##PIM"
    And I store text from "PIM##EmployeeTitle"
    And I click on "PIM##AddButton"
    And I enter stored value in "PIM##AddEmployee_FirstName"
#    And I click on "PIM##AddButton"
#   And I enter on "PIM##AddEmployee_FirstName" as "Rohan"
#    And I enter on "PIM##AddEmployee_LastName" as "Kumar"
#    And I click on "PIM##AddEmployee_Save"
 