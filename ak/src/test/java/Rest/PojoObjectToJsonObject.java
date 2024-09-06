package Rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import Rest.Person;

public class PojoObjectToJsonObject {

    public static void main(String[] args) throws JsonProcessingException {
        // Create a new Person object
        Person person = new Person();
        person.setName("Amod");
        person.setAge(30);

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Serialize the Person object to a JSON string with pretty printing
        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);

        // Print the JSON string
        System.out.println(jsonString);
    }
}

