package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {



public static void main (String arg[]) {
	//System.out.println("aa");
	
	Map<String,Integer> m1= new HashMap<>();
	m1.put("name",6);
	m1.put("age", 22);
	
	Map<String,Integer> m3= new HashMap<>();
	m3.put("name",61);
	m3.put("age", 221);
	
	Map<String,Integer> m2 = new TreeMap<>(m1);
	
	for (Map.Entry<String, Integer> entry : m1.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
	
	System.out.println(m2);
	
	List<Map<String,Integer>> list = new ArrayList<>();
	list.add(m2);
	list.add(m3);
	String targetName = "amit";
	for (Map<String, Integer> value : list) {
        for (String key : value.keySet()) {
            // Checking if the key is "name" and if the corresponding value matches targetName
            if (key.equals("name") && value.get("name").equals(targetName)) {
                System.out.println("Age: " + value.get("age"));
            }
        }
    }

  }
}
