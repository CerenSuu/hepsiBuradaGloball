@AddProductTest
Feature: addProduct

  Background:
    Given User logged in
    When Click Pet Shop
    And Verify PetShop Page


  Scenario: Add product
    And Hoover over for 2nd item
    And Click select sepete ekle button for 2nd item
    And Click sepetim
    Then Verify sepet Page
    Then Verify your product in your cart

  Scenario: Add product2
    And Hoover over for any product
    And Click select sepete ekle button for this "<urun>"
    And Click sepetim
    Then Verify sepet Page
    Then Verify your product in your cart