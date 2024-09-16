package exception;

//Custom checked exception
class CustomCheckedException extends Exception {
 
	// Add the serialVersionUID
    private static final long serialVersionUID = 1L;
	// Constructor with a custom message
 public CustomCheckedException(String message) {
	 System.out.println("Output message: " + message);
 }
}

public class CustomExceptionExample {
 // Method that throws the custom exception
 public static void checkValue(int value) throws CustomCheckedException {
     if (value < 0) {
         throw new CustomCheckedException("Value cannot be negative: " + value);
     } else {
         System.out.println("Valid value: " + value);
     }
 }

 public static void main(String[] args) {
     try {
         checkValue(5);   // Valid value
         checkValue(-3);  // This will throw the custom exception
     } catch (CustomCheckedException e) {
         // Catch and handle the custom exception
         System.err.println("Caught Exception: " + e.getMessage());
     }
 }
}

