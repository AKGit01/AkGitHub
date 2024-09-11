package Basic;

public class Calc {

    private String name;
    private int number;
    // Static variable
    public static int counter = 0;

    // Default constructor
    public Calc() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Calc(String name, int number) {
        this.name = name;
        this.number = number;
        System.out.println("Parameterized constructor called: " + name + ", " + number);
    }

    public int sum(int a, int b) {
        return (a + b);
    }

    public int sum(int a, int b, int c) {
        return (a + b + c);  // Overloading
    }

    public void show() {
        System.out.println("Calc show method called");
    }
}

class Calc1 extends Calc {

    public Calc1() {
        super(); // This calls the default constructor of Calc
        System.out.println("class Calc1 constructor called");
    }

    public void print() {
        System.out.println("Calc1 print method called");
    }

    public void newprint() {
        System.out.println("Calc1 newprint method called");
    }

    @Override
    public void show() {
        super.show(); // Optionally call the superclass method
        System.out.println("Calc1 show method called");
    }
}


