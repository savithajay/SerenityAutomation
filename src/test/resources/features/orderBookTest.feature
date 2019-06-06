Feature: Add book to cart

  Scenario: Search for a book and add it to cart
    Given The user is on Amazon home page
    When The user searches for a item
    Then user adds the selected item to cart
    And The user verifies that item is added