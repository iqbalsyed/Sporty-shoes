#Sample Feature Definition Template
@UpdateProduct
Feature: Update Product
  I want to Update a Product

  @UpdateProduct
  Scenario: Update a Product
    Given Open HomePage
    And Basepath Update shoe
    Then add the queryparam id
    Then add queryparam image
    Then add queryparam name
    Then add queryparam category
    Then add queryparam size
    Then add queryparam price
    Then Log its details
