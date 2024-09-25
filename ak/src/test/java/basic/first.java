package basic;

public class first {
    public static void main(String a[]) {
        int r;
        
        Calc C = new Calc("amit", 2); // Calls the parameterized constructor
        

       // System.out.println("name: " + C.);  // Outputs: Sum: 15
        
        Calc A = new Calc(); // Calls the default constructor
        r = A.sum(2, 5);
        System.out.println("Result :" + r);
        
        A.show();
        
        Calc1 B = new Calc1(); // Calls Calc1 constructor, which also calls Calc's default constructor
        B.print();
        B.newprint();
        B.show(); // Calls Calc1's show, which also calls Calc's show
        
        abstractex calculator = new cal();
        
        int sum = calculator.add(10, 5);  // Calls the implemented add method
        int division = calculator.div(10, 2);  // Calls the div method from abstractex

        System.out.println("Sum: " + sum);  // Outputs: Sum: 15
        System.out.println("Division: " + division);  // Outputs: Division: 5
    }
}
