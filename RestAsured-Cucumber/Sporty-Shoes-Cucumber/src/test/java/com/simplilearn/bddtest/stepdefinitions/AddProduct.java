package com.simplilearn.bddtest.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;


public class AddProduct {
	
	@Given("Basepath add shoe")
	public void basepath_add_shoe() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe");
	}

	@Then("queryparam id")
	public void queryparam_id() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020");
	}

	@Then("queryparam image")
	public void queryparam_image() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com");
	}

	@Then("queryparam name")
	public void queryparam_name() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Nike");
	}

	@Then("queryparam category")
	public void queryparam_category() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Nike")
		.queryParam("category", "Running");
	}

	@Then("queryparam size")
	public void queryparam_size() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Nike")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7");
	}

	@Then("queryparam price")
	public void queryparam_price() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Nike")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2000");
	}

	@Then("Log details")
	public void log_details() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Nike")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2000")
		.when()
		.post()
		.then()
		.log().all();
	}


}
