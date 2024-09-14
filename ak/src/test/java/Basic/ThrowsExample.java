package Basic;

import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Method that declares an IOException using the throws clause
    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName); // This can throw FileNotFoundException
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}
