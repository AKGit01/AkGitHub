package Rest;

import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;
//import static io.restassured.RestAssured.*;

//import com.jayway.jsonpath.JsonPath;

public class ReadJsonpath {

	public static void main(String[] args) {
	//Convert JSON to String
	String jsonResponse = "{\"store\":{\"book\":[{\"category\":\"fiction\",\"title\":\"TheAlchemist\","
			+ "\"price\":10.99},{\"category\":\"non-fiction\",\"title\":\"Sapiens\",\"price\":15.99},"
			+ "{\"category\":\"fiction\",\"title\":\"TheGreatGatsby\",\"price\":8.99},{\"category\":\"non-fiction\","
			+ "\"title\":\"Educated\",\"price\":12.99}],\"bicycle\":{\"color\":\"red\",\"price\":199.99}}}";
	
	//Object JO=JsonPath.read(jsonResponse,"$.store.book[0]");
	//Object JO1=js.getJsonObject("$.store.book[?(@.price > 10)]");
	//System.out.println(JO);
	//System.out.println(JO1);
	
	JsonPath js = new JsonPath(jsonResponse);
	int i=js.getInt("store.size()");
	System.out.println("Store size = "+ i);

	// Get the list of books
    List<Map<String, Object>> books = js.getList("store.book");
   // List<Map<String, Object>> books1 = js.get("store.book").findAll{ it.price > 10 };
    // Filter and print books with price > 10
    System.out.println("Books with price greater than 10:");
    for (Map<String, Object> book : books) {
    	Float price =  (Float) book.get("price");
        if (price > 10) {
            System.out.println(book);
        }
    }
	
	}
}