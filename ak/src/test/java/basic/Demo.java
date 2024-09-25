package basic;
class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop Model: " + model + ", Price: " + price;
    }
}

public class Demo {
    public static void main(String[] a) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;
        System.out.println(obj); // Now this will print a meaningful output.
    }
}
