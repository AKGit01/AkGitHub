package collections;

import java.util.HashMap;
import java.util.Map;

public class MapWithObject {

	private String name;
	private int number;

	// Constructor to initialize the object
	public MapWithObject(String name, int number) {
		this.name = name;
		this.number = number;
	}

	// Setter method if needed
	public void setValues(String name, int number) {
		this.name = name;
		this.number = number;
	}

	// Getter methods to access the fields
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "{name='" + name + "', number=" + number + '}';
	}

	public static void main(String[] args) {
		// Create a map where the key is an Integer and the value is a MapWithObject
		Map<Integer, MapWithObject> m1 = new HashMap<>();

		// Create an instance of MapWithObject and add it to the map using Constructor
		MapWithObject obj1 = new MapWithObject("John", 12345);
		m1.put(1, obj1);

		// You can add more objects to the map as needed using Constructor
		MapWithObject obj2 = new MapWithObject("Ema", 23456);
		m1.put(2, obj2);
		
		//adding obj value using setter  
		MapWithObject obj3 = new MapWithObject("",1);
		obj3.setValues("amit", 10);
		m1.put(3, obj3);

		// Iterate through the map and print the key-value pairs
		for (Map.Entry<Integer, MapWithObject> entry : m1.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
