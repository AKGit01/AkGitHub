package Rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class First {

	@Test
	 void validate() {
		Response r1=RestAssured.get("https://api.restful-api.dev/objects/7");
		System.out.println(r1.asString());
		System.out.println("Status code:" + r1.statusCode());
	}
}
