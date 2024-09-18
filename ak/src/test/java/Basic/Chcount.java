package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Chcount {
	   public static void main(String[] args) {
		   String myStr = "thisisits"; // Initialize the string
		   System.out.println("String =" + myStr); // Print the string

		   Map<Character, Integer> hashMap = new HashMap<>(); // Create a HashMap to store character counts

		   // Loop through the string in reverse
		   //for (int i = myStr.length() - 1; i >= 0; i--) {
		    //   char currentChar = myStr.charAt(i); // Get the current character
		   for(char c: myStr.toCharArray()) {
		       if (hashMap.containsKey(c)) { // Check if the character is already in the map
		           int count = hashMap.get(c); // Retrieve the current count
		           hashMap.put(c, ++count); // Increment the count and update the map
		       } else {
		           hashMap.put(c, 1); // If not present, add the character with a count of 1
		       }
		   }
		   for(Map.Entry<Character, Integer> m1: hashMap.entrySet()) {
			   System.out.println("Char = " + m1.getKey() + " Count = " + m1.getValue());
		   }
		   System.out.println("Count of Char" + hashMap);
		   
		   //Find largest chr count in word
			List<Integer> arrList = new ArrayList<> (hashMap.values());
			System.out.println("Not Sorted: " + arrList);
			
			Set<Integer> unique = new TreeSet<>(Collections.reverseOrder());
			unique.addAll(arrList);
			
			List<Integer> sortedVal = new ArrayList<> (unique);
			
			for(Character entry : hashMap.keySet()) {
				if(hashMap.get(entry) == sortedVal.getFirst()) {
					System.out.println("Larget number is : " + entry + hashMap.get(entry));
				}
			}	
//	      
//	      String str="thisisits";
//	      String s="";
//	      for(int i=0;i<str.length();i++) {
//	    	    int count=0; // move count to here so it counts from zero every iteration of outer loop
//	    	    for(int j=i;j<str.length();j++) {    	    	
//	    	    	if(!s.contains(String.valueOf(str.charAt(j)))) {
//		    	        if(str.charAt(i)==str.charAt(j)) {
//		    	            count++;    
//		    	        }
//	    	    	}	    	    	
//	    	    }
//	    	    if(count>0)
//	    	    System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
//	    	    
//	    	     s= s+str.valueOf(str.charAt(i));	    	    	 
//	      }
	   }
	}
