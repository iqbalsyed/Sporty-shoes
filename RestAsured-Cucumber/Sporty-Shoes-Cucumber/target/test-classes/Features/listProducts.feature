#Sample Feature Definition Template
@ListOfProducts
Feature: Retrieve All Products
  I want to Retrieve All Products

  @ListOfProducts
  Scenario: Retrieve the list of all products in the store
    Given Open HomePage
    And Basepath get shoes
    When status code 200
    Then Log all
