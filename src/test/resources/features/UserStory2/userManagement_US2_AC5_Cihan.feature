# [https://docs.google.com/spreadsheets/d/1Tp8TTW01DIzsZj74O1E4mF7EG8i3UrBB2R88TpEyTrY/edit#gid=0]
#
#[http://library2.cybertekschool.com/login.html
#User Story 2: As a user I should be able to manage user module
#AC#1 - As an authorized user, the Librarian should be able to log in and see the Dashboard page
#Bat
#AC#2 - As an authorized user, the Librarian should be able to choose Users page
#Omer
#AC#3 - As an authorized user, the Librarian should be able to Add User
#Gokhan
#AC#4 - As an authorized user, the Librarian should be able to Edit User
#Cristina
# AC#5 - As an authorized user, the Librarian should be able to Search by User ID, Full
#   Name and Email
#   cihan
#AC#6 - As an authorized user, the Librarian should be able to filter Users from the User Group dropdown
#Reyhan
#AC#7 - As an authorized user, the Librarian should be able to filter Users' Status from the Status dropdown
#Open for adoption:(adopt an AC):
#AC#8 - As an authorized user, the Librarian should be able to filter Records by the required number of records from the Show Records dropdown
#Open for adoption:(Adopt an AC):
Feature: User management

  @US2_AC5
  Scenario Outline: Searching users as Librarian by <searchValue>
    Given user on the login page
    And user logs in as a "librarian"
    And user navigates to "<menu>" page
    When user enters the "<searchValue>"
    Then System should display the search Results

    Examples: different search ways and results
      | menu  | searchValue |
      | users | UserID      |
      | users | FullName    |
      | users | Email       |






