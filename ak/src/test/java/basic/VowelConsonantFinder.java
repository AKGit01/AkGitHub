package basic;

import java.util.Scanner;

public class VowelConsonantFinder {

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();  // Convert the string to lowercase for easy comparison

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character of the string
        for (char c : input.toCharArray()) {
        	
        	if (Character.isAlphabetic(c)) {
            if (isVowel(c)) 
            //{
                vowelCount++;
    //        } else if (isConsonant(c)) {
                else consonantCount++;
        //    }
        }
        }

        // Print the result
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    // Method to check if the character is a vowel
    public static boolean isVowel(char c) {
        //return "aeiou".indexOf(c) != -1;
        String v = "aeiou";
        return v.contains(Character.toString(c)); // Convert char to String
    }

    // Method to check if the character is a consonant
    public static boolean isConsonant(char c) {
       // return c >= 'a' && c <= 'z' && !isVowel(c);
    	 int b="aeiou".indexOf(c);
    	 return b>0;
    }
}
