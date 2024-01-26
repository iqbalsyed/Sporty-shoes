package com.simplilearn.bddtest.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;


public class UpdateProduct {
	
	@Given("Basepath Update shoe")
	public void basepath_update_shoe() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe");
	}
	
	@Then("add the queryparam id")
	public void add_the_queryparam_id() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020");
	}

	@Then("add queryparam image")
	public void add_queryparam_image() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com");
	}

	@Then("add queryparam name")
	public void add_queryparam_name() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok");
	}

	@Then("add queryparam category")
	public void add_queryparam_category() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "Running");
	}

	@Then("add queryparam size")
	public void add_queryparam_size() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7");
	}

	@Then("add queryparam price")
	public void add_queryparam_price() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2500");
	}

	@Then("Log its details")
	public void log_its_details() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2500")
		.when()
		.put()
		.then()
		.log().all();
	}


}
