package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setEx {

	public static void main(String arg[]) {
		
		List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Print the list
        System.out.println("List: " + list);

        // Create a Set and add all elements from the List
        Set<String> set = new HashSet<>(list);

        // Print the set (duplicate "Apple" will be removed)
        System.out.println("Set: " + set);
        // Create an existing Set
        
        Set<String> set1 = new HashSet<>();
        set1.add("Mango");
        set1.add("Grapes");

        // Add all elements from the List to the existing Set
        set1.addAll(list);

        // Print the updated set
        System.out.println("Updated Set: " + set1);
		
		
	}
}
