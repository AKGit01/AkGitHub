package Basic;

public class EqualsVsDoubleEquals {
    public static void main(String[] args) {
        // == with primitives
        int a = 5;
        int b = 5;
        System.out.println(a == b); // true, because values are the same

        // == with objects (reference comparison)
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);  // false, because they are different objects

        // equals() with objects (content comparison)
        System.out.println(s1.equals(s2));  // true, because the content is the same

        // == with String literals
        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(s3 == s4);  // true, because both point to the same literal in the string pool
        System.out.println(s3.equals(s4)); // true, because the content is the same
    }
}

