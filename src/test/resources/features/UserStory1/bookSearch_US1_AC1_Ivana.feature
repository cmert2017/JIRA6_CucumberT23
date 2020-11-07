Feature: As a Librarian I should be able to search for any book by category

  @book_categories
  Scenario: Search books by category
    Given As a Librarian member
    When I click on a Book Category dropdown
    And I select one genre
    Then I should be able to search for any book by category