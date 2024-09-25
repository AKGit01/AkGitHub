package basic;

import java.util.ArrayList;
import java.util.List;

public class SubstringFinder {
    
    public static List<String> findAllSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        
        // Outer loop for the starting character
        for (int i = 0; i < str.length(); i++) {
            // Inner loop for the ending character
            for (int j = i + 1; j <= str.length(); j++) {
                // Add the substring to the list
                substrings.add(str.substring(i, j));
            }
        }
        
        return substrings;
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> result = findAllSubstrings(input);
        
        // Print the result
        for (String substr : result) {
            System.out.println(substr);
        }
    }
}
