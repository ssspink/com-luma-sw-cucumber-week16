Feature: Women Test

  As a User I want to verify sort By filter of women_jacket Page


  Scenario: verify The Sort By ProductName Filter
    Given I am on homepage
    When  I mouse hover on Women menu
    And   I mouse hover on Tops
    And   I click on Jackets
    And   I select sort By filter "Product Name"
    Then  Products names displayed in alphabetical order

  Scenario: Verify The Sort By Price Filter
    Given I am on homepage
    When  I mouse hover on Women menu
    And   I mouse hover on Tops
    And   I click on Jackets
    And   I select sort By filter "Price"
    Then Verify the products price display in Low to High