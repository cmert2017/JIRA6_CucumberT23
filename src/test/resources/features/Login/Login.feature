Feature: login

  Background: common steps
Given user on the login page

  Scenario: login as a Librarian
    Given user is on the login page
    When user enters valid credentials
    Then System should displays the dashboard

  @login
  Feature: As user I want to be able to login under different roles



#feature class
  @librarian
  Scenario: Login as a librarian
    When user logs in as a "librarian"
    Then Dashboard should be displayed

  @Student
  Scenario: Login as a student
    When user log in as a "student"
    Then Books should be displayed