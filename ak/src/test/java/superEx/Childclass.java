package superEx;

public class Childclass extends GrandChild {
	
	public Childclass(int a) {
    super(a); // Call the constructor of C
}

	// add method in Class B
	public int add() {
	    this.a = this.a + 1;
	    return a;
	}
}
			 
