package basic;
import java.util.Scanner;

public class KeypadAggregateAverage {
    // Method to get the numerical value of a character as per the phone keypad
    public static int getKeypadValue(char c) {
        c = Character.toUpperCase(c); // Convert to uppercase for consistency
        switch (c) {
            case 'A': case 'B': case 'C': return 2;
            case 'D': case 'E': case 'F': return 3;
            case 'G': case 'H': case 'I': return 4;
            case 'J': case 'K': case 'L': return 5;
            case 'M': case 'N': case 'O': return 6;
            case 'P': case 'Q': case 'R': case 'S': return 7;
            case 'T': case 'U': case 'V': return 8;
            case 'W': case 'X': case 'Y': case 'Z': return 9;
            default: return 0; // For non-alphabetic characters
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input string from the user
        System.out.print("Enter a string: ");
       // String input = scanner.nextLine();
        int totalValue = 0;
        int count = 0;
        String s= "Amit Kumar";
        // Loop through each character in the string
        //for (char c : input.toCharArray()) {
       for (char c : s.toCharArray()) {
            int value = getKeypadValue(c);
            if (value > 0) {
                totalValue += value;
                count++;
            }
        }
        // Calculate average
        double average = (count > 0) ? (double) totalValue / count : 0;
 
        // Output results
        System.out.println("Aggregate value: " + totalValue);
        System.out.println("Average value: " + average);
 
        scanner.close();
    }
}
