package com.simplilearn.bddtest.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class ListAllProducts {
	
	@Given("Open HomePage")
	public void open_home_page() {
		 RestAssured.given()
		.baseUri("http://localhost:9010");
	}

	@Given("Basepath get shoes")
	public void basepath_get_shoes() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes");
	}

	@When("status code {int}")
	public void status_code(Integer int1) {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when()
		.get()
		.then()
		.statusCode(200);
	}

	@Then("Log all")
	public void log_all() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log()
		.all();
	}

}
