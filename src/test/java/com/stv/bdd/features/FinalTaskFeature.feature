Feature: Search checking

  Scenario Outline: 01. Check search input and dropdown
    Given Homepage is loaded
    And Search bar is visible
    When The User enters "<request>" in the search bar
    Then Dropdown menu appears
    And Dropdown menu contains "<request>"
    When The User clears search bar
    Then Dropdown menu is hidden
    And Search bar is empty

    Examples:
      | request |
      | run     |
      | gym     |
