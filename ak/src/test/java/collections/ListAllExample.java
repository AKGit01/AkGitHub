package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListAllExample {
	
	private String name;
	private int rollno;
	
	public ListAllExample(int rollno,String name){
		
		this.name=name;
		this.rollno=rollno;
	}
	
	public String toString() {
		return "name =" + name +"  rollnumber =" + rollno;
		
	}
	
	public static void main(String[] args) {
	
		//List with one value		
		List<Integer> L1 = new ArrayList<>();
		
		//List with 2 value 
		//List<Integer,String> L2 = new ArrayList<>();
		
		//List with Object
		List<Object> L3= new ArrayList<>();
		
		//List with object using setter and getter 
		List<ListAllExample> s1 = new LinkedList<>();
		
	//Adding value to List1
		L1.add(20);
		L1.add(1,30);
		L1.add(4);
		System.out.println("Size of List1 =" + L1.size());
		System.out.println("Element of List1 =" + L1);
		
		Set<Integer> T1= new TreeSet<>();
		T1.addAll(L1);
		System.out.println("Element in TreeSet1 =" + T1);
	//Adding value to List3
		L3.add("Amit");
		L3.add(11);
		L3.addAll(L1);
		System.out.println("List before set =" + L3);
		L3.set(1, 15);
		System.out.println("List After set =" + L3);
		System.out.println("Using Get =" +L3.get(2));
		System.out.println("contains =" + L3.contains("Amit"));
	//Adding value to S1
		s1.add(new ListAllExample (4,"ak"));
		s1.add(new ListAllExample (8,"pk"));
		System.out.println("Value of List at s1 =" + s1.get(1));
		System.out.println("List s1 =" + s1);
		L3.addAll(s1);
		System.out.println("All combined" + L3);
		
//		if(L3.contains("pk"))
//			System.out.println("L3 contains pk");
//		else
//			System.out.println("L3 not contains pk");
		for (ListAllExample person : s1) 
            System.out.println(person);	
	
		//s1.addAll(L1);
		
		for(ListAllExample L4: s1) {
			
			if(L4.name.equals("amit"))
				System.out.println("L4 contains amit");
			else
				System.out.println("L4 not contains amit");
		}
	}
}
