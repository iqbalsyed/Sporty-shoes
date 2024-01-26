#Sample Feature Definition Template
@ListOfProducts
Feature: Retrieve All Users
  I want to Retrieve All Users

  @ListOfProducts
  Scenario: Retrieve the list of all Users
    Given Open HomePage
    And Basepath get users
    When status code is 200
    Then Log all users
