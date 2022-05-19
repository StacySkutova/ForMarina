Feature: Search checking

Scenario Outline: 01. Check search input and dropdown
  Given Homepage is loaded
  And Search bar is visible
  When The User enters "<request>" in the search bar
  Then Dropdown menu appears
#  And Dropdown menu contains Run
  When The User clears search bar
  Then Dropdown menu is hidden
  And Search bar is empty

  Examples:
    | request |
    | run     |
    | gym     |

#===========================================================================
#  Scenario: 01. Check search bar and dropdown
#    Given Homepage is loaded
#    And The Search bar is visible
#    When The User enters search request in the search bar
#    Then Dropdown menu appears
##    And Dropdown menu contains "Run"
#    When The User clears search bar
#    Then Dropdown menu is hidden
#
#  Scenario: 02.
#    Given Homepage is loaded
#    When The User enters another search request
#    Then Dropdown menu appears
#    When The User clears search bar
#    Then Search bar is empty


#  ++++++++++++++++++++++++++++Индивидуальное задание++++++++++++++++++++++++

#1. Открыть страницу https://www.wiggle.com/
#2. Убедиться, что строка поиска (search bar) видна

#3. ----->Ввести в строку поиска “run”
#4. ----->Убедиться, что выпадающее меню появилось

#5. Убедиться, что выпадающее меню содержит слово “Run” с большой буквы, в т.ч. слова, начинающиеся на “Run” (не важно сколько раз, просто наличие)
#6. Удалить из строки поиска “run”
#7. Убедиться, что выпадающее меню скрылось

#8. ----->Ввести в строку поиска “gym”
#9. ----->Убедиться, что выпадающее меню появилось
#10. Удалить из строки поиска “gym”
#11. Убедиться, что строка поиска пустая