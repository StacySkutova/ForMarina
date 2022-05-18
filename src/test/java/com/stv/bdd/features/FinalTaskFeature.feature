Feature: Search bar checking

  Scenario Outline: 01. Check search bar is available and search request
    Given Homepage is loaded
    When The Search bar is visible
    And The User enters "<request>" in the search bar
    Then Dropdown menu is appeared
#    And Dropdown menu contains "<option>"
#    When The User clears search bar
#    Then Dropdown menu is hidden


    Examples:
      | request |
      | run     |
      | gym     |


#     Examples:
#      | request | option     |
#      | run     | Run        |
#      | run     | Running    |
#      | run     | Runderwear |





#  Scenario Outline: 012.
#    Given Homepage is loaded
#    When The User enters "<request>" in the search bar
#    Then Dropdown menu is appeared
#    When The User clears search bar
#    Then Search bar is empty
#
#    Examples:
#      | request |
#      | gym     |