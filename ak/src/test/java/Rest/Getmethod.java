package Rest;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Getmethod {

   @Test 
	public void getmethod(){
		
		Response r1=RestAssured.get("https://api.restful-api.dev/objects/7");
		
		//System.err.println(r1.asString());
		//System.out.println(r1.body());
		System.out.println("Current header :" +  r1.header("data"));
		System.out.println("Current Status code :" + r1.getStatusCode());
		System.out.println("Body:" + r1.getBody().asString());
		
		//validate 
		
		int expectedcode = 200;
		int actualcode = r1.statusCode();
		Assert.assertEquals(actualcode, expectedcode);
		Assert.assertTrue((expectedcode==actualcode), "Pass with all step");
	}
	
	//given when then

    @Test(dependsOnMethods="getmethod")
	public void Bdd() {
    	//sets the base URL for all requests.
		RestAssured.baseURI ="https://api.restful-api.dev/objects";
		//given();
		RestAssured.given()
		.queryParam("id","3")
		.when().get()
		.then().statusCode(200).extract().response();
		
		String s=RestAssured.given()
		.queryParam("id","3")
		.when().get().then().extract().response().asString();
		System.out.println("output of BDD" +s);
	}

}
