package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {



public static void main (String arg[]) {
	//System.out.println("aa");
	
	Map<String,Integer> m1= new HashMap<>();
	m1.put("xyz",6);
	m1.put("amit", 22);
	
	Map<String,Integer> m2 = new TreeMap<>(m1);
	
	for (Map.Entry<String, Integer> entry : m1.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
	System.out.println(m2);
	

	
}

}
