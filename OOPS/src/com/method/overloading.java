package com.method;

class Addition {
	 
    // Method 1
    // Adding two integer values
    public int add(int a, int b)
    {
 
        int sum = a + b;
        return sum;
    }
 
    // Method 2
    // Adding three integer values
    public int add(int a, int b, int c)
    {
 
        int sum = a + b + c;
        return sum;
    }
}

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		int r1=obj.add(3, 4);
		int r2=obj.add(2, 4, 8);
		System.out.println(r1);
		System.out.println(r2);
		

	}

}
