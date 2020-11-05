#User Story1: As a librarian, I should be able to search for the books by name, author,category, year , borrowed by, and ISBN by typing them on the search box and then clicking on it
#
#AC1: Verify that Librarian should be able to search for any book by category by clicking on “Book Category”
#
#Ivana
#
#AC2: Verify that librarian should be able to search for any book, by clicking the “search” box according to the author
#
#Kelsey
#
#AC3: Verify that librarian should be able to search for any book, by clicking the “search” box according to the name
#
#Mehdi
#
#AC4: Verify that librarian should be able to search for any book, by clicking the “search” box according to the Borrowed by
#
#Zebo
#
#AC5: Verify that librarian should be able to search for any book, by clicking the “search” box according to the year
#
#Evelin

Feature: Book search
  @AC
  Scenario: book search by bookname
    Given user is on the dearch page
    When user enters bookname in the search box
    Then Ssytem should display all the available books
# hi