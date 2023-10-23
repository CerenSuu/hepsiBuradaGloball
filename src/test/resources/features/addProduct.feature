@AddProductTest
Feature: addProduct

  Scenario: Add product

    Given User logged in
    When Click Pet Shop
    And Hoover over for 2nd item
    And Click select sepete ekle button for 2nd item
    And Click sepetim
   Then Verify your product in your cart