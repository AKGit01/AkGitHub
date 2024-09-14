package Basic;

import java.util.HashMap;
import java.util.Map;

public class Chcount {
	   public static void main(String[] args) {
		   String myStr = "thisisits"; // Initialize the string
		   System.out.println("String =" + myStr); // Print the string

		   Map<Character, Integer> hashMap = new HashMap<>(); // Create a HashMap to store character counts

		   // Loop through the string in reverse
		   for (int i = myStr.length() - 1; i >= 0; i--) {
		       char currentChar = myStr.charAt(i); // Get the current character
		       if (hashMap.containsKey(currentChar)) { // Check if the character is already in the map
		           int count = hashMap.get(currentChar); // Retrieve the current count
		           hashMap.put(currentChar, ++count); // Increment the count and update the map
		       } else {
		           hashMap.put(currentChar, 1); // If not present, add the character with a count of 1
		       }
		   }
	      
	      String str="thisisits";
	      String s="";
	      for(int i=0;i<str.length();i++) {
	    	    int count=0; // move count to here so it counts from zero every iteration of outer loop
	    	    StringBuffer SB=new StringBuffer();
	    	    SB.append(str.charAt(i));
	    	    for(int j=i;j<str.length();j++) {
	    	    	//if(SB.)
	    	    	if(!s.contains(String.valueOf(str.charAt(j)))) {
		    	        if(str.charAt(i)==str.charAt(j)) {
		    	            count++;    
		    	        }
	    	    	}	    	    	
	    	    }
	    	    if(count>0)
	    	    System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
	    	    
	    	     s= s+str.valueOf(str.charAt(i));	    	    	 
	      }
	   }
	}
