package com.simplilearn.bddtest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class DeleteProduct {
	
	@Given("Basepath delete shoe")
	public void basepath_delete_shoe() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe");
	}
	
	@When("add queryparam id")
	public void add_queryparam_id() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1020");
	}

	@Then("Log the details")
	public void log_the_details() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1020")
		.when().delete()
		.then().log().all();
	}


}
