Feature: Adding Amazon gift card 

  Scenario: Add gift card
    Given The user is on Amazon home page
    When The user adds a gift card
    Then Error message is diaplyed for missing email address