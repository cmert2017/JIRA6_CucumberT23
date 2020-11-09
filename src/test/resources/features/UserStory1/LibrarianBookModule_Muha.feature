@book
Feature: A description

  Background: user is on login page
    Given user on the login page
    And user logs in as a "librarian"

  Scenario: Book module grid
    When user navigate to "Book" module and click on it
    Then user should see grid with following "Elements"
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

  Scenario: Creating a book
    When user navigate to "Book" module and click on it
    Then user should see Add Book button and click on it
    And user should fill up required fields and save changes
