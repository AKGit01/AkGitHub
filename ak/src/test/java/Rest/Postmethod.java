package Rest;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Postmethod {

	public void add() {

		// Create the main JSON object
		JSONObject obj = new JSONObject();
		obj.put("name", "Amit");

		// Create the nested JSON object for the "data" field
		JSONObject dataObject = new JSONObject();
		dataObject.put("year", 2024);
		dataObject.put("price", 100);
		dataObject.put("CPU model", " Core i9");
		dataObject.put("Hard disk size", "2 TB");

		// Put the nested object into the main JSON object
		obj.put("data", dataObject);

		// Set the base URI for RestAssured
		RestAssured.baseURI = "https://api.restful-api.dev/objects";

		// Send a POST request with the JSON object
		RestAssured.given()
		.header("Content-Type", "application/json") // Specify the content type
		.contentType(ContentType.JSON) // Indicate that the body is JSON
		.body(obj.toJSONString()) // Attach the JSON object as the body of the request
		.when()
		.post() // Send the POST request
		.then()
		.statusCode(201) // Check if the status code is 201 (Created)
		.log().all(); // Log the details of the response
	}
}
