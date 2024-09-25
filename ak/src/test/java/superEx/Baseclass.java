package superEx;

public class Baseclass extends Childclass {

	// Constructor of Class A
	public Baseclass(int a) {
		super(a); // Explicitly call the parameterized constructor of B
	}

	public static void main(String[] args) {
		Childclass cc = new Childclass(3); // Create an instance of B
		System.out.println("Calling add method of Class B: " + cc.add());
		System.out.println("Calling mul method of Class C: " + cc.mul());
	}
}

//Class B has a parameterized constructor and Class A is extending B. class A will try to invoke default constructor for Class B because
//Class A is extending Class B. But class B does not have any default constructor for Class B so Class A will give error "Implicit super constructor B() is undefined for default constructor. Must define an explicit constructor"




