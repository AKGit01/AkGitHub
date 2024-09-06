package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listsorting {
	
	int i;
	String s;
	
	public Listsorting(int i,String s) {
		this.i=i;
		this.s=s;
	}
	
    public int compareTo(Listsorting other) {
        return this.s.compareTo(other.s);
    }

	public static void main(String[] args)
	{
		List<String> s =new ArrayList<>();
		List<Integer> s2= new ArrayList<>();
		List<Listsorting> s1= new ArrayList<>();
		//List<String, int> s3 =new ArrayList<>();
		
		s2.add(2);
		s1.add(new Listsorting(6,"ravi"));
		s1.add(new Listsorting(8,"Kavi"));
			
		for (Listsorting t: s1) {
			System.out.println("Name:"+ t.s +" Number:"+t.i);

		}
		
		s.add("amit");
	    s.add("kumar");
	    s.add("abhi");
	    
	    Collections.sort(s);
	    for(String str : s) {
	    System.out.println(str);
	    }
	    
	    System.out.println(s);
	    Collections.sort(s,Collections.reverseOrder());
	    for(String str : s) {
	    System.out.println(str);
	    }
	    
	    for(int i :s2) {
	    	System.out.println(i);
	    }
	    System.out.println(s2);
	    System.out.println(s);
	    
	    //Collections.sort(s1); // cannot sort student type object
	    //Collections.sort(null, null);
	}
}
