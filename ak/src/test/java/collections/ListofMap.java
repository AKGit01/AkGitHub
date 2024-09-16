package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListofMap {
	 public static void main(String[] args) {
	        try {
	            // Create ObjectMapper instance
	            ObjectMapper mapper = new ObjectMapper();

	            // Create a List of Maps
	            List<Map<String, Object>> listOfMaps = new ArrayList<>();

	            Map<String, Object> map1 = new HashMap<>();
	            map1.put("name", "John");
	            map1.put("age", 30);
	            map1.put("city", "New York");

	            Map<String, Object> map2 = new HashMap<>();
	            map2.put("name", "Jane");
	            map2.put("age", 25);
	            map2.put("city", "Los Angeles");

	            Map<String, Object> map3 = new HashMap<>();
	            map3.put("name", "Mike");
	            map3.put("age", 35);
	            map3.put("city", "Chicago");

	            // Add maps to the list
	            listOfMaps.add(map1);
	            listOfMaps.add(map2);
	            listOfMaps.add(map3);

	            // Convert List of Maps to JSON string
	            String jsonOutput = mapper.writeValueAsString(listOfMaps);

	            // Print JSON string
	            System.out.println("JSON Output: " + jsonOutput);
	            
	            // Define the name to search for
	            String targetName = "Jane";

	            // Search for the target name and print the corresponding age
	            for (Map<String, Object> map : listOfMaps) {
	                if (map.get("name").equals(targetName)) {
	                    System.out.println("Age of " + targetName + ": " + map.get("age"));
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }

}
