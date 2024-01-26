#Sample Feature Definition Template
@DeleteProduct
Feature: Delete Product
  I want to Add a Product

  @DeleteProduct
  Scenario: Delete a Product
    Given Open HomePage
    And Basepath delete shoe
    When add queryparam id
    Then Log the details
