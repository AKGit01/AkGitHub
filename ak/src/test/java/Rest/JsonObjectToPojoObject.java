package Rest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import Rest.Person;

import java.util.Map;

public class JsonObjectToPojoObject {

    public static void main(String[] args) throws JsonProcessingException {
        // Sample JSON string
        String jsonResponse = "{\r\n" +
                "  \"name\": \"Amod\",\r\n" +
                "  \"age\": 12\r\n" +
                "}";

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Deserialize JSON to Person object
        Person person = objectMapper.readValue(jsonResponse, Person.class);

        // Print the values of Person object
        System.out.println(person.getName());  // Output: Amod
        System.out.println(person.getAge());   // Output: 12

        // Deserialize JSON to a Map
        Map<String, Integer> personAsMap = objectMapper.readValue(jsonResponse, Map.class);

        // Print the values from the Map
        System.out.println(personAsMap.get("name"));  // Output: Amod
        System.out.println(personAsMap.get("age"));   // Output: 12
    }
}
