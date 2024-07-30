package com.org.testclass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PathAndParameter {
	
	@Test
	public void pathAndParameterTest() {
		
		given()
		.pathParam("myPath1", "users")
		.param("myPath2", "users")
		.queryParam("page",2)
		.queryParam("id",5)
		
		.when()
		.get("https://reqres.in/api/{myPath1}")
		
		.then()
		.statusCode(200)
		.log().all();
	}
	

}
