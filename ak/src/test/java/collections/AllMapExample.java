package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AllMapExample {
	
	private String Name;
	private int number;
	public AllMapExample (String Name , int number) {
		this.Name=Name;
		this.number=number;
	}
	
	public String toString() {
		return ("Name -->" + Name + "Number --> " + number);
	}
	
	public static void main (String[] args) {
		
		//add value to map
		
		Map<Integer,String> m1 = new HashMap<>();
		m1.put(5, "ak");
		m1.put(2, null);
		System.out.println("value with key" +m1.get(2));
		System.out.println("Map value"+ m1);
		
		List<Integer> L1 = new ArrayList<>();
		
		for(Map.Entry<Integer,String> map1: m1.entrySet() ) {
			
			if(!(map1.getValue()==null)) {
			System.out.println("key  --> " + map1.getKey() + "  Value -->" + map1.getValue());
			}
		}
			//L1.add(map1.getKey());
		
		System.out.println("List value ="+ L1);	
		Set<Integer> s1 = new TreeSet<>();
		s1.addAll(L1);
		System.out.println("sorted set value ="+ s1);
		
		//adding object to map
		
		Map<Integer ,AllMapExample> m2 = new HashMap<>();
		m2.put(1, new AllMapExample("amit",45));
		m2.put(2, new AllMapExample("pk",55));
	
		
		for(Map.Entry<Integer ,AllMapExample> map2 : m2.entrySet()) {
			
			System.out.println("First key " +map2.getKey() + " Value " + map2.getValue() );
		}
		
		List <Map> LS = new ArrayList<>();
		
		LS.add(m2);
		LS.add(m1);
		
		for (Map<Integer ,AllMapExample> m3 :LS) {
			System.out.println("Map out " + m3);
			
		}
	}

}
