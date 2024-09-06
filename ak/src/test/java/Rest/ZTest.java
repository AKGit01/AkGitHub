package Rest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;
 
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
 
import java.util.List;
import java.util.Map;
 
public class ZTest {
 
	public static void main(String[] args) {
		
		//baseURI = "https://reqres.in";
							
							
		 Response response = RestAssured
		            .given()
		            .baseUri("https://reqres.in")
		            .basePath("/api/users")
		            .queryParam("page", 2)
		            .when()
		            .get()
		            .then()
		            .statusCode(200)
		            .log().all()
		            .body("total_pages", equalTo(2))
		            .body("data[0].id", equalTo(7))
		            .extract()
		            .response();
		
		 System.out.println(response.asPrettyString());
		 JsonPath jsonPath = response.jsonPath() ;
		
		 System.out.println(jsonPath.get("total_pages").toString());
		 System.out.println(jsonPath.get("support.url").toString());
		
		 System.out.println(jsonPath.get("data[0].id").toString());
		
		
		 String fs = jsonPath.get("data[0].first_name");
		 System.out.println(fs);
		
		 List<String> alName = jsonPath.get("data.first_name");
		 System.out.println(alName.toString());
		
		 Map<String, String> map= jsonPath.getMap("data[0]");
		 System.out.println(map.toString());
	}
}