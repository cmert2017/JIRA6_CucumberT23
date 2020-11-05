Feature: login

  Background: common steps
    Given user on the login page

  Scenario: login as a Librarian
    Given user is on the login page
    When user enters valid credentials
    Then System should displays the dashboard

  @login
  #Feature: As user I want to be able to login under different roles

#feature class
  @librarian
  Scenario: Login as a librarian
    When user logs in as a "librarian"
    Then Dashboard should be displayed

  @Student
  Scenario: Login as a student
    When user log in as a "student"
    Then Books should be displayed


  @allRolesTogether
  Scenario Outline: Login with <role>
    When user log in as a "<role>"
    Then Books should be displayed
    #pipes
    Examples:
      | role      |
      | student   |
      | librarian |



  @allRolesTogether @advancedS_O
  Scenario Outline: Login as a <role>
    When user log in as a "<role>"
    Then System should display "<landingPage>"
    And System will show personal greeting as hello "<name>"
    #pipes
    Examples:
      | role      | landingPage        | name      |
      | student   | StudentDashdboard  | student   |
      | librarian | LibrarianDashboard | librarian |




 #command+option+ L

  #Ability: what is it for? lets search for it later.
