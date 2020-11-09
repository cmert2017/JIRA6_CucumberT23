@login1
Feature: Login feature

  Background: common steps
    Given user on the login page

  @differentRole
  Scenario Outline: Parametrized login as <role>
    When user logs in as a "<role>"
    Then user should see "<page_title>" page

    Examples:
      | role      | page_title |
      | librarian | dashboard  |
      | student   | books  |
