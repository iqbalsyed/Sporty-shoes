package com.simplilearn.bddtest.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;


public class ListAllUsers {
	
	@Given("Basepath get users")
	public void basepath_get_users() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users");

	}

	@When("status code is {int}")
	public void status_code_is(Integer int1) {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when()
		.get()
		.then()
		.statusCode(200);
	}

	@Then("Log all users")
	public void log_all_users() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log()
		.all();
	}


}
