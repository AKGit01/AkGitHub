package Basic;

public class Arrayexample {

	public static void main(String[] args) {
        // Declare and initialize an array of objects (String in this case)
        String[] cities = new String[3];
        
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("First fruit: " + fruits[0]);
     // Declare an array of integers
        int[] numbers = new int[2]; // Creates an array of size 5
        
     // Initialize the array
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println("First element: " + numbers[0]);
        // Initialize the array
        cities[0] = "New York";
        cities[1] = "London";
        cities[2] = "Tokyo";

        // Print the array elements
        for (int i = 0; i < cities.length; i++) {
            System.out.println("City " + (i + 1) + ": " + cities[i]);
        }
        
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
	}
}
