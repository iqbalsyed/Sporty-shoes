#Sample Feature Definition Template
@AddProduct
Feature: Add Product
  I want to Add a Product

  @AddProduct
  Scenario: Add a new Product
    Given Open HomePage
    And Basepath add shoe
    Then queryparam id
    Then queryparam image
    Then queryparam name
    Then queryparam category
    Then queryparam size
    Then queryparam price
    Then Log details
