Feature: login

  Background: common steps
    Given user on the login page


  @allRolesTogether
  Scenario Outline: Login as a <role>
    When user log in as a "<role>"
    Then System should display "<landingPage>"
    And System will show personal greeting as hello "<name>"
    #pipes
    Examples:
      | role      | landingPage | name      |
      | student   | books       | student   |
      | librarian | dashboard   | librarian |


 #command+option+ L

  #Ability: what is it for? lets search for it later.
