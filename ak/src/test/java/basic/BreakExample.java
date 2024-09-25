/**
 * 
 */
package basic;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);

            // Break the loop when i equals 5
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;  // Exit the loop
            }
        }
        
        System.out.println("Loop is finished.");
    }
}
