package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllSetExample {
	
	private String name;
	private int rollno;
	
	public AllSetExample (String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	 public String toString() {
		 return "name --> " + name + "roll no -->" + rollno;
	}

	public static void main (String[] args) {
		
		Set <Integer> s1 = new HashSet<>();

		//add element to set
		s1.add(24);
		s1.add(28);
		s1.add(45);
		s1.add(2);
		System.out.println("Element in Set1 =" + s1);
		//s1.add(1,3);
		System.out.println("Size of Set1 =" + s1.size());
		
		//add element to linkedhash set 
		Set <Integer> L1 = new LinkedHashSet<>();
		L1.add(30);
		L1.addAll(s1);
		System.out.println("Element in LinkSet1 =" + L1);
		
		//Add element to TreeSet
		Set<Integer> T1= new TreeSet<>();
		T1.add(46);
		T1.addAll(L1);
		System.out.println("Element in TreeSet1 =" + T1);
		
		System.out.println("Is 28 Element in TreeSet1 =" + T1.contains(28));
		//Set <Integer,String> s2 = new HashSet<>();
		
		//add element to object
		Set <Object> s2 = new HashSet<>();
		s2.add("amit");
		s2.add(22);
		System.out.println("Element in Set2 =" + s2);
		
		//add element to object class
		Set<AllSetExample> SO = new HashSet<>();
		
		SO.add(new AllSetExample("amit",2));
		SO.add(new AllSetExample("pk",3));
		
		for(AllSetExample st : SO) {
			System.out.println("Set object otput" + st);
			
		}
		
		
	}
}
